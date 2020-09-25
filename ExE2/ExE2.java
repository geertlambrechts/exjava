import java.util.*;
import java.lang.*;
import java.io.*;

public class ExE2 {
  public static void main (String [] args) {
	String inputString;
	Scanner scanner = new Scanner(System.in);
	String wordOfArray;
	ArrayList<String> wordList = new ArrayList<>();
	 
	
	System.out.println("Enter word");
    inputString = scanner.nextLine(); 
		
	if (Palindrome.isPalindrome(inputString)) {
		System.out.println (inputString + " is a palindrome");
	}
	else {
		System.out.println (inputString + " is not a palindrome");
	}
	
	System.out.println("Enter a list of words = enter is finished");
	do {
		wordOfArray = scanner.nextLine(); 
		if (!(wordOfArray.length() == 0)) {
			wordList.add (wordOfArray);
		}
	}
	while (wordOfArray.length()>0);
	
	int i = 0;
	String [] wordArray = new String[wordList.size()];
	for(String listItem :wordList) {
		wordArray[i++] = listItem;
	}
	System.out.println("you entered " + Palindrome.countNumberOfPalindromes(wordArray) + " palingdromes"); 
	
	
  }	  

} 
