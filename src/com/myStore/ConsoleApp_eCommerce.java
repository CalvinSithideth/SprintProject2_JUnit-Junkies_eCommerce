package com.myStore;

import java.sql.SQLException;

public class ConsoleApp_eCommerce {

	public static void main(String[] args) {
		// initialization
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
