package com.example.andriginting.spek

class ShapeContract {
    interface Presenter{
        fun calculateShape(height: Int, width: Int)
    }

    interface View{
        fun showResult(result: Int)

        fun emptyField()
    }
}