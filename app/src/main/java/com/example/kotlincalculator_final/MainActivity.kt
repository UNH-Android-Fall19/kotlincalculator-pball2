package com.example.kotlincalculator_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var operation = " "
    var oldNumber = ""
    var newOp = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    Button events so when the user clicks on a button it will register
    a string number.
     */
    fun buttonEvents(v: View) {
        newOp = false
        val buttonSelect = v as Button
        var buttonClick: String = textView.text.toString()
        when (buttonSelect.id) {
            buttonOne.id -> { buttonClick += "1" }
            buttonTwo.id -> { buttonClick += "2" }
            buttonThree.id -> { buttonClick += "3" }
            buttonFour.id -> { buttonClick += "4" }
            buttonFive.id -> { buttonClick += "5" }
            buttonSix.id -> { buttonClick += "6" }
            buttonSeven.id -> { buttonClick += "7" }
            buttonEight.id -> { buttonClick += "8" }
            buttonNine.id -> { buttonClick += "9" }
            buttonZero.id -> { buttonClick += "0" }
            buttonPlus.id -> { buttonClick += "+" }
            buttonMinus.id -> { buttonClick += "-" }
            buttonMultiply.id -> { buttonClick += "*" }
            buttonDiv.id -> { buttonClick += "/" }
        }
        textView.setText(buttonClick)
    }
    // Clear Function to clear any variabls
    fun buttonOperationClear(v: View) {
        textView.setText(" ")
        newOp = false
    }
    // Addition Operaotr
    fun buttonOperationPlus(v: View) {
        var select = v as Button
        when (select.id) {
            buttonPlus.id -> {
                operation = "+"
            }
        }
        oldNumber = textView.text.toString()
        newOp = true
        textView.setText(" ")
    }
    //Subtraction Operator
    fun buttonOperationMinus(v: View) {
        var select = v as Button
        when (select.id) {
            buttonMinus.id -> {
                operation = "-"
            }
        }
        oldNumber = textView.text.toString()
        newOp = true
        textView.setText(" ")
    }
    // Multiply Operaotr
    fun buttonOperationMultiply(v: View) {
        var select = v as Button
        when (select.id) {
            buttonMultiply.id -> {
                operation = "*"
            }
        }
        oldNumber = textView.text.toString()
        newOp = true
        textView.setText(" ")
    }
    // Division Operator
    fun buttonOperationDiv(v: View) {
        var select = v as Button
        when (select.id) {
            buttonDiv.id -> {
                operation = "/"
            }
        }
        oldNumber = textView.text.toString()
        newOp = true
        textView.setText(" ")
    }
    //Equal Operator
    fun buttonOperationEqual(v: View) {
        val number = textView.text.toString()
        var finNumber: Double? = null
        when (operation) {
            "+" -> { finNumber = oldNumber.toDouble() + number.toDouble () }
            "-" -> { finNumber = oldNumber.toDouble() - number.toDouble() }
            "*" -> { finNumber = oldNumber.toDouble() * number.toDouble() }
            "/" -> { finNumber = oldNumber.toDouble() / number.toDouble() }
        }
        textView.setText(finNumber.toString())
        newOp = true
    }
}

