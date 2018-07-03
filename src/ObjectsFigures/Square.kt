package ObjectsFigures

import org.jetbrains.annotations.Nullable

class Square (x:Int, y:Int, var side:Int): Figures(x, y){

    fun calcArea(): Int{

        return side*2

    }

    fun calcPerimeter(): Int{

        return side*4
    }


    fun generateRandomSquare(): Square{
        val x = (0 .. 20).random()
        val y = (0 .. 20).random()
        val side = (0..50).random()
        val square = Square(x,y, side)
        return square
    }



    fun createSquareList(number:Int):ArrayList<Square>{

        var squareList = ArrayList<Square>()
        var aux = number
        while(aux>=0){
            squareList.add(generateRandomSquare())
            aux--
        }
        return squareList
    }

    fun calcSquareListPerimeter(squareList: ArrayList<Square>):ArrayList<Int>{

        var perimeterList = ArrayList<Int>()
        for(square in squareList){
            perimeterList.add(square.calcPerimeter())
        }
        return perimeterList
    }

    fun calcSquareListArea(squareList: ArrayList<Square>): ArrayList<Int>{

        var areaList = ArrayList<Int>()
        for(square in squareList){
            areaList.add(square.calcArea())
        }
        return areaList
    }

    fun getBiggestPerimeter(perimeterList: ArrayList<Int>):Int{

        var maxPerimeter =  perimeterList.max()
        if(maxPerimeter != null) return maxPerimeter

        return -1

    }

    fun getBiggestArea(areaList: ArrayList<Int>):Int{

        var maxArea = areaList.max()
        if(maxArea != null) return maxArea

        return -1

    }

    fun getMinPerimeter(perimeterList: ArrayList<Int>):Int{
        var minPerimeter = perimeterList.min()
        if(minPerimeter != null) return minPerimeter

        return -1
    }

    fun getMinArea(areaList: ArrayList<Int>):Int{

        var minArea = areaList.min()
        if(minArea != null) return minArea

        return -1
    }
}