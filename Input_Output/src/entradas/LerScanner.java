package entradas;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		
		System.out.println("Enter username");
        String userName = myObj.nextLine(); // Read user input
		System.out.printf("Username is: %s%n", userName); // Output user input

		System.out.println("Qual a sua idade?");
        int idade = myObj.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");
	}

}
