**Folder Name:** test
**File Name:** ExampleInstrumentedTest.java

```java
// Import required libraries for testing.
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * Used for testing the functionality of Android applications. Runs on a physical or virtual Android device.
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Get the context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Assertion to verify the package name of the app under test.
        assertEquals("com.example.calcy", appContext.getPackageName());
    }
}
```