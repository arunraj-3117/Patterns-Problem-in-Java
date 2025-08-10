//PATTERN 24
/*
A B C D E 
F       G
H       I
J       K
L M N O P
*/
import java.util.*;
public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        char[][] box = new char[n][n];
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    box[i][j] = ch;
                    ch++;
                    if (ch > 'Z') ch = 'A'; 
                } else {
                    box[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
    }
}
