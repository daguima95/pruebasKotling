package ObjectsFigures

import java.util.*

open class Figures(var x:Int, var y:Int){

    fun ClosedRange<Int>.random()=
            Random().nextInt((endInclusive + 1)- start) + start
}