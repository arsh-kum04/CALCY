**Folder Name:** test

**File Name:** MainActivity.java

// This is the main activity of the application. It handles the user interface and the basic functionality of the calculator.
public class MainActivity extends AppCompatActivity {

    // These are the EditText widgets that the user will use to input the operands.
    // **Line 12**: Declares the instance variables operand1EditText and operand2EditText as EditText widgets. 
    private EditText operand1EditText;
    private EditText operand2EditText;

    // This is the TextView widget that will display the result of the calculation.
    // **Line 16**: Declares the instance variable resultTextView as a TextView widget. 
    private TextView resultTextView;

    // These are the Button widgets that the user will use to perform the different operations.
    // **Line 20**: Declares the instance variables addButton, subtractButton, multiplyButton, and divideButton as Button widgets. 
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
        // **Line 27**: Uses the findViewById() method to find the EditText widget with the ID operand1EditText and assigns it to the instance variable operand1EditText.
        // **Line 28**: Uses the findViewById() method to find the EditText widget with the ID operand2EditText and assigns it to the instance variable operand2EditText.
        // **Line 29**: Uses the findViewById() method to find the TextView widget with the ID resultTextView and assigns it to the instance variable resultTextView.
        // **Line 30**: Uses the findViewById() method to find the Button widget with the ID addButton and assigns it to the instance variable addButton.
        // **Line 31**: Uses the findViewById() method to find the Button widget with the ID subtractButton and assigns it to the instance variable subtractButton.
        // **Line 32**: Uses the findViewById() method to find the Button widget with the ID multiplyButton and assigns it to the instance variable multiplyButton.
        // **Line 33**: Uses the findViewById() method to find the Button widget with the ID divideButton and assigns it to the instance variable divideButton.

        // These lines add listeners to the buttons. When a button is clicked, the corresponding method will be called.
        // **Line 36**: Adds an OnClickListener to the addButton. When the addButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 37**: Adds an OnClickListener to the subtractButton. When the subtractButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 38**: Adds an OnClickListener to the multiplyButton. When the multiplyButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 39**: Adds an OnClickListener to the divideButton. When the divideButton is clicked, the onClick() method of the OnClickListener will be called.
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the add button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 43**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 44**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the addition operation and stores it in a double variable.
                // **Line 47**: Calculates the sum of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 + operand2;
                // This line sets the text of the result TextView to the result of the addition operation.
                // **Line 49**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the subtract button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 55**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 56**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the subtraction operation and stores it in a double variable.
                // **Line 59**: Calculates the difference of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 - operand2;
                // This line sets the text of the result TextView to the result of the subtraction operation.
                // **Line 61**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the multiply button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 67**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 68**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the multiplication operation and stores it in a double variable.
                // **Line 71**: Calculates the product of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 * operand2;
                // This line sets the text of the result TextView to the result of the multiplication operation.
                // **Line 73**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This method is called when the divide button is clicked.
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 79**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 80**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the division operation and stores it in a double variable.
                // **Line 83**: Calculates the quotient of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 / operand2;
                // This line sets the text of the result TextView to the result of the division operation.
                // **Line 85**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}