**Folder Name:** test

**File Name:** ExampleInstrumentedTest.java

**Line by Line Documented Code:**

```java
// Import required libraries for testing.
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

// @RunWith(AndroidJUnit4.class): Tells JUnit to run this class as an Android instrumented test.
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    // @Test: Indicates that this method should be run as a test.
    @Test
    public void useAppContext() {
        // Get the context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Assertion to verify the package name of the app under test.
        Assert.assertEquals("com.example.calcy", appContext.getPackageName());
    }
}
```
**Folder Name:** test

**File Name:** MainActivity.java

**Line by Line Documented Code:**

```java
// Import required libraries.
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare variables for UI components.
    EditText operand1EditText, operand2EditText;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView resultTextView;

    // onCreate method: This is the entry point of the activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components.
        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Set click listeners for buttons.
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get operands from EditText fields.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                // Perform addition and display the result.
                double result = operand1 + operand2;
                resultTextView.setText(String.format("%.2f", result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get operands from EditText fields.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                // Perform subtraction and display the result.
                double result = operand1 - operand2;
                resultTextView.setText(String.format("%.2f", result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get operands from EditText fields.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                // Perform multiplication and display the result.
                double result = operand1 * operand2;
                resultTextView.setText(String.format("%.2f", result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get operands from EditText fields.
                double operand1 = Double.parseDouble(operand1EditText.getText().toString());
                double operand2 = Double.parseDouble(operand2EditText.getText().toString());

                // Perform division and display the result (if operand2 is not zero).
                if (operand2 != 0) {
                    double result = operand1 / operand2;
                    resultTextView.setText(String.format("%.2f", result));
                } else {
                    resultTextView.setText("Cannot divide by zero");
                }
            }
        });
    }
}
```