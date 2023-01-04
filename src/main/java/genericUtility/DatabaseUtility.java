package genericUtility;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatabaseUtility {
	public Connection con;
	public String executeQuery(String query,int columnindex,String expdata) throws Throwable
	{
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			//data = result.getString(columnindex);
			//if(data.equalsIgnoreCase(expdata))
			if(result.getString(columnindex).equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("-->data verified");
			return expdata;
		}
		else
		{
			System.out.println("--> data is not verified");
			return "";
		}
	}

}
