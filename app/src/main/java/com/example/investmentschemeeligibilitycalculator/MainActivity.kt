package com.example.investmentschemeeligibilitycalculator

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c:Calendar = Calendar.getInstance();
        val mYear = c.get(Calendar.YEAR);
        val mMonth = c.get(Calendar.MONTH);
        val mDay = c.get(Calendar.DAY_OF_MONTH);
       var d1 = 0
       txtDOB.setOnClickListener(){
           val dpd = DatePickerDialog( this,

               DatePickerDialog.OnDateSetListener{
                   view, year, monthOfYear, dayOfMonth ->
                   txtDOB.setText("%d-%d-%d".format(dayOfMonth, monthOfYear,year))
                   d1 = year;
               }, mYear,mMonth, mDay)
           dpd.show()
       }
        btnOk.setOnClickListener(){
            val c:Calendar = Calendar.getInstance();
            val age =mYear - d1
            textView6.text = age.toString()
            var invest : Double = 0.0
            if(age >=16 && age <= 20)
            {
                textView7.text = "5000"
                invest = 5000*0.3
                textView8.text = invest.toString()
            }
            else if(age >=21 && age <= 25)
            {
                textView7.text = "14000"
                invest = 14000*0.3
                textView8.text = invest.toString()
            }
            else if(age >=26 && age <= 30)
            {
                textView7.text = "29000"
                invest = 29000*0.3
                textView8.text = invest.toString()

            }
            else if(age >=31 && age <= 35)
            {
                textView7.text = "50000"
                invest = 50000*0.3
                textView8.text = invest.toString()

            }else if(age >=36 && age <= 40)
            {
                textView7.text = "78000"
                invest = 78000*0.3
                textView8.text = invest.toString()

            }else if(age >=41 && age <= 45)
            {
                textView7.text = "116000"
                invest = 116000*0.3
                textView8.text = invest.toString()

            }else if(age >=46 && age <= 50)
            {
                textView7.text = "165000"
                invest = 165000*0.3
                textView8.text = invest.toString()

            }
            else if(age >=51 && age <= 55)
            {
                textView7.text = "228000"
                invest = 228000*0.3
                textView8.text = invest.toString()

            }
//
        }
        btnReset.setOnClickListener(){
            textView8.text = ""
            textView7.text = ""
            textView6.text = ""
            txtDOB.text = "select"
        }
    }
}

