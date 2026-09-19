import java.util.Scanner;

public class IT26101815Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter 4 marks for Student " + i + " separated by space: ");
            String line = sc.nextLine();
            String[] marks = line.split(" ");
            
            int sum = 0;
            for (String m : marks) {
                sum += Integer.parseInt(m);
            }
            
            double average = sum / 4.0;
            String grade;
            
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average <= 74) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            System.out.println("Student " + i + " - Average: " + average + ", Grade: " + grade);
        }
        
        sc.close();
    }
}