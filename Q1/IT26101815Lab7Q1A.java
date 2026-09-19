import java.util.Scanner;

public class IT26101815Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for 4 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        
        double average = (m1 + m2 + m3 + m4) / 4.0; // fixed here
        String grade;
        
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}