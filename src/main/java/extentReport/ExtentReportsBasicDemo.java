package extentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	public ExtentReportsBasicDemo() {
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		test = extent.createTest("MyFirstTest", "Sample description");
		
	}
	
	
	public void externtReport() {
		
	}
	  
     

}
