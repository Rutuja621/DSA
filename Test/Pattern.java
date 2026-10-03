
import java.util.Scanner;
public class Pattern {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Upper half
            for (int row = 1; row <= n; row++) {

                // Spaces
                for (int space = 1; space <= n - row; space++) {
                    System.out.print(" ");
                }

                // Increasing numbers
                for (int i = 1; i <= row; i++) {
                    System.out.print(i);
                }

                // Decreasing numbers
                for (int i = row - 1; i >= 1; i--) {
                    System.out.print(i);
                }

                System.out.println();
            }

            // Lower half
            for (int row = n - 1; row >= 1; row--) {

                // Spaces
                for (int space = 1; space <= n - row; space++) {
                    System.out.print(" ");
                }

                // Increasing numbers
                for (int i = 1; i <= row; i++) {
                    System.out.print(i);
                }

                // Decreasing numbers
                for (int i = row - 1; i >= 1; i--) {
                    System.out.print(i);
                }

                System.out.println();
            }


        }
    }

