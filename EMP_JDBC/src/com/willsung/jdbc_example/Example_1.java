package com.willsung.jdbc_example;

//STEP 1. Import required packages
import java.sql.*;

public class Example_1{
	//设定驱动、数据库路径
	static final String JDBC = "com.mysql.jdbc.Driver";
	static final String DB_PATH = "jdbc:mysql://localhost/hibernate";
	
	//设定数据库用户、密码
	static final String DB_user = "root";
	static final String DB_pswd = "nothing";
	
	public static void main(String[] srgs) {
		Connection connection = null;
		Statement statement = null;
		try {
			//根据驱动路径找到对应类并加载
			Class.forName(JDBC);
			
			System.out.println("连接数据库...");
			connection = DriverManager.getConnection(DB_PATH, DB_user, DB_pswd);
			System.out.println("数据库连接成功.");
			
			//Statement用于执行简单的不需参数的SQL语句
			System.out.println("开始读取数据...");
			statement = connection.createStatement();
			String sql = null;
			sql = "UPDATE student SET age=25 WHERE id=1";
			statement.executeUpdate(sql);
			sql = "INSERT INTO student VALUES(4,'CHANG',22)";
			statement.executeUpdate(sql);
			sql = "SELECT * FROM student";
			//ResultSet中存放 SQL语句执行结果
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("数据删除前...");
			//从ResultSet中循环读出数据
			while (resultSet.next()) {
				//根据数据库key读出相应数值并存储在同类型变量里
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				
				System.out.println("id:" + id + " name:" + name + " age:" + age);
			}
			
			System.out.println("数据删除前...");
			sql = "DELETE FROM student WHERE id = 3";
			statement.executeUpdate(sql);
			sql = "SELECT * FROM student";
			//ResultSet中存放 SQL语句执行结果
			resultSet = statement.executeQuery(sql);
			//从ResultSet中循环读出数据
			while (resultSet.next()) {
				//根据数据库key读出相应数值并存储在同类型变量里
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				
				System.out.println("id:" + id + " name:" + name + " age:" + age);
			}
			
			System.out.println("数据读取完毕.");
			
			resultSet.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("程序结束!");
	}
}