import java.util.*;
import java.lang.*;
import java.io.*;

class Palindrome {
  public static boolean isPalindrome (String word) {
	char [] wordCharArray = word.toCharArray();
	char [] reversedCharArray = new char [word.length()];
	
	int i;
	int len = word.length() - 1;
    for (char letter :wordCharArray) {
		reversedCharArray [len--] = letter;	
	}
	String reversedWord = new String(reversedCharArray);
	System.out.println ("reversedWord = " + reversedWord);
	
	return reversedWord.equals (word);
  }
  
  public static int countNumberOfPalindromes (String[] wordArray) {
	int totalPalindromes=0;
	for (String word :wordArray) {
		if (Palindrome.isPalindrome(word)) {
			totalPalindromes++;
		}
	}
	return totalPalindromes;
  }
} 
