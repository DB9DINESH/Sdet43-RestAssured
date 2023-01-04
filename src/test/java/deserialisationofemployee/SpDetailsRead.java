package deserialisationofemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.SpouseDetails;

public class SpDetailsRead {
	@Test
	public void readTheSpousedetails() throws Throwable, Throwable, Throwable
	{
		//create the object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//read the value from object mapper
		SpouseDetails sp=objm.readValue(new File("./spouse.json"),SpouseDetails.class);
		
		//fetch the required value from the 
		System.out.println(sp.getSname());
		System.out.println(sp.getSphonenum());
				
	}

}
