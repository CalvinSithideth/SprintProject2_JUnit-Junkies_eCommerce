package com.myStore;

import javax.swing.JScrollPane;

public class ConsoleApp_eCommerce {

	public static void main(String[] args) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.getViewport().setView(myList);a
		myList.setCellRenderer(new MyCellRenderer());
	}

}
