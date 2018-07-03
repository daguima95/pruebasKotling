import ObjectsFigures.Square
import java.util.*

class Functions(){
    
    fun generateRandomSquare(): Square{
        var x = (0 .. 20).random()
        var y = (0 .. 20).random()
        var side = (0..50).random()
        var square = Square(x,y, side)
        return square
    }

    fun ClosedRange<Int>.random()=
            Random().nextInt((endInclusive + 1)- start) + start

}