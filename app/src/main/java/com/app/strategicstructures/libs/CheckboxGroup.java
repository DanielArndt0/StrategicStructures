package com.app.strategicstructures.libs;

import android.widget.CheckBox;

import java.util.List;

public class CheckboxGroup {

    private final List<CheckBox> checkBoxes;

    public CheckboxGroup(List<CheckBox> checkBoxes, boolean status) {
        this.checkBoxes = checkBoxes;
        setCheckBoxes(status);
    }

    public void setCheckBoxes(boolean status) {
        for (CheckBox checkBox : checkBoxes) {
            checkBox.setEnabled(status);
        }
    }
}