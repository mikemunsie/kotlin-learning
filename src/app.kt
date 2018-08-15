import com.github.munstrocity.kotlinlearning.debug.printResult
import com.github.munstrocity.kotlinlearning.debug.printResults
import com.github.munstrocity.kotlinlearning.examples.callbacksExample.CallbacksExample
import com.github.munstrocity.kotlinlearning.examples.destructuringExample.DestructuringExample
import com.github.munstrocity.kotlinlearning.examples.lazyExample.LazyExample
import com.github.munstrocity.kotlinlearning.examples.mutableMapExample.MutableMapExample
import com.github.munstrocity.kotlinlearning.examples.observableExample.ObservableExample
import com.github.munstrocity.kotlinlearning.examples.switchCaseExample.SwitchCaseExample
import com.github.munstrocity.kotlinlearning.examples.ternaryExample.TernaryExample
import com.github.munstrocity.kotlinlearning.examples.tryCatchExample.TryCatchExample
import com.github.munstrocity.kotlinlearning.examples.typeCheckingExample.TypeCheckingExample
import com.github.munstrocity.kotlinlearning.koans.introduction.*
import com.github.munstrocity.kotlinlearning.problems.*

fun main(args: Array<String>) {

    // Examples
    printResults(listOf(
            CallbacksExample(),
            DestructuringExample(),
            LazyExample(),
            MutableMapExample(),
            ObservableExample(),
            SwitchCaseExample(),
            TernaryExample(),
            TryCatchExample(),
            TypeCheckingExample()
    ))

    // Problems
    println("\nCustom Problems")
    println("==============================")
    printResult("Sum", sum(intArrayOf(1, 2, 3, 4, 5)))
    printResult("maxIndex (10,20,20,60,40)", maxIndex(intArrayOf(10, 20, 20, 60, 40)))
    printResult("runs (1,0,1,1,1,2,0,0,0,0,0,0,0)", runs(intArrayOf(1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0)))
    printResult("isPalindrome(\"madam\")", isPalindrome("madam"))
    printResult("findPairless(1,1,2,3,3,3,3)", findPairless(intArrayOf(1,1,2,3,3,3,3)))

    // Koans
    println("\nKoans")
    println("==============================")
    printResult("NamedArguments", namedArgumentsExample(listOf("a", "b", "c")))
    printResult("Default Arguments", defaultArgumentsExample())
    printResult("Lambda: containsEven", lambdaContainsEven(listOf(1, 2, 3, 4)))
    printResult("Lambda: sum", lambdaSum(1, 4))
    printResult("Strings: stringsPattern1", stringsPattern1("13 JUN 1992"))
    printResult("DataClass getPeople", dataClassGetPeople())
    printResult("SmartCasts", smartCastsEval())

}
