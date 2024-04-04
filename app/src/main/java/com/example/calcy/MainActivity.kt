package com.example.calcy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvInput:TextView?=null
    private var lastdigit :Boolean=false
    private var lastdot :Boolean=false
    private var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput=findViewById(R.id.tvInput)
    }
    fun onDigit(view:View)
    {
        tvInput?.append((view as Button).text)
        lastdigit=true
        lastdot=false
    }
    fun onClear(view: View)
    {
        tvInput?.text=""
    }
    fun onDot(view: View)
    {
        if(lastdigit && !lastdot && count<1){
            tvInput?.append(".")
            lastdigit=false
            lastdot =true
            count=1
        }
    }
    fun onOperator(view: View)
    {
    tvInput?.text?.let { if(lastdigit && !isOperatorAdded(it.toString())){
        tvInput?.append((view as Button).text)
    }
    }
    }
    fun isOperatorAdded(value: String):Boolean
    {
        return if(value.startsWith("-")){false}
        else
        {
            value.contains("/")
                    ||value.contains("+")
                    ||value.contains("*")
                    ||value.contains("-")
        }
    }
    fun onEqual(view: View)
    {
        if(lastdigit)
        {   var tvValue=tvInput?.text.toString()
            var prefix=""
            try {   if(tvValue.startsWith("-"))
            {
                prefix="-"
                tvValue=tvValue.substring(1)
            }

                  if (tvValue.contains("-"))
                  {
                      val tvsplitvalue=tvValue.split("-")
                      var one=tvsplitvalue[0]
                      var two=tvsplitvalue[1]
                      if(prefix.isNotEmpty()){one= prefix+one}
                      tvInput?.text=(one.toDouble()-two.toDouble()).toString()
                  }
                else if (tvValue.contains("+"))
                  {
                      val tvsplitvalue=tvValue.split("+")
                      var one=tvsplitvalue[0]
                      var two=tvsplitvalue[1]
                      if(prefix.isNotEmpty()){one= prefix+one}
                      tvInput?.text=(one.toDouble()+two.toDouble()).toString()
                  }
                else if (tvValue.contains("/"))
                  {
                      val tvsplitvalue=tvValue.split("/")
                      var one=tvsplitvalue[0]
                      var two=tvsplitvalue[1]
                      if(prefix.isNotEmpty()){one= prefix+one}
                      tvInput?.text=(one.toDouble()/two.toDouble()).toString()
                  }
                else if (tvValue.contains("*"))
                  {
                      val tvsplitvalue=tvValue.split("*")
                      var one=tvsplitvalue[0]
                      var two=tvsplitvalue[1]
                      if(prefix.isNotEmpty()){one= prefix+one}
                      tvInput?.text=(one.toDouble()*two.toDouble()).toString()
                  }
            }
            catch (e:java.lang.ArithmeticException)
            {
                e.printStackTrace()
            }
        }
    }
}