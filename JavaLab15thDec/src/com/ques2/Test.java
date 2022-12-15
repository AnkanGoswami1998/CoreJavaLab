////JavaLab exam 15thDec (LIKE command in mysql by jdbc)
////Printing the table whos city name start with s
////Ankan Goswami

package com.ques2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //// java sql import files
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static Connection connect() throws SQLException

	{

		String username = "root"; //// Username
		String password = "Ankan@1998"; //// Password

		String url = "jdbc:mysql://localhost:3306/anudip"; //// Url

		return DriverManager.getConnection(url, username, password); //// Connection created with mysql

	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = connect(); //// Creating conn object

		Statement stmt = conn.createStatement();
		String query = "select * from author where city LIKE 's%'"; //// Writting the like statement in query

		ResultSet rs = stmt.executeQuery(query); //// Executing the query
		System.out.println("AuthorID  Name       City"); //// Printing the table whos city name start with s
		while (rs.next()) {
			System.out.println("     " + rs.getString(1) + "     " + rs.getString(2) + "      " + rs.getString(3));
		}

	} //// end of main

}//// end of class
