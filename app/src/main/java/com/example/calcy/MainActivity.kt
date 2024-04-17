**Folder Name: com.example.calcy**

**File Name: MainActivity.kt**

```kotlin
// Folder Name: com.example.calcy
// File Name: MainActivity.kt

package com.example.calcy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Variables to keep track of the state of the calculator
    private var tvInput: TextView? = null // Variable to keep track of the input text view
    private var lastdigit: Boolean = false // Flag to indicate if the last input was a digit
    private var lastdot: Boolean = false // Flag to indicate if the last input was a dot
    private var count = 0 // Variable to keep track of the number of dots

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the view for the text view by its id R.id.tvInput and initialize tvInput
        tvInput = findViewById(R.id.tvInput)
    }

    fun onDigit(view: View) {
        // Appends the text of the button to the text view
        tvInput?.append((view as Button).text)

        // Sets the last digit flag to true
        lastdigit = true

        // Sets the last dot flag to false
        lastdot = false
    }
    // Function to handle digit buttons (0-9)

    fun onClear(view: View) {
       // Clears the text view
        tvInput?.text = ""
    }
    // Function to handle clear button

    fun onDot(view: View) {
        // Checks if the last input was a digit, the last input was not a dot, and the number of dots is less than 1
        if (lastdigit && !lastdot && count < 1) {
           // Appends a dot to the text view
            tvInput?.append(".")

            // Sets the last digit flag to false
            lastdigit = false

            // Sets the last dot flag to true
            lastdot = true

            // Increments the number of dots
            count++
        }
    }
    // Function to handle dot button

    fun onOperator(view: View) {
        // Gets the text of the text view
        tvInput?.text?.let {
            // Checks if the last input was a digit and there is no operator added yet
            if (lastdigit && !isOperatorAdded(it.toString())) {
                // Appends the text of the button to the text view
                tvInput?.append((view as Button).text)
            }
        }
    }
    // Function to handle operator buttons (+, -, *, /)

    fun isOperatorAdded(value: String): Boolean {
        // Returns true if the value starts with a minus sign or contains any of the following operators: /, +, *, -
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") || value.contains("+") || value.contains("*") || value.contains("-")
        }
    }
    // Function to check if an operator is already added

    fun onEqual(view: View) {
        // Checks if the last input was a digit
        if (lastdigit) {
            // Gets the text of the text view
            var tvValue = tvInput?.text.toString()

            // Initializes a prefix variable to store the sign of the number (if any)
            var prefix = ""

            try {
                // Checks if the number starts with a minus sign
                if (tvValue.startsWith("-")) {
                    // Sets the prefix to minus (-) and removes the minus sign from the number
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }

                // Checks if the number contains a minus sign
                if (tvValue.contains("-")) {
                    // Splits the number into two parts at the minus sign
                    val tvSplitValue = tvValue.split("-")

                    // Gets the first part of the number (before the minus sign)
                    var one = tvSplitValue[0]

                    // Gets the second part of the number (after the minus sign)
                    var two = tvSplitValue[1]

                    // Adds the prefix to the first part of the number (if necessary)
                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    // Sets the text of the text view to the result of subtracting the second part from the first part
                    tvInput?.text = (one.toDouble() - two.toDouble()).toString()
                } else if (tvValue.contains("+")) {
                    // Splits the number into two parts at the plus sign
                    val tvSplitValue = tvValue.split("+")

                    // Gets the first part of the number (before the plus sign)
                    var one = tvSplitValue[0]

                    // Gets the second part of the number (after the plus sign)
                    var two = tvSplitValue[1]

                    // Adds the prefix to the first part of the number (if necessary)
                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    // Sets the text of the text view to the result of adding the second part to the first part
                    tvInput?.text = (one.toDouble() + two.toDouble()).toString()
                } else if (tvValue.contains("/")) {
                    // Splits the number into two parts at the division sign
                    val tvSplitValue = tvValue.split("/")

                    // Gets the first part of the number (before the division sign)
                    var one = tvSplitValue[0]

                    // Gets the second part of the number (after the division sign)
                    var two = tvSplitValue[1]

                    // Adds the prefix to the first part of the number (if necessary)
                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    // Sets the text of the text view to the result of dividing the first part by the second part
                    tvInput?.text = (one.toDouble() / two.toDouble()).toString()
                } else if (tvValue.contains("*")) {
                    // Splits the number into two parts at the multiplication sign
                    val tvSplitValue = tvValue.split("*")

                    // Gets the first part of the number (before the multiplication sign)
                    var one = tvSplitValue[0]

                    // Gets the second part of the number (after the multiplication sign)
                    var two = tvSplitValue[1]

                    // Adds the prefix to the first part of the number (if necessary)
                    if (prefix.isNotEmpty()) {
                        one = prefix + one
                    }

                    // Sets the text of the text view to the result of multiplying the first part by the second part
                    tvInput?.text = (one.toDouble() * two.toDouble()).toString()
                }
            } catch (e: java.lang.ArithmeticException) {
                // Catches any arithmetic exceptions (e.g., division by zero) and prints the stack trace
                e.printStackTrace()
            }
        }
    }
   // Function to handle equal button
}
```