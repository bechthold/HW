import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Wrong input!");
        }

        if (number == 1 || number == 2) {
            System.out.println("It is prime!");
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("It is not prime!");
                    return;
                }
            }
            System.out.println("It is prime!");
        }
    }
}