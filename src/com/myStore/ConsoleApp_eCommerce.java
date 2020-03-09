package com.myStore;

import java.io.IOException;
import java.sql.SQLException;

public class ConsoleApp_eCommerce {

	public static void main(String[] args) throws IOException, SQLException {
		// initialization
		Menu.welcomeScreen();
		
		DatabaseContext dbc;
		try {
			dbc = new DatabaseContext();
			dbc.runStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}
}