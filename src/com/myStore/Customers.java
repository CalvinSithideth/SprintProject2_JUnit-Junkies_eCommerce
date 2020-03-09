package com.myStore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Customers {
	private static Scanner sc = new Scanner(System.in);
	public static void customersMenu() throws IOException, SQLException {
		System.out.println("Customer Information"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option:"
				+ "\n1. View All Customers"
				+ "\n2. Get Customer Information"
				+ "\n3. Add/Remove Customer"
				+ "\n4. Previous Menu");
		processUserInput();
	}
	
	private static void processUserInput() throws IOException, SQLException {
		String userInput = sc.nextLine();
		switch(userInput) {
			case "1": {
				listAllCustomers();
				break;
			}
			case "2": {
				customerInformation();
				break;
			}
			case "3": {
				updateCustomers();
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
				customersMenu();
			}
		}
	}

	private static void listAllCustomers() {
		// TODO Auto-generated method stub
		//insert code to select all customers
	}

	private static void customerInformation() {
		// TODO Auto-generated method stub
		System.out.println("Filter Customers"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option: "
				+ "\n1. Filter by purchase amount "
				+ "\n2. Filter by zip code"
				+ "\n3. Previous Menu");
		String userInput = sc.nextLine();
		switch(userInput) {
		
		}
	}

	private static void updateCustomers() {
		// TODO Auto-generated method stub
		System.out.println("Update Customers"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option: "
				+ "\n1. Add Customer "
				+ "\n2. Remove Customers"
				+ "\n3. Previous Menu");
		String userInput = sc.nextLine();
		switch(userInput) {
		
		}
	}

}
