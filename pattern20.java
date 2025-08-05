//PATTERN 20
/*
1 1 1 1 2
3 2 2 2 2
3 3 3 3 4
5 4 4 4 4
5 5 5 5 6
*/

import java.util.*;
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1 && j == n) {
                    System.out.print((i + 1) + " ");
                } else if (i % 2 == 0 && j == 1) {
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
