package com.myStore;

import java.sql.SQLException;
import java.util.*;

public class menuController
{
	private DatabaseContext dbc;
	
	public menuController(DatabaseContext dbc)
	{
		this.dbc = dbc;
	}
	
	public int listAllProducts() throws SQLException
	{
		List<Product> products = dbc.getAllProducts();
		
		for (Product p : products)
		{
			System.out.println("SKU: " + p.getSKU());
		}
		
		return getUserInput();
		
	}
}
