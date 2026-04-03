package jdbc;
import java.sql.*;
public class Q5 {

	public static void main(String[] args) {
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsg83";
			String password="24bcsg83";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established successfully");
			String qry = "SELECT * FROM student";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			System.out.print("Name\tAge\tRoll\tDept\tCGPA");
			System.out.print("\n");
			while(rs.next()) {
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getInt("age"));
				System.out.print("\t");
				System.out.print(rs.getInt("roll_no"));
				System.out.print("\t");
				System.out.print(rs.getString("department"));
				System.out.print("\t");
				System.out.print(rs.getFloat("cgpa"));
				System.out.print("\n");
			}
			ps.close();
			con.close();
		}
		catch (Exception e ) {
			System.out.println(e);
		}

	}

}
