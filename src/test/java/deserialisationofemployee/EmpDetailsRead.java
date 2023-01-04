package deserialisationofemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDetails;

public class EmpDetailsRead {

	@Test
	public void readTheEmployeeData() throws Throwable, Throwable, Throwable
	{
		//create object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//read the values from object mapper
		EmployeeDetails e=objm.readValue(new File("./empdata.json"), EmployeeDetails.class);
		
		//fetch the required value from
		System.out.println(e.getEmpname());
		System.out.println(e.getAddress());
	}
}
