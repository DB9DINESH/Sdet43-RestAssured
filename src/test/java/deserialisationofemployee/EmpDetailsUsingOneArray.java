package deserialisationofemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDeatilsUsingArray;

public class EmpDetailsUsingOneArray {

	@Test
	public void empdata1array() throws Throwable, Throwable, Throwable
	{
		//create the object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//read the values from object mapper
		EmployeeDeatilsUsingArray ea=objm.readValue(new File("./empdataonearray.json"),EmployeeDeatilsUsingArray.class );
		
		//read the values
		System.out.println(ea.getAddress());
		System.out.println(ea.getEid());
		System.out.println(ea.getEmpname());
		System.out.println(ea.getPhonenum());
		System.out.println(ea.getEmail()[1]);
	
	}
}
