package ObjectsFigures

import java.lang.Math.PI

class Circle(x:Int, y:Int, var radius:Int): Figures(x,y){

    fun calcArea():Double{
        return PI*(radius*radius)
    }

    fun calcPerimeter(): Double{

        return  2*PI*radius
    }

    fun generateRandomCircle(): Circle{
        val x = (0 .. 20).random()
        val y = (0 .. 20).random()
        val radius = (0 .. 50).random()
        val circle = Circle(x, y, radius)
        return circle

    }

    fun createCircleList(number:Int):ArrayList<Circle>{

        var circleList = ArrayList<Circle>()
        var aux = number
        while(aux>=0){
            circleList.add(generateRandomCircle())
            aux--
        }
        return circleList
    }
    fun calcCircleListPerimeter(circleList: ArrayList<Circle>):ArrayList<Double>{

        var perimeterList = ArrayList<Double>()
        for(circle in circleList){
            perimeterList.add(circle.calcPerimeter())
        }
        return perimeterList
    }

    fun calcCircleListArea(circleList: ArrayList<Circle>): ArrayList<Double>{

        var areaList = ArrayList<Double>()
        for(circle in circleList){
            areaList.add(circle.calcArea())
        }
        return areaList
    }

    fun getBiggestPerimeter(perimeterList: ArrayList<Double>):Double{

        var maxPerimeter =  perimeterList.max()
        if(maxPerimeter != null) return maxPerimeter

        return -1.0

    }

    fun getBiggestArea(areaList: ArrayList<Double>):Double{

        var maxArea = areaList.max()
        if(maxArea != null) return maxArea

        return -1.0

    }

    fun getMinPerimeter(perimeterList: ArrayList<Double>):Double{
        var minPerimeter = perimeterList.min()
        if(minPerimeter != null) return minPerimeter

        return -1.0
    }

    fun getMinArea(areaList: ArrayList<Double>):Double{

        var minArea = areaList.min()
        if(minArea != null) return minArea

        return -1.0
    }
}