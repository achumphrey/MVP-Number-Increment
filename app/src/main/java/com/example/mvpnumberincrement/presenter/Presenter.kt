package com.example.mvpnumberincrement.presenter

import com.example.mvpnumberincrement.PresenterInterface
import com.example.mvpnumberincrement.ViewInterface
import com.example.mvpnumberincrement.model.ModelClass

class Presenter(_view: ViewInterface?): PresenterInterface {

    var view: ViewInterface? = _view
    var modelClass = ModelClass()

    override fun incrementNumber() {
        modelClass.incrementNumber()
   //     view?.showSuccess()
    }

    override fun getModelNumber(): Int {
        return modelClass.getNumber()
    }

    override fun onDestroy() {
        view = null
    }

}