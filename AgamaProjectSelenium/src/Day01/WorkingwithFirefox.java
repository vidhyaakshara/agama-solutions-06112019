package Day01;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithFirefox {
	

		FirefoxDriver Driver;
		
	public void invokeBrowser() 
	{
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Vidhya Ramki\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\libs\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		Driver = new FirefoxDriver();
		
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
	public void navigateCommands() {
		Driver.navigate().to("http://facebook.com"); //get and navigate are exactly the same
		
		Driver.navigate().back();
		
		Driver.navigate().forward();
		
		Driver.navigate().refresh();
	}
	}

