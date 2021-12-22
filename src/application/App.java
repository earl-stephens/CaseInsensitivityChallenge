package application;

import java.util.Scanner;

public class App {
	/*
	 * Create a program that asks a user to enter a command.
	 * 
	 * If they hit the return key without entering anything, ask them again to enter
	 * a command.
	 * 
	 * If they enter 'start' or 'START', regardless of capitalization, print
	 * 'Machine starting...'
	 * 
	 * If they enter 'stop', regardless of capitalization, print 'Machine
	 * stopping...'
	 * 
	 * If they enter 'quit', print 'Exiting...' and quit the program.
	 * 
	 * Otherwise print 'Unrecognized'.
	 * 
	 * Ask the to enter a command repeatedly until they stop the program by entering
	 * 'quit'.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String userInput = null;
		/*
		 * do { System.out.print("Enter a command: "); userInput = scanner.nextLine();
		 * 
		 * if (userInput.equalsIgnoreCase("start")) {
		 * System.out.println("Machine starting..."); } else if
		 * (userInput.equalsIgnoreCase("stop")) {
		 * System.out.println("Machine stopping..."); } else if
		 * (userInput.equalsIgnoreCase("quit")) { break; } else if (userInput.length()
		 * == 0) { } else { System.out.println("Unrecognized"); } } while (true);
		 * 
		 * scanner.close(); System.out.println("Exiting...");
		 */

		/*
		 * do { System.out.println("Enter a command: "); userInput =
		 * scanner.nextLine().toUpperCase();
		 * 
		 * switch (userInput) { case "START": System.out.println("Machine starting...");
		 * break; case "STOP": System.out.println("Machine stopping..."); break; case
		 * "": break; case "QUIT": break; default: System.out.println("Unrecognized");
		 * break; } } while (!userInput.equals("QUIT"));
		 * 
		 * scanner.close(); System.out.println("Exiting...");
		 */
		
		boolean exitFlag = true;
		
		do {
			System.out.println("Enter a command: ");
			userInput = scanner.nextLine();
			
			if (userInput.length() == 0) {
				continue;
			}
			
			if (userInput.equalsIgnoreCase("start")) {
				System.out.println("Machine starting...");
			} else if (userInput.equalsIgnoreCase("stop")) {
				System.out.println("Machine stopping...");
			} else if (userInput.equalsIgnoreCase("quit")) {
				exitFlag = false;
				break;
			}
			else {
				System.out.println("Unrecognized");
			}
		} while (exitFlag);
		
		scanner.close();
		System.out.println("Exiting...");
	}
}
