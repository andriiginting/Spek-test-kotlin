package com.example.andriginting.spek

class ImpPresenter(val view: ShapeContract.View): ShapeContract.Presenter {

    override fun calculateShape(height: Int, width: Int){
        val result = height*width

        view.showResult(result)
        view.emptyField()
    }
}