
/*This program gave me an erroe saying that Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:709)
        at palindrome.main(palindrome.java:19)*/

import java.util.*;

public class palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//getting the word from the user
		System.out.println("Type a word to check if it is a palindrome");
		
		//variables
		String word =sc.nextLine();
		String wordreverse = "";
		int length = wordreverse.length();
		int i = length - 1;
		
		//Removes Punctuation	
		String nopunct = word.replaceAll("\\W", "");  
		do{
			wordreverse = wordreverse + nopunct.charAt(i);
   			 i--;

   			if(word.equals(wordreverse)){
			System.out.println("Congarts, your word is palindrome.");
			System.out.println("\nYour word: " + nopunct);
			System.out.println("\nBackward: " + wordreverse);
		}
		else
			System.out.println("Oups sorry, your word is not palindrome.");

		}
		while ( i >= 0);
		
	}
}

