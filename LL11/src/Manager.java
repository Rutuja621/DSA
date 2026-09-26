import java.util.Scanner;

class PrimeArrayManager {

    int[] arr;
    int size;

    PrimeArrayManager(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    void process() {

        int[] prime = new int[size];
        int[] nonPrime = new int[size];

        int p = 0;
        int np = 0;

        // Separate
        for (int i = 0; i < size; i++) {

            if (isPrime(arr[i]))
                prime[p++] = arr[i];
            else
                nonPrime[np++] = arr[i];
        }

        // Prime Ascending
        for (int i = 0; i < p - 1; i++) {

            for (int j = i + 1; j < p; j++) {

                if (prime[i] > prime[j]) {

                    int temp = prime[i];
                    prime[i] = prime[j];
                    prime[j] = temp;
                }
            }
        }

        // Non Prime Descending
        for (int i = 0; i < np - 1; i++) {

            for (int j = i + 1; j < np; j++) {

                if (nonPrime[i] < nonPrime[j]) {

                    int temp = nonPrime[i];
                    nonPrime[i] = nonPrime[j];
                    nonPrime[j] = temp;
                }
            }
        }

        System.out.print("Prime Numbers: ");
        for (int i = 0; i < p; i++) {
            System.out.print(prime[i] + " ");
        }

        System.out.println();

        System.out.print("Non Prime Numbers: ");
        for (int i = 0; i < np; i++) {
            System.out.print(nonPrime[i] + " ");
        }

        System.out.println();

        System.out.print("Final Array: ");

        for (int i = 0; i < p; i++) {
            System.out.print(prime[i] + " ");
        }

        for (int i = 0; i < np; i++) {
            System.out.print(nonPrime[i] + " ");
        }
    }
}

public class Manager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PrimeArrayManager obj =
                new PrimeArrayManager(arr, n);

        obj.process();

    }
}