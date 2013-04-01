package project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connec {
	private Connection con;
	public connec() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/ecom","root","");
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
	
}
