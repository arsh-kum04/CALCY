**Folder Name:** com.example.calcy

**File Name:** MainActivity.java
```
// Package declaration
package com.example.calcy;

// Importing necessary libraries
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This is the main activity class for the Calculator application.
 */
public class MainActivity extends AppCompatActivity {

    // Declaring UI elements
    private EditText num1EditText;
    private EditText num2EditText;
    private Button addButton;
    private Button subButton;
    private Button mulButton;
    private Button divButton;
    private TextView resultTextView;

    /**
     * This method is called when the activity is created.
     *
     * @param savedInstanceState The saved instance state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI elements
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        mulButton = findViewById(R.id.mulButton);
        divButton = findViewById(R.id.divButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set click listeners for the buttons
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from the edit texts and convert them to integers
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                // Add the numbers and display the result
                int result = num1 + num2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from the edit texts and convert them to integers
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                // Subtract the second number from the first and display the result
                int result = num1 - num2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from the edit texts and convert them to integers
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                // Multiply the numbers and display the result
                int result = num1 * num2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the numbers from the edit texts and convert them to integers
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                // Avoid dividing by zero and display error if necessary
                if (num2 == 0) {
                    resultTextView.setText("Error: Division by zero");
                } else {
                    // Divide the first number by the second and display the result
                    int result = num1 / num2;
                    resultTextView.setText(String.valueOf(result));
                }
            }
        });
    }
}
```