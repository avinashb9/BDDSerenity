package project.utilities;

public class DBQueries {
	
	public static String getCustomerNameWithID(String sID){
		String sQry = "select customer_name from CUSTOMERS where customer_id = "+sID;
		return sQry;
	}

}
