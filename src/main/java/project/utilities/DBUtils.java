package project.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class DBUtils {
	
	public static List<String> executeQuery(String sQry) throws SQLException{
		String sResult = "";
		List<String> resultList = new ArrayList<String>();
		Connection con = null;
		//load oracle class
		try {
			Class.forName(ProjectVariables.DB_DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//establish a connection with DB
		try {
			con = DriverManager.getConnection(ProjectVariables.DB_CONNECTION_URL, ProjectVariables.DB_USERNAME, GenericUtils.decode(ProjectVariables.DB_PASSWORD));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if(con!=null){
			System.out.println("Connected to Database...");
		}else{
			Assert.assertTrue("Failed to connect Database", false);
		}
		//Execute the query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sQry);
		
		//store the response in to variable
		while(rs.next()){
			sResult = rs.getString(1);
			System.out.println("Result:"+sResult);
			resultList.add(sResult);
		}
		
		return resultList;
	}

}
