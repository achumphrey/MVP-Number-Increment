package com.example.mvpnumberincrement

interface PresenterInterface{

    fun getModelNumber(): Int
    fun incrementNumber()
    fun onDestroy()
}