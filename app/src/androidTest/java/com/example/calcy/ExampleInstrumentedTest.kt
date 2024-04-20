**Folder Name:** test

**File Name:** activity_main.xml

**Line by Line Documented Code:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/operand1TextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:text="Operand 1:"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/operand1EditText"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:inputType="numberDecimal"
        app:layout_constraintEnd_toStartOf="@+id/operand2TextView"
        app:layout_constraintStart_toEndOf="@+id/operand1TextView"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/operand2TextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:text="Operand 2:"
        app:layout_constraintStart_toEndOf="@+id/operand1EditText"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/operand2EditText"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:inputType="numberDecimal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/operand2TextView"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/addButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="+"
        app:layout_constraintEnd_toStartOf="@+id/subtractButton"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/operand1TextView" />

    <Button
        android:id="@+id/subtractButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="-"
        app:layout_constraintEnd_toStartOf="@+id/multiplyButton"
        app:layout_constraintStart_toEndOf="@+id/addButton"
        app:layout_constraintTop_toBottomOf="@+id/operand1TextView" />

    <Button
        android:id="@+id/multiplyButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="*"
        app:layout_constraintEnd_toStartOf="@+id/divideButton"
        app:layout_constraintStart_toEndOf="@+id/subtractButton"
        app:layout_constraintTop_toBottomOf="@+id/operand1TextView" />

    <Button
        android:id="@+id/divideButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="/"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/multiplyButton"
        app:layout_constraintTop_toBottomOf="@+id/operand1TextView" />

    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:textAppearance="?android:attr/textAppearanceLarge"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/addButton" />

</androidx.constraintlayout.widget.ConstraintLayout>
```