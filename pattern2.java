//PATTERN 2
/*
* * * * *
* * * * 
* * * 
* *
*
*/
import java.util.*;
public class pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}