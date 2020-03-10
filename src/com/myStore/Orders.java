package com.myStore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Orders {
	private static Scanner sc = new Scanner(System.in);

	public static void ordersMenu() throws IOException, SQLException {
		System.out.println("Orders"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option: "
				+ "\n1. View Orders"
				+ "\n2. Get Order Information"
				+ "\n3. Add/Remove Orders"
				+ "\n4. Previous Menu");
		processUserInput();
	}
	
	private static void processUserInput() throws IOException, SQLException {
		String userInput = sc.nextLine();
		switch(userInput) {
			case "1": {
				viewOrders();
				break;
			}
			case "2": {
				orderInformation();
				break;
			}
			case "3": {
				updateOrders();
				break;
			}
			case "4": {
				Menu.welcomeScreen();
				break;
			}
			default: {
				System.out.println("*******************************"
						+ "\nPlease enter a valid selection!"
						+ "\n*******************************");
				ordersMenu();
			}
		}
	}

	private static void viewOrders() {
		// TODO Auto-generated method stub
		
	}

	private static void orderInformation() {
		// TODO Auto-generated method stub
		
	}

	private static void updateOrders() {
		// TODO Auto-generated method stub
		
	}
}
