package com.example.mvpnumberincrement.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpnumberincrement.R
import com.example.mvpnumberincrement.ViewInterface
import com.example.mvpnumberincrement.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewInterface {

    private lateinit var presenter: Presenter

    override fun showSuccess() {
        Toast.makeText(this,"Number is being incremented"
            ,Toast.LENGTH_SHORT)
            .show()
    }

    override fun hideProgress() {
    }

    override fun showError() {
    }

    override fun onIncrement() {
       presenter.incrementNumber()
       tv_display.text = presenter.getModelNumber() .toString()

       showSuccess()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)

        tv_display.text = presenter.getModelNumber().toString()

        btn_number.setOnClickListener {
            onIncrement()
        }
    }
}
