package com.myStore;

import java.sql.SQLException;
import java.util.*;

public class ConsoleApp_eCommerce
{

	public static void main(String[] args)
	{

		// Hello
		System.out.println("Welcome to the MyStore Console Application");
		System.out.println("Created by the J-Unit Junkies");

		// Initialize database context and scanner
		Scanner sc = new Scanner(System.in);
		DatabaseContext dbc;
		try
		{
			dbc = new DatabaseContext();
		}
		catch (SQLException e)
		{
			System.out.println("Sorry! Could not connect to the database.");
			e.printStackTrace();
		}
		
		
		
		
	}
}