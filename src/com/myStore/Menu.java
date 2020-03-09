package com.myStore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);

	public static void welcomeScreen() throws IOException, SQLException {
			System.out.println("\nWelcome to the JUnit Junkies ECommerce Application!"
					+ "\n---------------------------------------------------"
					+ "\nPlease select an option: "
					+ "\n1. Products \n2. Customers \n3. Orders");
			mainMenu();
	}		
	
	public static void mainMenu() throws IOException, SQLException {
		String userInput = sc.nextLine();
		switch(userInput) {
			case "1": {
				Products.productsMenu();
				break;
			}
			case "2": {
				Customers.customersMenu();
				break;
			}
			case "3": {
				Orders.ordersMenu();
				break;
			}
			default: {
				System.out.println("*******************************"
						+ "\nPlease enter a valid selection!"
						+ "\n*******************************");
				welcomeScreen();
			}
		}
	}
}
