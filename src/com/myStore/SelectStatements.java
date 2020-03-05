package com.myStore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SelectStatements {
	static PreparedStatement s;

	static PreparedStatement getStatement(Connection con) throws SQLException {
		String[] tables = { "Customers", "Products", "Categories", "Orders", "OrderDetails", "Suppliers", "Shippers" };
		String sql1 = (String) JOptionPane.showInputDialog(null, "Menu", "Please Select desired table", JOptionPane.QUESTION_MESSAGE,
				null, tables, tables[0]);
		
		String[] fields = getCol(sql1);
		String sql2 = (String) JOptionPane.showInputDialog(null, "Menu", "Please Select desired contents", JOptionPane.QUESTION_MESSAGE,
				null, fields, fields[0]);
		s = con.prepareStatement("SELECT " + sql2 + "FROM " + sql1 + ";");
		return s;
	}
	
	
	static String[] getCol(String table) {
		//how to get 
		return null;
		
	}

}
