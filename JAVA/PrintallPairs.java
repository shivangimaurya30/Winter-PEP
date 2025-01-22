/* QUESTION: Print All Pairs in an Array

Problem Description

Write a Java program that prints all possible pairs of elements from a given array. Each pair should include every combination of the elements in the array, including pairs where both elements are the same.

Example

Input: an integer array {10,20,30,40}

Output: { (10 ,  10) (10 ,  20) (10 ,  30) (10 ,  40) (20 ,  10) (20 ,  20) (20 ,  30) (20 ,  40) (30 ,  10) (30 ,  20) (30 ,  30) (30 ,  40) (40 ,  10) (40 ,  20) (40 ,  30) (40 ,  40)}
*/




import java.util.*;
import java.util.Arrays;
public class Printallpairs{
     static void allpairs(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("("+arr[i]+" ,  "+arr[j]+")"+" ");
                
            }
        }
    }
        public static void main(String[] args){
            int[] arr = {10,20,30,40};
            allpairs(arr);

        }
            

        }
