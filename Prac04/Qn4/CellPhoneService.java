package Qn4;

import java.util.Scanner;

public class CellPhoneService {
    private static final String MESSAGE = "Plan recommended: Plan ";
    private static Scanner input = new Scanner(System.in);
    private static boolean validInput = false;

    public static void main(String[] args) {
        String plan;
        int cost;

        System.out.println("Horizon Phones");

        int talkMinutes = getTalkMinutes();

        int textMessages = getTextMessages();

        double data = getData();

        if (data == 0) {
            if (talkMinutes < 500) {
                if (textMessages == 0) {
                    plan = "A";
                    cost = 49;
                    System.out.println(MESSAGE + plan + ", $" + cost);
                } else if (textMessages > 0) {
                    plan = "B";
                    cost = 55;
                    System.out.println(MESSAGE + plan + ", $" + cost);
                }
            }
            else {
                if (textMessages <= 100) {
                    plan = "C";
                    cost = 61;
                    System.out.println(MESSAGE + plan + ", $" + cost);
                }
                else{
                    plan = "D";
                    cost = 70;
                    System.out.println(MESSAGE + plan + ", $" + cost);
                }
            }
        }
        else if (data < 2.0){
            plan = "E";
            cost = 79;
            System.out.println(MESSAGE + plan + ", $" + cost);
        }
        else {
            plan = "E";
            cost = 87;
            System.out.println(MESSAGE + plan + ", $" + cost);
        }
    }

    private static int getTalkMinutes(){
        System.out.println("Enter the number of maximum talk minutes per month:");
        String userInput = "";
        while (!validInput){
            userInput = input.nextLine();
            try{
                Integer.parseInt(userInput);
                validInput = true;
            }
            catch (Exception e){
                System.out.println("Please enter a valid number of maximum talk minutes per month.");
            }
        }
        validInput = false;
        return Integer.parseInt(userInput);
    }

    private static int getTextMessages(){
        System.out.println("Enter the number of maximum text messages per month:");
        String userInput = "";
        while (!validInput){
            userInput = input.nextLine();
            try{
                Integer.parseInt(userInput);
                validInput = true;
            }
            catch (Exception e){
                System.out.println("Please enter a valid number of maximum text messages per month.");
            }
        }
        validInput = false;
        return Integer.parseInt(userInput);
    }



    private static double getData(){
        System.out.println("Enter the number of maximum gigabytes of data per month:");
        String userInput = "";
        while (!validInput){
            userInput = input.nextLine();
            try{
                Double.parseDouble(userInput);
                validInput = true;
            }
            catch (Exception e){
                System.out.println("Please enter a valid number of maximum gigabytes of data per month.");
            }
        }
        validInput = false;
        return Double.parseDouble(userInput);
    }

}