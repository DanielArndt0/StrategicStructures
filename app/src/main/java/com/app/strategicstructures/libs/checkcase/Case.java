package com.app.strategicstructures.libs.checkcase;

import com.google.android.material.textfield.TextInputLayout;

public class Case {
    private final TextInputLayout textBox;
    private final boolean isTrue;
    private final String message;

    public Case(TextInputLayout textBox, boolean isTrue, String message) {
        this.textBox = textBox;
        this.isTrue = isTrue;
        this.message = message;
    }

    public TextInputLayout getTextBox() {
        return textBox;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public String getMessage() {
        return message;
    }
}
