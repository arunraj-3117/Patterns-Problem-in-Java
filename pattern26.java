//PATTERN 26
/*
* * * * * 
      *
    *
  *
* * * * *
*/
import java.util.*;
public class pattern26{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value n= ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j+i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
