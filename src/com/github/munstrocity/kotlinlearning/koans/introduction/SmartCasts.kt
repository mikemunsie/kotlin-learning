package com.github.munstrocity.kotlinlearning.koans.introduction

private fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun smartCastsEval (): Int =
        eval(
                Sum(
                        Sum(
                                Num(10),
                                Num(20)
                        ),
                        Sum(
                                Num(10),
                                Num(50)
                        )
                )
        )