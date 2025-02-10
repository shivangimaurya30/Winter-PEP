import java.util.*;
import java.util.Scanner;
public class RegexPattern{
  public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         String str=sc.nextLine();
        String regularExpr ="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
         if(str.matches(regularExpr)){
           System.out.println("valid");
         }
         else{
          System.out.println("invalid");
         }
      }
}
