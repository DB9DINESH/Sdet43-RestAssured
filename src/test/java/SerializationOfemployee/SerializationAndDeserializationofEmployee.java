package SerializationOfemployee;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDetails;

public class SerializationAndDeserializationofEmployee {

	@Test
	public void serializationofEmployeeDetails() throws Throwable, Throwable, Throwable
	{
		//create the object for pojo class

		EmployeeDetails empd=new EmployeeDetails("DineshKumar", "TYSS007", "dinesh@gmail.com", 9663344952l, "Andhrapradesh");

		//create the object for object mapper
		ObjectMapper objm=new ObjectMapper();

		//write the values to json file
		
		objm.writeValue(new File("./empdata.json"), empd);
	}
}
