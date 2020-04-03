import java.util.*;

public class email{
	public static void main(String[] args) {

		System.out.println("Please enter an email adress to validate");

		Scanner mail = new Scanner(System.in);
		String email = input.nextLine();
		int i;

			for(int i = 0; i < email.length(); i++);
				if(email.indexOf("@") >= 1) {
					if(email.indexOf(".") >= email.indexOf("@")+2)
						if((email.indexOf("@")+email.indexOf(".") - email.length()) >= 1 )
							System.out.println("This email adress" + email + "is valid.");
				}
							else{
								System.out.println("This email adress" + email + "is not valid.");
							}	
				
	}		
}
