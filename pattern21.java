//PATTERN 21
/*
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
*/
import java.util.*;
public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num++ + " ");
                }
            } else {
                int temp = num + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp-- + " ");
                }
                num += n;
            }
            System.out.println();
        }
    }
}
