package SerializationOfemployee;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo_Utilities.EmployeeDeatilsTwoArrays;

public class EmpDataUsingTwoArrays {

	@Test
	public void employeeDataTwoArrays() throws Throwable, Throwable, Throwable
	{
		//create object for pojo class
		String[] email= {"dinesh@gmail.com","dinesh@outlook.com"};
		long[] phone= {1234567890,9876543210l};
		EmployeeDeatilsTwoArrays empd=new EmployeeDeatilsTwoArrays("DineshVundrala", "TYSS000", email, phone, "Nellore Andhrapradesh");
		
		//create object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//write values to json
		objm.writeValue(new File("./empdatatwoarray.json"), empd);
	}
}
