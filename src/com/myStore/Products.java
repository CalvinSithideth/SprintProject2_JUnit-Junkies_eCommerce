package com.myStore;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Products {
	private static Scanner sc = new Scanner(System.in);

	public static void productsMenu() throws IOException, SQLException {
		System.out.println("Products"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option: "
				+ "\n1. View All Products"
				+ "\n2. Get Product Information"
				+ "\n3. Add/Remove Product"
				+ "\n4. Previous Menu");
		processUserInput();
		
	}
	
	private static void processUserInput() throws IOException, SQLException {
		String userInput = sc.nextLine();
		switch(userInput) {
			case "1": {
				listProducts();
				break;
			}
			case "2": {
				productInformation();
				break;
			}
			case "3": {
				updateProducts();
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
				productsMenu();
			}
		}
	}

	private static void listProducts() {
		// TODO Auto-generated method stub
		//Add code to Select all from Products
	}

	private static void productInformation() throws IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Product Information"
				+ "\n---------------------------------------------------"
				+ "\nEnter Product SKU: ");
		//Add code to select Product and output price and number of units in stock
		//String userInput = sc.nextLine();
		sc.nextLine();
		
	}


	private static void updateProducts() {
		// TODO Auto-generated method stub
		System.out.println("Update Products"
				+ "\n---------------------------------------------------"
				+ "\nPlease select an option: "
				+ "\n1. Add Product "
				+ "\n2. Remove Product"
				+ "\n3. Previous Menu");
		String userInput = sc.nextLine();
		switch(userInput) {
			
		}
		//add code to update table
	}
	
}
