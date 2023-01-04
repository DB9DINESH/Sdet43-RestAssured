package genericUtility;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;

public class JavaUtility {
	
	public int getRandomNumber()
	{
		Random r=new Random();
		int ran = r.nextInt(1000);
		return ran;
		
	}
	

	public String randomAlphabet()
	{
		String alpha = RandomStringUtils.randomAlphabetic(2);
		return alpha;
	}
	
	public String randomNumbers()
	{
		String num = RandomStringUtils.randomNumeric(12);
		return num;
	}

}
