//PATTERN 5
/*
    *    
   * *   
  *   *  
 *     * 
* * * * *
*/
import java.util.*;
public class pattern5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        for (int i = 1; i <= n; i++) {
            int totalChars = 2 * n - 1;
            for (int j = 1; j <= totalChars; j++) {
                // Left boundary star
                if (j == n - i + 1 || j == n + i - 1 || (i == n && j >= n - i + 1 && j <= n + i - 1 && j % 2 == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
