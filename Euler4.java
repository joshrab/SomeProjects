/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

BROKEN. :(
*/
import java.util.Arrays;
public class Euler4 {
   public static void main (String[] args) {
      int[] arr1 = new int[200]; 
      int[] arr2 = new int[200]; 
      int[] arr3 = new int[200*200]; 
      int a = 0; 
      int i = 0;
      for (i = 0; i <= 199; ++i) {
         arr1[i] = i + 800;
         arr2[i] = i + 800;
         // System.out.println(arr1[i]);
      }
      for (i = 0; i <= 199; ++i) {
         arr3[i] = arr1[i] * arr2[a];
         // System.out.println (arr3[i]); 
         if (i == 199 && a < 199) {
            ++a;
            i = -1;
         } 
      }
      // int[] sortedArr3 = new int[1800];
      // System.out.println(Arrays.toString(arr3));
     // Arrays.sort(arr3);
      // System.out.println(arr3);
      String[] strArray = new String[arr3.length];
      for (i = 0; i < arr3.length; i++) {
            strArray[i] = String.valueOf(arr3[i]);
      }
      
      for (i = 0; i < arr3.length; ++i ) {
          if (strArray[i].charAt(0) == strArray[i].charAt(5)) {
             if (strArray[i].charAt(1) == strArray[i].charAt(4)) {
                 if (strArray[i].charAt(2) == strArray[i].charAt(3)) {
                    System.out.println (strArray[i]);
                } 
            }
          }
      }
      

   }

}
