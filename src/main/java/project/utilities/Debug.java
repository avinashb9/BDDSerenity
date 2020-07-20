package project.utilities;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class Debug {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<String> sCustmer = DBUtils.executeQuery("select customer_name from CUSTOMERS");
		System.out.println("CUSTOMER LIST");
		for(String str:sCustmer){
			System.out.println(str);
		}
		String actValues = "abc,def,hdj";
		String[] actVal = actValues.split(",");
		
		Assert.assertTrue("Expected data on UI is not matching with DB", sCustmer.toArray().equals(actVal));
	}

}
