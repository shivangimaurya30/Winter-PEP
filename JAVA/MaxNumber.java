import java.util.*;
import java.util.Arrays;


public class maxnumber {
   static int findMax(int[] arr)  /
        {
            int maxAns=arr[0];
            for(int i=1;i<arr.length;i++){
                if(maxAns<arr[i]){
                    maxAns=arr[i];
                }}
                return maxAns;
            
}
public static void main(String[] args) {
    int[] n={3,5,7,2,8};
    int maxNum=findMax(n);
    System.out.println(maxNum);
}
}
