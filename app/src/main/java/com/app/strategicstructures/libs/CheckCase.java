package com.app.strategicstructures.libs;

import java.util.List;
import java.util.regex.Pattern;

public class CheckCase {
    private List<Case> checkList;

    public boolean execute(List<Case> checkList) {
        this.checkList = checkList;
        boolean fValid = true;
        for (Case check : checkList) {
            if (check.isTrue()) {
                check.getTextBox().setError(check.getMessage());
                fValid = false;
            }
        }
        return fValid;
    }

    public void clear() {
        assert checkList != null;
        for (Case check : checkList) {
            if (!check.isTrue())
                check.getTextBox().setErrorEnabled(false);
        }
    }

    public boolean find(String str, String regex) {
        return Pattern.compile(regex).matcher(str).find();
    }
}
