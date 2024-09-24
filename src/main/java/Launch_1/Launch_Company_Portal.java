package Launch_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class Launch_Company_Portal {
	
	   public static WebDriver driver= null;
		
		//public static WebDriver driver ;
		
		@BeforeClass
			 	   
			public  void launchBrowser() throws InterruptedException {
			
			Reporter.log("======Browser session started=========", true);
			
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RohitFulzele\\Desktop\\RCS\\Testing_Automation\\Job Portal\\chromedriver.exe");
			
//			ChromeOptions S = new ChromeOptions();
//			
//			S.addArguments("--remote-allow-origins=*");
				
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();	
		    driver.get("https://jobs.reyan.co.in/session/login/company");

		    Reporter.log("======Browser session started=========", true);

		    Thread.sleep(10000);
		    
		    
	}
	   
//		@AfterClass
//		public void closeBrowser() {
//			
//			driver.quit();
//			
//			Reporter.log("======Browser session ended=========", true);
//			
//		}

	
	
	
}

