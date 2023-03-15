package org.example.exercises.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

    public static void process() {
        String date = "02-14-2023";
        System.out.println("No calendar: " + convertDateToString(date));
        System.out.println("With calendar: " + convertDateCalendarToString(new SimpleDateFormat("dd/MM/yy").format(Calendar.getInstance().getTime())));
    }

    public static String convertDateToString(String date) {
        // Converts the string, format to date object
        DateFormat df = new SimpleDateFormat("dd/MM/yy");

        return df.format(Calendar.getInstance().getTime()).toString();
    }

    public static String convertDateCalendarToString(String date) {
        // Converts the string, format to date object
        DateFormat df = new SimpleDateFormat(date);

        // Get the date using calendar object
        Date today = Calendar.getInstance().getTime();

        // convert the date into a string, using format() method
        String dateToString = df.format(today);

        return dateToString;
    }
}
