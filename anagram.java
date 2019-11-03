import java.util.Scanner;
import java.util.Arrays;

public class Solution {
   public boolean isAnagram(String s, String t) {
      //Add code below
      s = s.toLowerCase();
      t = t.toLowerCase();
      s = s.replaceAll("\\s+", "");
      t = t.replaceAll("\\s+", "");
      s = s.trim();
      t = t.trim();
      char[] arra = new char[s.length()];
      char[] arrb = new char[t.length()];
      for(int i=0;i<s.length(); i++) {
    	  arra[i] = s.charAt(i);
      }
      Arrays.sort(arra);
      for(int i=0;i<t.length(); i++) {
    	  arrb[i] = t.charAt(i);
      }
      Arrays.sort(arrb);      
      if(Arrays.equals(arra,arrb)){
        return true;
      }else{
         return false;
      }
   }
   //Sample main to run tests
   public static void main(String args[]) {
      //Variables
      Scanner scnr = new Scanner(System.in);
      Solution test = new Solution();
      //Get test inputs
      String a = scnr.nextLine();
      String b = scnr.nextLine();
      //Run instance of solution on test cases
      boolean out = (test.isAnagram(a,b)) ? true : false;
      //Output result
      System.out.println(out);
   }
}