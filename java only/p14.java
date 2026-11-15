
import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isStudent;
        int age, rate = 100;
        double discount = 0;

        System.out.print("Enter student status (true/false): ");
        isStudent = sc.nextBoolean();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 60) {
            discount = 50;
            System.out.println("50% Senior Citizen Discount");
        }
        else if (isStudent == true) {
            discount = 10;
            System.out.println("10% Student Discount");
        }
        else {
            discount = 5;
            System.out.println("5% General Discount");
        }

        double finalRate = rate - (rate * discount / 100);

        System.out.println("Original Rate: " + rate);
        System.out.printf("Discount: %.2f%%\n", discount);
        System.out.printf("Final Rate: %.2f\n", finalRate);

        sc.close();
    }
}
