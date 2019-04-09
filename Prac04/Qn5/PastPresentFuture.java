package Qn5;

import javax.swing.*;
import java.util.Calendar;

public class PastPresentFuture {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        final int THISMONTH = cal.get(Calendar.MONTH);
        final int THISYEAR = cal.get(Calendar.YEAR);
        int day;
        int month;
        int year;

        day = getDay();
        month = getMonth() + 1;
        year = getYear();



        if (year != THISYEAR) {
            JOptionPane.showMessageDialog(null, String.format("%d/%d/%d is not this year", day, month, year),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (month < THISMONTH) {
            JOptionPane.showMessageDialog(null, String.format("%d/%d/%d is in an earlier month this year", day, month, year),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (month > THISMONTH) {
            JOptionPane.showMessageDialog(null, String.format("%d/%d/%d is in a later month this year", day, month, year),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, String.format("%d/%d/%d is this month", day, month, year),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static int getDay() {

        String stringDay = JOptionPane.showInputDialog("Enter the date: ");
        return Integer.parseInt(stringDay);
    }

    public static int getMonth() {
        String stringMonth = JOptionPane.showInputDialog("Enter the month: ");
        return Integer.parseInt(stringMonth);
    }

    public static int getYear() {
        String stringYear = JOptionPane.showInputDialog("Enter the year: ");
        return Integer.parseInt(stringYear);
    }
}
