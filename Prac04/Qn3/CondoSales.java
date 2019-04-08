package Qn3;

import java.util.Scanner;

public class CondoSales {
    private static String[] views = {"Park View", "Golf Course View", "Lake View"};
    private static int[] prices = {150000, 170000, 210000};

    public static void main(String[] args){
        System.out.println("Summerdale Condominium");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose View\n1 - "+ views[0] + "\n2 - " + views[1] + "\n3 - " + views[2]);
        try {
            int userChoice = input.nextInt();
            System.out.println(views[userChoice-1] + " - $" + prices[userChoice-1]);
        }
        catch(Exception e){
            System.out.println("Invalid Choice - $0");
        }
    }
}
