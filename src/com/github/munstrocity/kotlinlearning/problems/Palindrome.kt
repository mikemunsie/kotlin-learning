/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package com.github.munstrocity.kotlinlearning.problems

fun isPalindrome(s: String): Boolean {
    return s.reversed() == s
}