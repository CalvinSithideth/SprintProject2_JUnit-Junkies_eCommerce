package com.myStore;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

public class ConsoleApp_eCommerce
{

	public static void main(String[] args)
	{

		// Hello
		System.out.println("Welcome to the MyStore Console Application");
		System.out.println("Created by the J-Unit Junkies");
		System.out.println("Connecting to database...");
		System.out.println();

		// Initialize database context and scanner
		Scanner sc = new Scanner(System.in);
		DatabaseContext dbc = null;
		try
		{
			dbc = new DatabaseContext();
		}
		catch (SQLException e)
		{
			System.out.println("Sorry! Could not connect to the database.");
			e.printStackTrace();
		}		
		
		mainMenu(sc, dbc);
		
	}

	private static void mainMenu(Scanner sc, DatabaseContext dbc)
	{
		displayMainMenuOptions();
		int input = sc.nextInt();
		try
		{
			chooseMenuOption(input, sc, dbc);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void chooseMenuOption(int input, Scanner sc, DatabaseContext dbc ) throws SQLException
	{
		List<Order> orders = dbc.getAllOrders();
		switch (input)
		{
			case 1:
				List<Product> products = dbc.getAllProducts();
				for (Product p : products)
				{
					System.out.println(p);
				}
				mainMenu(sc, dbc);
				break;
				
			case 2:
				List<Customer> customers = dbc.getAllCustomers();
				for (Customer c : customers)
				{
					System.out.println(c);
				}
				mainMenu(sc, dbc);
				break;
				
			case 3:
				for (Order o : orders)
				{
					System.out.println(o);
				}
				mainMenu(sc, dbc);
				break;
				
			case 4:
				for (Order o : orders)
				{
					if (!o.getOrderStatus())
					{
						System.out.println(o);
					}
				}
				mainMenu(sc, dbc);
				break;
				
			case 5:
				System.out.println("Uh oh, deleting an order...");
				System.out.println("Displaying all orders");
				for (Order o : orders)
				{
					System.out.println(o);
				}
				System.out.println("Please enter the ID of the order to delete> ");
				int id = sc.nextInt();
				dbc.deleteOrders(id);
				mainMenu(sc, dbc);
				break;
				
			case 6:
				System.out.println("Starting up order creation wizard...");
				
				System.out.print("Please enter the customer ID> ");
				int customerID = sc.nextInt();
				System.out.print("Please enter the shipper ID> ");
				int shipperID = sc.nextInt();
				System.out.println("Setting order date as current date...");
				Date orderDate = new Date( LocalDate.now().getYear() - 1900, LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth() );
				System.out.print("Please enter the payment info> ");
				String paymentInfo = sc.nextLine();
				
				System.out.println("Setting up shipping date...");
				System.out.print("Enter the year the order will ship (e.g. 2020)> ");
				int year = ( sc.nextInt() );
				System.out.print("Enter the month the order will ship (e.g. 8)> ");
				int month = ( sc.nextInt() );
				System.out.print("Enter the day the order will ship (e.g. 12)> ");
				int day = ( sc.nextInt() );
				Date shipDate = new Date( year - 1900, month - 1, day );
				
				boolean orderStatus = false;
				
				Order newOrder = new Order(customerID, shipperID, orderDate, paymentInfo, shipDate, orderStatus);
				dbc.insertOrder(newOrder);
				mainMenu(sc, dbc);
				break;
				
			case 0:
				System.out.println("Deallocating system resources...");
				sc.close();
				dbc.close();
				System.out.println("Deallocation complete!");
				System.out.println("Goodbye!");
				System.exit(0);
	
			default:
				System.out.println("Invalid input");
				input = sc.nextInt();
				chooseMenuOption(input, sc, dbc);
				break;
		}
	}

	private static void displayMainMenuOptions()
	{
		System.out.println("Please enter one of the options below");
		System.out.println("1: List all products");
		System.out.println("2: List all customers");
		System.out.println("3: List all orders");
		System.out.println("4: List all open orders");
		System.out.println("5: Delete order");
		System.out.println("6: Make an order");
		System.out.println("0: Exit the program");
	}
}