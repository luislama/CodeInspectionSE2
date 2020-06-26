package labcodeinspection;

import java.util.Scanner;

public class EmailApp {
	
	/** constructor
	 * 
	 */
	private EmailApp() {
		
	} 
	
	/** main
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		final Scanner scannerInput = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		final String firstName = scannerInput.nextLine();

		System.out.print("Enter your last name: ");
		final String lastName = scannerInput.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = scannerInput.nextInt();
		scannerInput.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
