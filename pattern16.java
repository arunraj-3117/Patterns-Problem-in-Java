//PATTERN 16
/*
*       *  
* *   * *  
* * * * *  
* * * * *  
* *   * *  
*       *  
*/
import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            int stars = i <= n ? i : 2 * n - i + 1;
            int spaces = 2 * (n - stars);
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
