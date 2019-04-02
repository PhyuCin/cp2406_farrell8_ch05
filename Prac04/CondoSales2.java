import java.util.Scanner;

public class CondoSales2 {
    private static String[] views = {"Park View", "Golf Course View", "Lake View"};
    private static int[] prices = {150000, 170000, 210000};

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Summerdale Condominium");
        System.out.println("Choose View\n1 - "+ views[0] + "\n2 - " + views[1] + "\n3 - " + views[2]);
        try {
            int userChoice = input.nextInt();

            System.out.println("Choose View\n1 - Garage\n2 - Parking Space");
            try{
                int parkingChoice = input.nextInt();
                if (parkingChoice == 1) {
                    System.out.println("The condo price with the garage:");
                    System.out.println(views[userChoice - 1] + " - $" + (prices[userChoice - 1] + 5000));
                }
                else if(parkingChoice == 2){
                    System.out.println("The condo price without a garage:");
                    System.out.println(views[userChoice - 1] + " - $" + prices[userChoice - 1]);
                }

                else{
                    System.out.println("Invalid Parking Choice.\nThe condo price without a garage:");
                    System.out.println(views[userChoice-1] + " - $" + prices[userChoice-1]);
                }
            }
            catch(Exception e){
                System.out.println("Invalid Parking Choice.\nThe condo price without a garage:");
                System.out.println(views[userChoice-1] + " - $" + prices[userChoice-1]);
            }
        }
        catch(Exception e){
            System.out.println("Invalid Choice - $0");
        }
    }
}
