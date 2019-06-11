package Day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithChrome {

	ChromeDriver Driver;
	
public void invokeBrowser() 
{
	
	System.setProperty("webdriver.chrome.driver",
			"C:/Users/Vidhya Ramki/Desktop/eclipse-jee-oxygen-3a-win32-x86_64/eclipse/libs/chromedriver_win32/chromedriver.exe");
	
	Driver = new ChromeDriver();
	
	Driver.manage().window().maximize();
	
	Driver.manage().deleteAllCookies();
	
	Driver.get("http://qatechhub.com");

}
public void getTitleofThePage() {
	System.out.println("Title of the webpage :: " + Driver.getTitle());
}

public void closeBrowser() {
	//Driver.close(); //It closes the current active window
	Driver.quit(); // It closes all the window opened by selenium
}
public void navigateCommands() {
	Driver.navigate().to("http://facebook.com"); //get and navigate are exactly the same
	
	Driver.navigate().back();
	
	Driver.navigate().forward();
	
	Driver.navigate().refresh();
}
}
