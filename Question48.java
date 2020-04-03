import java.util.*;
/* This program uses a for loop to find the multiples of 7 between 33 and 97. */

public class Question48{
	public static void main(String[] args) {
		System.out.println("Lets find the multiples of 7 between 33 and 97. ");

		for(int i = 33; i < 97; i++){
			if (i % 7 == 0)
			System.out.println("\n" + i);
		}

		System.out.println("\nGood job.");
			
	}

}