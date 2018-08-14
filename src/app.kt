import com.github.munstrocity.kotlinlearning.debug.printResults
import com.github.munstrocity.kotlinlearning.examples.destructuringExample.DestructuringExample
import com.github.munstrocity.kotlinlearning.examples.lazyExample.LazyExample
import com.github.munstrocity.kotlinlearning.examples.mutableMapExample.MutableMapExample
import com.github.munstrocity.kotlinlearning.examples.observableExample.ObservableExample
import com.github.munstrocity.kotlinlearning.examples.switchCaseExample.SwitchCaseExample
import com.github.munstrocity.kotlinlearning.examples.ternaryExample.TernaryExample
import com.github.munstrocity.kotlinlearning.examples.tryCatchExample.TryCatchExample
import com.github.munstrocity.kotlinlearning.examples.typeCheckingExample.TypeCheckingExample

fun main(args: Array<String>) {
    printResults(listOf(
            DestructuringExample(),
            LazyExample(),
            MutableMapExample(),
            ObservableExample(),
            SwitchCaseExample(),
            TernaryExample(),
            TryCatchExample(),
            TypeCheckingExample()
    ))
}
