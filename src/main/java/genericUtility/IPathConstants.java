package genericUtility;

public interface IPathConstants {
	String dbURL="jdbc:mysql://localhost:3306/projects";
	String dbUserName="root";
	String dbPassword="root";
	String createProject="/addProject";
	String getAllProject="/projects";
	String getSingleProject="/projects/";
	String updateProject="/projects";
	String deleteProject="/projects";
	String excelPath = "./src\\test\\resources\\ExcelFile.xlsx";

}
