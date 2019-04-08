package Qn5;

import javax.swing.*;
import java.util.Calendar;

public class PastPresentFuture {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        final int THISMONTH = cal.get(Calendar.MONTH);
        final int THISYEAR = cal.get(Calendar.YEAR);
        int day = 0;
        int month = 0;
        int year = 0;

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
        boolean valid = false;
        String stringDay = "";
        while (!valid) {
            stringDay = JOptionPane.showInputDialog("Enter the date: ");
            valid = checkInput(stringDay);

            if (Integer.parseInt(stringDay) <= 0 && Integer.parseInt(stringDay) > 31){
                JOptionPane.showMessageDialog(null, "Please enter a valid date.", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                valid = false;
            }
        }
        return Integer.parseInt(stringDay);
    }

    public static int getMonth() {
        boolean valid = false;
        String stringMonth = "";
        while (!valid) {
            stringMonth = JOptionPane.showInputDialog("Enter the month: ");
            valid = checkInput(stringMonth);

            if (Integer.parseInt(stringMonth) <= 0 && Integer.parseInt(stringMonth) > 12){
                JOptionPane.showMessageDialog(null, "Please enter a valid month.", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                valid = false;
            }
        }
        return Integer.parseInt(stringMonth);
    }

    public static int getYear() {
        boolean valid = false;
        String stringYear = "";
        while (!valid) {
            stringYear = JOptionPane.showInputDialog("Enter the year: ");
            valid = checkInput(stringYear);

            if (Integer.parseInt(stringYear) <= 0){
                JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                valid = false;
            }
        }
        return Integer.parseInt(stringYear);
    }

    public static boolean checkInput(String stringInput) {
        boolean valid;
        try {
            Integer.parseInt(stringInput);
            valid = true;
        } catch (Exception e) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return valid;
    }
}
