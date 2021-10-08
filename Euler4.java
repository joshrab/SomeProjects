/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
import java.util.Arrays;
public class Euler4 {
   public static void main (String[] args) {
      int[] arr1 = new int[900]; 
      int[] arr2 = new int[900]; 
      int[] arr3 = new int[1800]; 
      int a = 0; 
      int i = 0;
      for (i = 0; i < 900; ++i) {
         arr1[i] = i + 100;
         arr2[i] = i + 100;
         // System.out.println(arr1[i]);
      }
      for (i = 0; i <= 899; ++i) {
         arr3[i] = arr1[i] * arr2[a];
         // System.out.println (arr3[i]); 
         if (i == 899 && a < 899) {
            ++a;
            i = 0;
         } 
      }
      int[] sortedArr3 = new int[1800];
      System.out.println(Arrays.toString(arr3));
      Arrays.sort(arr3);
      System.out.println(arr3);

   }

}