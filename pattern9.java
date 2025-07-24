//PATTERN 9
/*
* * * * *
 *     *
  *   *
   * *
    *
*/
import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    line += " ";  
                } else if (j == i || j == n - 1 || i == 0) {
                    line += "* "; 
                } else {
                    line += "  ";
                }
            }
            System.out.println(line);
        }
    }
}
