package SerializationOfemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDetailsWithObject;
import pojo_Utilities.SpouseDetails;

public class EmpdatawithObject {

	@Test
	public void empdatawithobj() throws Throwable, Throwable, Throwable
	{
		//create object for pojo class
	     SpouseDetails sobj=new SpouseDetails("Kalavathi", "ABC001", "KAL@gmail.com", 9090909880l, "Bangalore");
		EmployeeDetailsWithObject empd=new EmployeeDetailsWithObject("VundralaDineshumar", "TYSS9999", "Dinesh@gmail.com", 9887766543l, "Nellore", sobj);
		
		//create object for objectmapper
		ObjectMapper objm=new ObjectMapper();
		
		//write values into json file
		objm.writeValue(new File("./empdataobject12.json"), empd);
		
	}
}
