package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public static boolean isPrime (int n) {

        if (n <= 1) { // 0 and 1 are not prime numbers!
            return false;
        }
        for (int i = 2; i <= n / 2; i++) { // n/2 is the maximum number that can divide n
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
