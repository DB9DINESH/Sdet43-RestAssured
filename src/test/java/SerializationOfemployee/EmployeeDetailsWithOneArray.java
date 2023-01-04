package SerializationOfemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDeatilsUsingArray;

public class EmployeeDetailsWithOneArray {

	@Test
	public void empdetailsonearray() throws Throwable, Throwable, Throwable
	{
		//Create Object for pojo class
		String[] email= {"dinesh@gmail.com","vdinesh@TYSS.com"};
		EmployeeDeatilsUsingArray empda=new EmployeeDeatilsUsingArray("VDinesh", "TYSS05524",email , 9663344952l, "Andhra");
		
		//create a object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//write the values to json
		objm.writeValue(new File("./empdataonearray.json"), empda);
	}
}
