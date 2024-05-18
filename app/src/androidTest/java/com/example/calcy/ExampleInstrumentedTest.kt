**Folder Name:** test

**File Name:** MainActivity.java

// This is the main activity of the application. It handles the user interface and the basic functionality of the calculator.
// **Line 11**: This line declares the MainActivity class which is a subclass of AppCompatActivity.
public class MainActivity extends AppCompatActivity {

    // These are the EditText widgets that the user will use to input the operands.
    // **Line 12**: Declares the private instance variable operand1EditText as an EditText widget.
    // **Line 13**: Declares the private instance variable operand2EditText as an EditText widget.
    private EditText operand1EditText, operand2EditText;

    // This is the TextView widget that will display the result of the calculation.
    // **Line 15**: Declares the private instance variable resultTextView as a TextView widget.
    private TextView resultTextView;

    // These are the Button widgets that the user will use to perform the different operations.
    // **Line 17**: Declares the private instance variable addButton as a Button widget.
    // **Line 18**: Declares the private instance variable subtractButton as a Button widget.
    // **Line 19**: Declares the private instance variable multiplyButton as a Button widget.
    // **Line 20**: Declares the private instance variable divideButton as a Button widget.
    private Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    // **Line 22**: This method is called when the activity is first created.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // **Line 23**: This line sets the layout of the activity.
        setContentView(R.layout.activity_main);

        // These lines find the EditText, TextView, and Button widgets by their IDs.
        // **Line 25**: Uses the findViewById() method to find the EditText widget with the ID operand1EditText and assigns it to the instance variable operand1EditText.
        // **Line 26**: Uses the findViewById() method to find the EditText widget with the ID operand2EditText and assigns it to the instance variable operand2EditText.
        // **Line 27**: Uses the findViewById() method to find the TextView widget with the ID resultTextView and assigns it to the instance variable resultTextView.
        // **Line 28**: Uses the findViewById() method to find the Button widget with the ID addButton and assigns it to the instance variable addButton.
        // **Line 29**: Uses the findViewById() method to find the Button widget with the ID subtractButton and assigns it to the instance variable subtractButton.
        // **Line 30**: Uses the findViewById() method to find the Button widget with the ID multiplyButton and assigns it to the instance variable multiplyButton.
        // **Line 31**: Uses the findViewById() method to find the Button widget with the ID divideButton and assigns it to the instance variable divideButton.

        // These lines add listeners to the buttons. When a button is clicked, the corresponding method will be called.
        // **Line 33**: Adds an OnClickListener to the addButton. When the addButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 34**: Adds an OnClickListener to the subtractButton. When the subtractButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 35**: Adds an OnClickListener to the multiplyButton. When the multiplyButton is clicked, the onClick() method of the OnClickListener will be called.
        // **Line 36**: Adds an OnClickListener to the divideButton. When the divideButton is clicked, the onClick() method of the OnClickListener will be called.
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // **Line 38**: This method is called when the add button is clicked.
            public void onClick(View v) {
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 40**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 41**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the addition operation and stores it in a double variable.
                // **Line 44**: Calculates the sum of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 + operand2;
                // This line sets the text of the result TextView to the result of the addition operation.
                // **Line 46**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // **Line 50**: This method is called when the subtract button is clicked.
            public void onClick(View v) {
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 52**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 53**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the subtraction operation and stores it in a double variable.
                // **Line 56**: Calculates the difference of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 - operand2;
                // This line sets the text of the result TextView to the result of the subtraction operation.
                // **Line 58**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // **Line 62**: This method is called when the multiply button is clicked.
            public void onClick(View v) {
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 64**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 65**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the multiplication operation and stores it in a double variable.
                // **Line 68**: Calculates the product of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 * operand2;
                // This line sets the text of the result TextView to the result of the multiplication operation.
                // **Line 70**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // **Line 74**: This method is called when the divide button is clicked.
            public void onClick(View v) {
                // These lines parse the operands from the EditText widgets and store them in double variables.
                // **Line 76**: Parses the text from the operand1EditText widget to a double and assigns it to the variable operand1.
                // **Line 77**: Parses the text from the operand2EditText widget to a double and assigns it to the variable operand2.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());
                // This line calculates the result of the division operation and stores it in a double variable.
                // **Line 80**: Calculates the quotient of operand1 and operand2 and assigns it to the variable result.
                double result = operand1 / operand2;
                // This line sets the text of the result TextView to the result of the division operation.
                // **Line 82**: Converts the result variable to a String and sets it as the text of the resultTextView.
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}