import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SqlServerDriver");
Connection con=DriverManager.getConnection("jdbc:sqlserver://Servername;database=Employee;"+"IntegratedSecurity=true;");

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Emp");
		while(rs.next())
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3));
		con.close();		
	
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}