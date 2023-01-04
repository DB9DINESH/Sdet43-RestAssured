package SerializationOfemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.SpouseDetails;

public class SpDetails {

	@Test
	public void spdetailsspouse() throws Throwable, Throwable, Throwable
	{
		//Create Object for pojo class
		SpouseDetails sobj=new SpouseDetails("PriyankaAnuragUrla", "TYP002", "dpinesh@gmail.com", 9876545690l, "Hubli");
		
		//create object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//write values into json
		objm.writeValue(new File("./spouse.json"), sobj);
	}
}
