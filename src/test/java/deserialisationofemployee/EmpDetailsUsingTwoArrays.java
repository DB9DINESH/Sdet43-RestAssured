package deserialisationofemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDeatilsTwoArrays;

public class EmpDetailsUsingTwoArrays {
	@Test
	public void readEmployeeDetails2Arrays() throws Throwable, Throwable, Throwable
	{
		//create object for objectmapper
		ObjectMapper objm=new ObjectMapper();
		//read the values from object mapper
		EmployeeDeatilsTwoArrays emp2=objm.readValue(new File("./empdatatwoarray.json"), EmployeeDeatilsTwoArrays.class);
		 
		//read the values
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEmpname());
		System.out.println(emp2.getAddress());
		System.out.println(emp2.getEmail()[1]);
		System.out.println(emp2.getPhonenum()[1]);
	}

}
