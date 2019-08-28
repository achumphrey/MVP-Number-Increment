package com.example.mvpnumberincrement

interface PresenterInterface{

    fun getModelNumber(): Int
    fun incrementModelNumber()
    fun onDestroy()
}