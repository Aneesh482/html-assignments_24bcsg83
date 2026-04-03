package jdbc;
import java.sql.*;
public class Q2 {

	public static void main(String[] args) {
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsg83";
			String password="24bcsg83";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("Connection established successfully");
			Statement st = con.createStatement();
			String query="CREATE TABLE student (" +
                    "roll_no INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "age INT, " +
                    "department VARCHAR(30), " +
                    "cgpa NUMERIC(4,2))";
			st.executeUpdate(query);
			System.out.print("Table Created Successfully");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
