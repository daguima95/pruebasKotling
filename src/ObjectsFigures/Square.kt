package ObjectsFigures

class Square (x:Int, y:Int, var side:Int): Figures(x, y){

    fun calcArea(): Int{

        return side*2

    }

    fun calcPerimeter(): Int{

        return side*4
    }



}