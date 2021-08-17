package com.example.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetAge.setOnClickListener {

            val userDob = etDob.text.toString();
            if(userDob.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR);
                val age = year-userDob.toInt();
                var output = ""
                when(age){
                    in 0..17 -> {
                            output="Underage"
                    }
                    in 16..65 -> {
                        output="Youth/Young People"
                    }
                    in 66..79 -> {
                        output="middle-aged"
                    }
                    in 80..99 -> {
                        output="elderly/senior"
                    }
                    else -> output= "long-lived elderly"

                }


                tvShowAge.text="your age is $age";
                tvCategoryAge.text=output;
            }
            else{
                Toast.makeText(this,"Please enter your birth year",Toast.LENGTH_SHORT).show();

            }



        }



    }
}