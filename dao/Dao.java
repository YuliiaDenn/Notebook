package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	private final String URL = "jdbc:mysql://localhost:3306/notebook?serverTimezone=Europe/Kiev";
	private final String USERNAME = "root";
	private final String PASSWORD = "root";

	public Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

}
