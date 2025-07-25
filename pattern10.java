//PATTERN 10
/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (half of diamond): ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(n - i);
            int stars = (2 * n - 1) - 2 * spaces;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
