package jdbc;
import java.sql.*;
public class Q3 {

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
			Statement st=con.createStatement();
			String qry1="INSERT INTO student VALUES(20,'Aneesh',21,'CSE',9.3)";
			String qry2="INSERT INTO student VALUES(2,'Aman',20,'CSE',9.3)";
			st.executeUpdate(qry1);
			st.executeUpdate(qry2);
			}
		catch(Exception e){
			System.out.print(e);
		}

}
}
