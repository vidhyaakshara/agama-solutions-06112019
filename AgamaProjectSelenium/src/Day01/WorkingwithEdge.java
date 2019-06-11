package Day01;


import org.openqa.selenium.edge.EdgeDriver;

public class WorkingwithEdge {

	EdgeDriver Driver;
	
public void invokeBrowser() 
{
	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Vidhya Ramki\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\libs\\MicrosoftWebDriver.exe");
	
	Driver = new EdgeDriver();
	
	Driver.manage().window().maximize();
	
	Driver.manage().deleteAllCookies();
	
	Driver.get("http://qatechhub.com");

}
public void getTitleofThePage() {
	System.out.println("Title of the page :: " + Driver.getTitle());
}

public void closeBrowser() {
	//Driver.close(); //It closes the current active window
	Driver.quit(); // It closes all the window opened by selenium
}
}

