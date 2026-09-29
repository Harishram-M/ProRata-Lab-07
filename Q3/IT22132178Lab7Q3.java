import java.util.Scanner;

public class IT22132178Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            String mode = input.next();
            if (!mode.equalsIgnoreCase("C") && !mode.equalsIgnoreCase("O")) {
                System.out.println("Payment Mode is Not Valid");
                System.out.println();
                continue;
            }
            double discount = 0;
            if (mode.equalsIgnoreCase("C")) {
                discount = bill * 0.05;
                System.out.println("Discount is: " + discount);
            } else {
                System.out.println("No discount applicable.");
            }
            System.out.println("Amount to be paid: " + (bill - discount));
            System.out.println();
        }
    }
}
