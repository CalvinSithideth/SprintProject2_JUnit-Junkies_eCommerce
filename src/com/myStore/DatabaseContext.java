package com.myStore;

import java.sql.*;
import java.util.*;

public class DatabaseContext
{
	private String url = "jdbc:mysql://localhost:3306/eCommerce_JUnitJunkies";
	private static final String USERNAME = "default";
	private static final String PASSWORD = "COVA";
	private Connection con;

	public DatabaseContext() throws SQLException
	{
		con = DriverManager.getConnection(url, USERNAME, PASSWORD);
	}

	public void runStatement()
	{
		// set up connections and statements
		Scanner sc = new Scanner(System.in);
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(getUserInput(sc));
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();

			// iterate over resultset
			// Need to update to fit sql column standards
//			
			//int iteration = 1;
			while (rs.next())
			{
				for (int i = 1; i <= columns; i++)
				{
					String name = rsmd.getColumnName(i);
					String value = rs.getString(i);
					System.out.println(name + ": " + value);
				}
				System.out.println();
				//iteration++;
			}
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("You done goofed");
		}
	}

	private static String getUserInput(Scanner sc)
	{
		// prompts user for SMART SQL statement
		System.out.println("\nWelcome to the ECommerce JUnit Junkies Application!"
				+ "\n-------------------------------------------------"
				+ "\nPlease write a valid SQL statement to find your info");
		return sc.nextLine();
	}
	
	public Product getProductFromID()
	{
		
	}
	
	public List<Product> getAllProducts()
	{
		String sql = "SELECT * FROM CoughDrops";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		stmt.close();
		
		
		
	}
	
	public Order getOrderFromID()
	{
		
	}
	
	public List<Order> getAllOrders()
	{
		
	}
	
	public Category getCategoryFromID()
	{
		
	}
	
	public List<Category> getAllCategories()
	{
		
	}
	
	public Customer getCustomerFromID()
	{
		
	}
	
	public List<Customer> getAllCustomers()
	{
		
	}

}
