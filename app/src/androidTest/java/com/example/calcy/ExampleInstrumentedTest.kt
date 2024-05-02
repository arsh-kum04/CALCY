**Folder Name:** test

**File Name:** MainActivity.java

```java
// This is the main activity of the application. It handles the user interface and the basic functionality of the calculator.
public class MainActivity extends AppCompatActivity {

    // These are the EditText widgets that the user will use to input the operands.
    private EditText operand1EditText;
    private EditText operand2EditText;

    // This is the TextView widget that will display the result of the calculation.
    private TextView resultTextView;

    // These are the Button widgets that the user will use to perform the different operations.
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // This method is called when the activity is first created.
        super.onCreate(savedInstanceState);
        // This line sets the layout of the activity.
        setContentView(R.layout.activity_main);

        // These lines find the EditText, TextView, and Button widgets by their IDs.
        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);
        resultTextView = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);

        // These lines add listeners to the buttons. When a button is clicked, the corresponding method will be called.
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the add button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the addition operation and stores it in a double variable.
                double result = operand1 + operand2;
                // This line sets the text of the result TextView to the result of the addition operation.
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the subtract button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the subtraction operation and stores it in a double variable.
                double result = operand1 - operand2;
                // This line sets the text of the result TextView to the result of the subtraction operation.
                resultTextView.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the multiply button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the multiplication operation and stores it in a double variable.
                double result = operand1 * operand2;
                // This line sets the text of the result TextView to the result of the multiplication operation.
                resultTextView.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the divide button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the division operation and stores it in a double variable.
                double result = operand1 / operand2;
                // This line sets the text of the result TextView to the result of the division operation.
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}
```