package genericUtility;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.mysql.cj.jdbc.Driver;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	Connection con;
	public JavaUtility jlib=new JavaUtility();
	public DatabaseUtility dlib=new DatabaseUtility();
	public ExcelUtility elib=new ExcelUtility();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	
	public ResponseSpecification responsespec;
	public RequestSpecification requestspec ;
	
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.dbURL,IPathConstants.dbUserName,IPathConstants.dbPassword);
	}
	
	@BeforeClass
	public void bcConfig()
	{
		baseURI="http://localhost";
		port=8084;
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri(baseURI);
		builder.setPort(port);
		builder.setContentType(ContentType.JSON);
		requestspec = builder.build();
	}

	@AfterMethod
	public void afConfig()
	{
		ResponseSpecBuilder builder=new ResponseSpecBuilder();
		responsespec = builder.expectContentType(ContentType.JSON).build();
	}
	@AfterSuite
	public void asConfig() throws Throwable
	{
		con.close();

	}
	
}
