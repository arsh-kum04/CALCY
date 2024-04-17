**Folder Name:** test
**File Name:** ExampleInstrumentedTest.java

// Import required libraries for testing.
// This line imports the necessary libraries for writing Android instrumented tests.
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
// These lines import the JUnit libraries for writing and running tests.
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
// This line imports the Assert class from JUnit for making assertions.

/**
 * Instrumented test, which will execute on an Android device.
 *
 * Used for testing the functionality of Android applications. Runs on a physical or virtual Android device.
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * @RunWith(AndroidJUnit4.class): Tells JUnit to run this class as an Android instrumented test.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    /**
     * useAppContext() is a method in the ExampleInstrumentedTest class that is annotated with @Test.
     *
     * @Test: Indicates that this method should be run as a test.
     *
     * This method tests if the context of the app under test is correct by using the InstrumentationRegistry.getInstrumentation().getTargetContext() method to get the context of the app under test.
     *
     * @assertEquals(String expected, String actual): Asserts that the expected and actual values are equal.
     */
    @Test
    public void useAppContext() {
        // Get the context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Assertion to verify the package name of the app under test.
        // This line checks if the package name of the app under test matches the expected package name ("com.example.calcy") using the assertEquals() method.
        assertEquals("com.example.calcy", appContext.getPackageName());
    }
}