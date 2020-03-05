package com.myStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleApp_eCommerce {

	public static void main(String[] args) {
		// initialization
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/eCommerce_JUnitJunkies";
		String user = "default";
		String password = "COVA";

		// prompts user for SMART SQL statement
		System.out.println("\nWelcome to the ECommerce JUnit Junkies Application!"
				+ "\n-------------------------------------------------"
				+ "\nPlease write a valid SQL statement to find your info");
		String sql = sc.nextLine();

		try {
			// set up connections and statements
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();

			// iterate over resultset
			// Need to update to fit sql column standards
			for (int i = 1; i <= columns; i++) {
				String name = rsmd.getColumnName(i);
				String value = rs.getString(i);
				System.out.println(name + ": " + value);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("You done goofed");
		} finally {
			sc.close();
		}
	}
}
