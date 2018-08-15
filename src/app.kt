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
    printResult("Sum", sum(intArrayOf(1, 2, 3, 4, 5)).toString())
    printResult("maxIndex (10,20,20,60,40)", maxIndex(intArrayOf(10, 20, 20, 60, 40)).toString())
    printResult("runs (1,0,1,1,1,2,0,0,0,0,0,0,0)", runs(intArrayOf(1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0)).toString())
    printResult("isPalindrome(\"madam\")", isPalindrome("madam").toString())
    printResult("findPairless(1,1,2,3,3,3,3)", findPairless(intArrayOf(1,1,2,3,3,3,3)).toString())
}
