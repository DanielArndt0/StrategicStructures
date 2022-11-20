package com.app.strategicstructures.libs.others;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static Period between(String startDate, String endDate, String pattern) {
        return Period.between(
                LocalDate.parse(startDate, DateTimeFormatter.ofPattern(pattern)),
                LocalDate.parse(endDate, DateTimeFormatter.ofPattern(pattern))
        );
    }
}
