import java.util.Scanner;

public class IT26101815Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter total bill amount for Customer " + i + ": ");
            double bill = sc.nextDouble();
            
            System.out.print("Enter mode of payment [C/O]: ");
            char mode = sc.next().charAt(0);
            
            double discount = 0;
            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
            } else if (mode == 'O' || mode == 'o') {
                discount = 0;
            } else {
                System.out.println("Payment Mode is Not Valid");
                i--; // repeat for same customer
                continue;
            }
            
            double amountToPay = bill - discount;
            
            System.out.println("Discount: " + discount);
            System.out.println("Amount to Pay: " + amountToPay);
            System.out.println();
        }
        
        sc.close();
    }
}