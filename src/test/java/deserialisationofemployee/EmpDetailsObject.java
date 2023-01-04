package deserialisationofemployee;



import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDetailsWithObject;

public class EmpDetailsObject {
	@Test
	public void deserializaton() throws Throwable, Throwable, Throwable {

	//create object for object mapper
	ObjectMapper objm=new ObjectMapper();
	
	//read the value from objectmapper
	EmployeeDetailsWithObject empo=objm.readValue(new File("./empdataobject12.json"),EmployeeDetailsWithObject.class);
	
	//read the values
	System.out.println(empo.getSpouseDetails());
}
}
