**Folder Name:** test

**File Name:** MainActivity.java

**Line by Line Documented Code:**

```java
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1EditText;
    private EditText operand2EditText;
    private TextView resultTextView;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);
        resultTextView = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                double result = operand1 + operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                double result = operand1 - operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                double result = operand1 * operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                double result = operand1 / operand2;
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}
```