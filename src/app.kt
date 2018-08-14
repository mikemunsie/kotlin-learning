import com.github.munstrocity.kotlinlearning.examples.debug.printResults
import com.github.munstrocity.kotlinlearning.examples.examples.destructuringExample.DestructuringExample
import com.github.munstrocity.kotlinlearning.examples.examples.mutableMapExample.MutableMapExample
import com.github.munstrocity.kotlinlearning.examples.examples.switchCaseExample.SwitchCaseExample
import com.github.munstrocity.kotlinlearning.examples.examples.ternaryExample.TernaryExample
import com.github.munstrocity.kotlinlearning.examples.examples.tryCatchExample.TryCatchExample
import com.github.munstrocity.kotlinlearning.examples.examples.typeCheckingExample.TypeCheckingExample

fun main(args: Array<String>) {
    printResults(listOf(
            DestructuringExample(),
            MutableMapExample(),
            SwitchCaseExample(),
            TernaryExample(),
            TryCatchExample(),
            TypeCheckingExample()
    ))
}
