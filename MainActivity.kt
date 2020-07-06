package com.example.myapplication

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

        var plusIsActive: Boolean = false

        var minusIsActive: Boolean = false

        var multiplyIsActive: Boolean = false

        var divisionIsActive: Boolean = false

        var firstCharacter: String = ""

        var secondCharacter: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        buttonEqualTo.setOnClickListener(){

            val int1 = firstCharacter.toInt()

            val int2 = secondCharacter.toInt()

            if (plusIsActive == true){

                val total = int1 + int2

                textView1.setText(total.toString()).toString()
            }
            else if (minusIsActive == true){

                val total = int1 - int2

                textView1.setText(total.toString()).toString()
            }
            else if (multiplyIsActive == true){

                var total = int1 * int2

                textView1.setText(total.toString()).toString()

            }
            else if (divisionIsActive == true){

                var total = int1/int2

                textView1.setText(total.toString()).toString()
            }

        }

        buttonClear.setOnClickListener(){

            editText.setText("")

            textView1.setText("Output")

            firstCharacter = ""

            secondCharacter = ""

            divisionIsActive = false

            multiplyIsActive = false

            plusIsActive = false

            minusIsActive = false
        }


        button1.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "1"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "1"
            }
            else{
                secondCharacter = "1"
            }
        }

        button2.setOnClickListener(){


            val inputValue: String = editText.text.toString() + "2"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "2"
            }
            else{
                secondCharacter = "2"
            }
        }

        button3.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "3"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "3"
            }
            else{
                secondCharacter = "3"
            }

        }

        button4.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "4"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "4"
            }
            else{
                secondCharacter = "4"
            }

        }

        button5.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "5"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "5"
            }
            else{
                secondCharacter = "5"
            }

        }

        button6.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "6"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "6"
            }
            else{
                secondCharacter = "6"
            }

        }

        button7.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "7"

           editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "7"
            }
            else{
                secondCharacter = "7"
            }

        }

        button8.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "8"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "8"
            }
            else{

                secondCharacter = "8"
            }

        }

        button9.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "9"

            editText.setText(inputValue).toString()

            if ( firstCharacter.count() == 0){

                firstCharacter = "9"
            }
            else{
                secondCharacter = "9"
            }

        }

        buttonPlus.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "+"

            editText.setText(inputValue).toString()

            divisionIsActive = false

            multiplyIsActive = false

            plusIsActive = true

            minusIsActive = false
        }

        buttonMinus.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "-"

            editText.setText(inputValue).toString()

            divisionIsActive = false

            multiplyIsActive = false

            plusIsActive = false

            minusIsActive = true
        }

        buttonMul.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "*"

            editText.setText(inputValue).toString()

            divisionIsActive = false

            multiplyIsActive = true

            plusIsActive = false

            minusIsActive = false
        }


        buttonDiv.setOnClickListener(){

            val inputValue: String = editText.text.toString() + "/"

            editText.setText(inputValue).toString()

            divisionIsActive = true

            multiplyIsActive = false

            plusIsActive = false

            minusIsActive = false
        }

    }

}