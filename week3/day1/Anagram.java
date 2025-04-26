package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text1 = "listen";
      String text2 = "silent";
      boolean isAnagram = false;
      if (text1.length()==text2.length()) {
    	  char[] charArray1 = text1.toCharArray();
    	  char[] charArray2 = text2.toCharArray();
    	  Arrays.sort(charArray1);
    	  Arrays.sort(charArray2);
    	  isAnagram = Arrays.equals(charArray1, charArray2);
    	        }
      if (isAnagram) {
    	  System.out.println("This is Anagram");
      }
      else {
    	  System.out.println("This is not Anagram");
	}
	}

}
