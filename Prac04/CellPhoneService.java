import java.util.Scanner;

public class CellPhoneService {
    static final String MESSAGE = "Plan recommended: Plan ";

    public static void main(String[] args) {
        String plan;
        int cost;
        Scanner input = new Scanner(System.in);
        System.out.println("Horizon Phones");
        
        System.out.println("Enter the number of maximum talk minutes per month:");
        int talkMinutes = input.nextInt();

        System.out.println("Enter the number of maximum text messages per month:");
        int textMessages = input.nextInt();

        System.out.println("Enter the number of maximum gigabytes of data per month:");
        double data = input.nextDouble();

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
}