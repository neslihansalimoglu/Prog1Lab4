import java.util.*;

public class Question52{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberofinputs =10;
		int small = 999;
		int number =0;

		System.out.println("Lets find the smallest number");

		for(int i = 1; i <= numberofinputs; i++)
		{
			System.out.println("\nEnter number " + i +":");
			number = sc.nextInt();
		}

		if(number > small){
			small = number;
		}
		System.out.println("\nThe smallest number is " + small);
	}

}
