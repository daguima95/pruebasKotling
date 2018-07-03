package ObjectsFigures

import kotlin.math.PI

class Circle(x:Int, y:Int, var radius:Int): Figures(x,y){

    fun calcArea():Double{
        return PI*(radius*radius)
    }

    fun calcPerimeter(): Double{

        return  2*PI*radius
    }

}