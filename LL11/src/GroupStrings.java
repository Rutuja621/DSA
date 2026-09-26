import java.util.Scanner;

public class GroupStrings {

    static String sortString(String str) {

        char[] ch = str.toCharArray();

        // Bubble Sort
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {

                if (ch[j] > ch[j + 1]) {

                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] arr = new String[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int group = 1;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                System.out.print("Group " + group + ": ");

                System.out.print(arr[i] + " ");

                visited[i] = true;

                String s1 = sortString(arr[i]);

                for (int j = i + 1; j < n; j++) {

                    if (!visited[j]) {

                        String s2 = sortString(arr[j]);

                        if (s1.equals(s2)) {

                            System.out.print(arr[j] + " ");

                            visited[j] = true;
                        }
                    }
                }

                group++;
                System.out.println();
            }
        }

        sc.close();
    }
}