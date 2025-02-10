 /* *******
     *****
      ***
       *
   */
import java.util.*;
import java.util.Scanner;
public class PyramidPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
            int n=sc.nextInt();
            for(int i=n;i>=1;i--){ //row
                for(int j=1;j<=n-i;j++){//col space
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){//printing
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
