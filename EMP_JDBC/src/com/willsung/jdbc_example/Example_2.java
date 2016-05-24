package com.willsung.jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example_2 {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_PATH = "jdbc:mysql://localhost/hibernate";
	
	static final String DB_USER = "root";
	static final String DB_PSWD = "nothing";
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
				
		try {
			System.out.println("注册驱动.");
			Class.forName(JDBC_DRIVER);
			System.out.println("建立连接.");
			connection = DriverManager.getConnection(DB_PATH,DB_USER,DB_PSWD);
			statement = connection.createStatement();
			
			System.out.println("执行语句.");
			String sql = null;
			sql = "SELECT * FROM student";
			ResultSet rs = statement.executeQuery(sql);
			
			System.out.println("读取数据.");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println("id:" + id + " name:" +name + " age:" + age);
			}
			System.out.println("读取完成，关闭连接.");
			rs.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("安全处理.");
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("操作完成.");
	}
}
