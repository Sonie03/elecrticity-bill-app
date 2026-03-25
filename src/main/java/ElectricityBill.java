import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.5;
        } 
        else if (units <= 200) {
            billAmount = (100 * 1.5) + (units - 100) * 2.5;
        } 
        else {
            billAmount = (100 * 1.5) 
                       + (100 * 2.5) 
                       + (units - 200) * 4.0;
        }

        System.out.println("Electricity Bill Amount = ₹" + billAmount);

        sc.close();
    }
}