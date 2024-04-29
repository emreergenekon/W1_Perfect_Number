import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();

            if (isPerfectNumber(number)){
                System.out.println(number + " bir mükemmel sayıdır.");
            } else {
                System.out.println(number + " bir mükemmel sayı değildir.");
            }
        }
    }

    static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Finding the sum of positive integer divisors of the given number.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        // Finding perfect number.
        return sum == number;
    }
}
