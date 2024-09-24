package Registration;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_1.Launch_Company_Portal;

public class TC_ID_01_Registration extends Launch_Company_Portal {
	
	  @Test

	//To check that application Launcing sucessfully/build check 
	public void TC_ID_01_01() throws InterruptedException { 
		  
		  // Get the current URL
          String currentURL = driver.getCurrentUrl();

          // Define the expected URL
          String expectedURL = "https://jobs.reyan.co.in/session/login/company";

          // Verify the URL
          if (currentURL.equals(expectedURL)) {
              System.out.println("URL verification passed!");
          } else {
              System.out.println("URL verification failed!");
              System.out.println("Expected: " + expectedURL);
              System.out.println("Actual: " + currentURL); 
}
	  }
    	  @Test
    		//To check that the Register link working fine.
    		public void TC_ID_01_02() throws InterruptedException {     
          
    		  // Locate the "Register" link using its text or other attributes
              WebElement registerLink = driver.findElement(By.xpath("//a[@href='/session/signup/company']"));
              
              // Click the "Register" link
              registerLink.click();

              // Wait for the page to load (implicit wait or use explicit wait for better control)
              Thread.sleep(3000); // not recommended for real tests; use WebDriverWait instead

              // Get the current URL after clicking the link
              String currentURL = driver.getCurrentUrl();

              // Define the expected URL (registration page URL)
              String expectedURL = "https://jobs.reyan.co.in/session/signup/company";

              // Verify if the current URL matches the expected URL
              if (currentURL.equals(expectedURL)) {
                  System.out.println("Register link works fine!");
              } else {
                  System.out.println("Register link did not work as expected.");
                  System.out.println("Expected: " + expectedURL);
                  System.out.println("Actual: " + currentURL);
              }        
    		  
    	  }
    	  
    	 @Test
  		//To check that all the fields available
  		public void TC_ID_01_03() throws InterruptedException {  
    		 
    	  // Company_Name
    		 
  	       WebElement Company_Name = driver.findElement(By.xpath("//input[@name='jp_company_name']")); 

  	       // Check if the search bar is displayed and enabled
  	       if (Company_Name.isDisplayed() && Company_Name.isEnabled()) {
  	   
  	           // Optionally, submit the search form
  	        
  	           System.out.println("Company_Name is present and interactable.");
  	       } else {
  	           System.out.println("Company_Name is not interactable.");
  	       }
 
  		  // Email_Field
  		 
  	       WebElement Email_Field = driver.findElement(By.xpath("//input[@name='jp_email']")); 

  	       // Check if the search bar is displayed and enabled
  	       if (Email_Field.isDisplayed() && Email_Field.isEnabled()) {
  	   
  	           // Optionally, submit the search form
  	        
  	           System.out.println("Email_Field is present and interactable.");
  	       } else {
  	           System.out.println("Email_Field is not interactable.");
  	       }
    		 
  	       
 		  // Password_Field
    		 
  	       WebElement Password_Field = driver.findElement(By.xpath("//input[@name='jp_password']")); 

  	       // Check if the search bar is displayed and enabled
  	       if (Password_Field.isDisplayed() && Password_Field.isEnabled()) {
  	   
  	           // Optionally, submit the search form
  	        
  	           System.out.println("Password_Field is present and interactable.");
  	       } else {
  	           System.out.println("Password_Field is not interactable.");
  	       }
    	 }
    	 
    	  @Test
  		//To check the Term and conditions checkbox.
  		public void TC_ID_01_04() throws InterruptedException {  
    		  
    		  //View_TandC
    		      		
    		     WebElement View_TandC = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[5]/button[1]")); 

    	  	       // Check if the search bar is displayed and enabled
    	  	       if (View_TandC.isDisplayed() && View_TandC.isEnabled()) {
    	  	   
    	  	           // Optionally, submit the search form
    	  	        
    	  	           System.out.println("View_TandC is present and interactable.");
    	  	       } else {
    	  	           System.out.println("View_TandC is not interactable.");
    	  	       }	  
    		  
    	  		  //View_Privacy_Policy
		      		
      		     WebElement View_Privacy_Policy = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[5]/button[2]")); 

      	  	       // Check if the search bar is displayed and enabled
      	  	       if (View_Privacy_Policy.isDisplayed() && View_Privacy_Policy.isEnabled()) {
      	  	   
      	  	           // Optionally, submit the search form
      	  	        
      	  	           System.out.println("View_Privacy_Policy is present and interactable.");
      	  	       } else {
      	  	           System.out.println("View_Privacy_Policy is not interactable.");
      	  	       }  
    		  
      		WebElement View_TandC_1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[5]/button[1]")); 
      		
      		View_TandC_1.click();
      		
 	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	       
 	       //Heading
      		
      		 String Get_heading_text = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/h2")).getText();
			  
			 System.out.println("Heading displayed displayed = " + Get_heading_text);
			 
	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 	  //Cross_Button   
	 	     
	 	     WebElement Cross_Button = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (Cross_Button.isDisplayed() && Cross_Button.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("Cross_Button is present and interactable.");
	  	       } else {
	  	           System.out.println("Cross_Button is not interactable.");
	  	       }  
      
		 	 WebElement Cross_Button_1 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")); 
		 	 
		 	Cross_Button_1.click();
		 	
		 	Thread.sleep(5000);
		 	
		 //Privacy_Policy
		 	
           WebElement Privacy_Policy = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[5]/button[2]")); 
      		
      		View_TandC_1.click();
      		
 	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	       
 	       //Heading
      		
      		 String Get_heading_text_Privacy_Policy = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/h2")).getText();
			  
			 System.out.println("Heading displayed displayed = " + Get_heading_text_Privacy_Policy);
			 
	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 	  //Cross_Button   
	 	     
	 	     WebElement Cross_Button_11 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (Cross_Button_11.isDisplayed() && Cross_Button_11.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("Cross_Button is present and interactable.");
	  	       } else {
	  	           System.out.println("Cross_Button is not interactable.");
	  	       }  
      
		 	 WebElement Cross_Button_111 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")); 
		 	 
		 	Cross_Button_111.click();
		 	
		 	Thread.sleep(5000);	
		 	
		 	//Checkbox
		 	
		 	WebElement Checkbox = driver.findElement(By.xpath("//input[@name='remember']")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (Checkbox.isDisplayed() && Checkbox.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("Checkbox is present and interactable.");
	  	       } else {
	  	           System.out.println("Checkbox is not interactable.");
	  	       }  
	  	       
			 	Thread.sleep(5000);	

    	  }
    	  
    	  @Test
  		//To check register button is enable and working fine 
  		public void TC_ID_01_05() throws InterruptedException { 
    		  
    		  //Register_Button
    		  
    			WebElement Register_Button = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button")); 

 	  	       // Check if the Register_Button displayed and enabled
    			
 	  	       if (Register_Button.isDisplayed() && Register_Button.isEnabled()) {
 	  	   
 	  	           // Optionally, submit the search form
 	  	        
 	  	           System.out.println("Register_Button is present and interactable.");
 	  	       } else {
 	  	           System.out.println("Register_Button is not interactable.");
 	  	       }  
 	  	       
 	  	    Thread.sleep(5000);	 	  	       
     	  }
    		  
    	  
    	  @Test
    		//Enter Details of candidate and try to register a New Candidate
    		public void TC_ID_01_06() throws InterruptedException { 
    		  
    		  // Company_Name
     		 
     	       WebElement Company_Name = driver.findElement(By.xpath("//input[@name='jp_company_name']")); 

     	      Company_Name.sendKeys("Test Ponds India");
     	      
 	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
     		  // Email_Field
     		 
     	       WebElement Email_Field = driver.findElement(By.xpath("//input[@name='jp_email']")); 

     	      Email_Field.sendKeys("rfulzele@reyan.co.in");
     	      
 	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     	           	       
    		  // Password_Field
       		 
     	       WebElement Password_Field = driver.findElement(By.xpath("//input[@name='jp_password']"));   
    		  
     	      Password_Field.sendKeys("Password@123");
     	      
 	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     	      
  		 	WebElement Checkbox = driver.findElement(By.xpath("//input[@name='remember']")); 

  		 	Checkbox.click();
  		 	
	 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 			WebElement Register_Button = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button")); 

 			Register_Button.click(); 
    		  
    	  }
    	  
    	  @Test
    		//To check that verify your Email OTP window should be pop up
    		public void TC_ID_01_07() throws InterruptedException { 
    		  
    		  //Cancel
    		 
    		  WebElement Cancel = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (Cancel.isDisplayed() && Cancel.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("Cancel is present and interactable.");
	  	       } else {
	  	           System.out.println("Cancel is not interactable.");
	  	       }  
    		     		      		  
    		  //Resend_OTP
	  	       
	  		  WebElement Resend_OTP = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (Resend_OTP.isDisplayed() && Resend_OTP.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("Resend_OTP is present and interactable.");
	  	       } else {
	  	           System.out.println("Resend_OTP is not interactable.");
	  	       } 
	  	     		  
    		  //verify_OTP
	  	       
	  	     WebElement verify_OTP = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[3]")); 

	  	       // Check if the search bar is displayed and enabled
	  	       if (verify_OTP.isDisplayed() && verify_OTP.isEnabled()) {
	  	   
	  	           // Optionally, submit the search form
	  	        
	  	           System.out.println("verify_OTP is present and interactable.");
	  	       } else {
	  	           System.out.println("verify_OTP is not interactable.");
	  	       } 
	  	     		  
    		  //Cross_Button
	  	       	  	       
		  	     WebElement Cross_Button = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")); 

		  	       // Check if the search bar is displayed and enabled
		  	       if (Cross_Button.isDisplayed() && Cross_Button.isEnabled()) {
		  	   
		  	           // Optionally, submit the search form
		  	        
		  	           System.out.println("Cross_Button is present and interactable.");
		  	       } else {
		  	           System.out.println("Cross_Button is not interactable.");
		  	       }
    } 
    	  
       
    	  @Test
    		//Enter the OTP and click on verify OTP button
    		public void TC_ID_01_08() throws InterruptedException { 
    		  
    		  JavascriptExecutor js = (JavascriptExecutor) driver;    		  
    		  js.executeScript("window.open()");
    		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    		  driver.switchTo().window(tabs.get(1));

  	        // Switch to the new tab
  	        for (String handle : driver.getWindowHandles()) {
  	            driver.switchTo().window(handle);
  	        }

  	        // Navigate to a different URL in the new tab 
  	     driver.get("https://outlook.office365.com/mail/");
  	 	 
  	     Thread.sleep(5000);
  	    
  	  // Wait for the login button to be clickable
  	 
  	 
  	     WebElement emailid = driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div[3]/div/div/div/div[2]/div[2]/div/input[1]"));
  	 
  	     emailid.sendKeys("rfulzele@reyan.co.in");
  	 
  	     WebElement Next_Button = driver.findElement(By.xpath("//input[@type='submit']"));
  	 
  	     Next_Button.click();
  	     
  	     Thread.sleep(5000);
  	     
  	     WebElement Password = driver.findElement(By.xpath("//input[@name='passwd']"));
    	 
  	     Password.sendKeys("Arohi@12");
	 
  	     WebElement Next_Button1= driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input"));
  	  	 
 	     Next_Button1.click();
 	     
	     Thread.sleep(15000);
	     
	     WebElement Stayed_sign_in_yes = driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input"));
	  	 
	     Stayed_sign_in_yes.click();
	     
	     Thread.sleep(8000);

  	     WebElement clickonemail = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]"));
  	 
  	   clickonemail.click();
  	     
  	     Thread.sleep(20000);
  	           
//  	     WebElement open_email = driver.findElement(By.xpath("//span[@title='mail@reyan.co.in']"));
//  	 
//  	    open_email.click();
  	    
  	    WebElement element = driver.findElement(By.xpath("//*[@id=\"UniqueMessageBody_1\"]/div/div/div/div[2]"));
  	    
  	    String content = element.getText();
  	    
  	    System.out.println(content);
  	    
 	     Thread.sleep(5000);
  	    
  	    Pattern pattern = Pattern.compile("\\b(\\d{6})\\b");
  	    
  	    Matcher matcher = pattern.matcher(content);
  	    
  	    String otp = null;
  	    
  	    if (matcher.find())
  	    
  	    {
  	        otp =  matcher.group(1);
  	        
  	        //System.out.println(otp);
  	        
  	               
  	        
  	    }
  	    else {
  	        System.out.println("opt not found");
  	    }
  	    
  	    Set<String> handles = driver.getWindowHandles();
  	    
  	    Iterator it = handles.iterator();
  	 
  	    String Parent_id = (String) it.next();
  	    
  	    String Child_Id = (String) it.next();
  	                             
  	    driver.switchTo().window(Child_Id).close();
  	    
  	    driver.switchTo().window(Parent_id);
  	    
  	    
  	    WebElement otp_Field = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/input"));
  	    
  	    otp_Field.sendKeys(otp);
  	    
  	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[3]")).click();
  	    
 	     Thread.sleep(10000);
 	     
 	     /*
    		  
        	  //click on cross
        	  

        	  WebElement cross = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button"));
        	    
        	   cross.click();
        	  
        	   Thread.sleep(5000);

        	  
        	  //click on login
        	  
        	  WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/p/a"));
        	    
        	  login.click();
        	    
        	     Thread.sleep(5000);
*/

  }

    		    		   	  
      @Test
  		//To check that Email Id field Display/Enable
  		public void TC_ID_01_09() throws InterruptedException { 
    	  


    		  
    		//Email_Id
    	  	       
		  	     WebElement Email_Id = driver.findElement(By.xpath("//input[@name='email']")); 

		  	       // Check if the search bar is displayed and enabled
		  	       if (Email_Id.isDisplayed() && Email_Id.isEnabled()) {
		  	   
		  	           // Optionally, submit the search form
		  	        
		  	           System.out.println("Email_Id is present and interactable.");
		  	       } else {
		  	           System.out.println("Email_Id is not interactable.");
		  	       }
    	  }
    	  
    	  
    	  @Test
  		//To check that Password field Display/Enable
  		public void TC_ID_01_10() throws InterruptedException { 
    		  
    		//Password
    	  	       
		  	     WebElement Password = driver.findElement(By.xpath("//input[@name='password']")); 

		  	       // Check if the search bar is displayed and enabled
		  	       if (Password.isDisplayed() && Password.isEnabled()) {
		  	   
		  	           // Optionally, submit the search form
		  	        
		  	           System.out.println("Password is present and interactable.");
		  	       } else {
		  	           System.out.println("Password is not interactable.");
		  	       }
    	  
    	  }  
    	  
    		//Application should not be login without UserId and Password.
  		
  		@Test 
  		 public void TC_ID_01_11()  {
  			
  			WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']")); 
  	        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']")); 
  	        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));

  	        // Clear any pre-filled values 
  	        userIdField.clear();
  	        
  	        passwordField.clear();

  	        // Login
  	        loginButton.click();

  	        // Locate the error message element (Update the locator as per your application's HTML)
  	        WebElement errorMessage_email = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[1]/p"));

  	        WebElement errorMessage_password = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[2]/p"));
  	        
  	        // Verify if the error message is displayed
  	        if (errorMessage_email.isDisplayed()) {
  	            System.out.println("Test Passed: Error message displayed as expected for Email");
  	            if (errorMessage_password.isDisplayed()) {
  	            	System.out.println("Test Passed: Error message displayed as expected for password.");
  	        } else {
  	            System.out.println("Test Failed: Error message not displayed.");
  			
  			
  			
  	        }}}
  	            
  	        
          // To check login with Correct UserId and Wrong password 
  		
  	         @Test 
  	   		 public void TC_ID_01_12() throws InterruptedException  {
  	        	 	        	 
  	        // Enter a valid user ID and Enter an incorrect password
  	         WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']")); 
  	         
  	    	 WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
  	    	 
  	    	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
  	    	 
            userIdField.clear();
  	        
  	        passwordField.clear();
  	    	 	                          
  	          userIdField.sendKeys("rfulzele@reyan.co.in");
  	          
  	          passwordField.sendKeys("password12");
  	          
  	          // Click the login button	            
  	          loginButton.click();
  	          
  	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//  	          // Verify the error message
//  	          WebElement errorMessage = driver.findElement(By.xpath(""));
//  	          
//  	          String expectedErrorMessage = "Incorrect password";
//  	          
//  	          Assert.assertEquals(errorMessage.getText(), expectedErrorMessage);     
  	          
 	    	   Thread.sleep(5000);
  	          
  	          driver.navigate().refresh();
  	          
  	    	   Thread.sleep(10000);

  	        	 
  	         }
  	         
  	         //To check login with Correct UserId and blank Password
  	         
  	         @Test 
  	  	   	 public void TC_ID_01_13() throws InterruptedException  {
  	        	 
  	        	// Find the UserID input field and enter the correct UserID
  	        	 
  		         WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']")); 
  		         
  		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		         
  				  Thread.sleep(10000);
  		         
  		         userIdField.sendKeys("rfulzele@reyan.co.in");

  	             // Find the Password input field and leave it blank
  	             
  		    	 WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
  		    	 
  		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  	             passwordField.sendKeys("");

  	             // Find the login button and click it
  	             
  		    	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
  		    	 
  	             loginButton.click();

  	             // Wait for the error message to appear
  	             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
  	             WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[2]/p")));

  	             // Validate the error message
  	             String expectedErrorMessage = "Password is required!";
  	             String actualErrorMessage = errorMessage.getText();
  	             if (actualErrorMessage.equals(expectedErrorMessage)) {
  	                 System.out.println("Test passed: Error message is correct.");
  	             } else {
  	                 System.out.println("Test failed: Error message is incorrect.");
  	             }     
  	             
    	    	   Thread.sleep(5000);
  	             
  	             driver.navigate().refresh();
  		          
  	    	   Thread.sleep(10000);

  	       
  	        }
  	         
  	         //Enter wrong UserId and Correct password 
  	         
  	         @Test 
  	  	   	 public void TC_ID_01_14() throws InterruptedException  {
  	        	 
  	        	 // Find the UserID input field and enter an incorrect UserID
  	        	 
  	        	  WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']")); 	    	 	                          
  		         
  	        	  userIdField.sendKeys("hr@reyan.com");


  	             // Find the Password input field and enter the correct password
  	             
  		     	 WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
  		     	 			             
  		     	 passwordField.sendKeys("password@12");
  	             
  	             // Find the login button and click it
  		     	 
  		    	 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
  		    	 
  	             loginButton.click();

  	             // Wait for the error message to appear
  	             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	             WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/form/p[1]")));

  	             // Validate the error message
  	             
  	             String expectedErrorMessage = "No user with this email exists";
  	             String actualErrorMessage = errorMessage.getText();
  	             if (actualErrorMessage.equals(expectedErrorMessage)) {
  	                 System.out.println("Test passed: Error message is correct.");
  	             } else {
  	                 System.out.println("Test failed: Error message is incorrect.");
  	             }	 
  	             
  	             driver.navigate().refresh();
  		          
  	    	   Thread.sleep(5000);

  	           
  	         }
  	         //To check login with blank UserId and correct Password
  	             
  	          @Test 
  		  	  public void TC_ID_01_15() throws InterruptedException  {
  	        	 
  	        	  // Find the UserID input field and leave it blank
  	        	  
  	        	  WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']"));
  	        	  
  	              userIdField.sendKeys("");

  	              // Find the Password input field and enter the correct password
  	              
  			      WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

  	              passwordField.sendKeys("Arohi@12");

  	              // Find the login button and click it
  	              
  	              WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
  			    	 
  		           loginButton.click();

  	              // Wait for the error message to appear
  		           
  	              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	              WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[1]/p")));

  	              // Validate the error message
  	              String expectedErrorMessage = "Email is required!";
  	              
  	              String actualErrorMessage = errorMessage.getText();
  	              
  	              if (actualErrorMessage.equals(expectedErrorMessage)) {
  	                  System.out.println("Test passed: Error message is correct.");
  	              } else {
  	                  System.out.println("Test failed: Error message is incorrect.");
  	              }	 
  	              
  	              driver.navigate().refresh();
  		          
  	     	   Thread.sleep(5000);
  		 	      
  	         }
  			
  	          //Enter Correct UserId and Correct Password
  	          
  	          @Test 
  	  		  public void TC_ID_01_16() throws InterruptedException  {
  	          
  	          
  	        	// Find the UserID input field and enter the correct UserID
  	        	  
  	        	  WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']"));
  	        	        	  
  	              userIdField.sendKeys("rfulzele@reyan.co.in");

  	              // Find the Password input field and enter the correct password
  	              
  			      WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
  			      	              
  	              passwordField.sendKeys("Arohi@12");

  	              // Find the login button and click it
  	              
  	              WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
  	              
  	              loginButton.click();

  	              // Wait for the successful login indicator, e.g., user profile, dashboard, etc.
  	              
  	              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  	              
  	              WebElement successIndicator_logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/img")));
  	              
//  	              // Validate the successful login
//  	              
//  	              if (successIndicator_logo.isDisplayed()) {
//  	            	  
//  	              }
//  	                  System.out.println("Test passed: Login was successful.");
//  	              }else
//  	              {
//  	                  System.out.println("Test failed: Login was not successful.");
//  	              }
  	        	          
                    driver.navigate().refresh();
  		          
             	   Thread.sleep(5000);
  	              
               }
  	          
  	          
  	           //To check that Login Button Enabled/Displayed
                @Test 
                public void TC_ID_01_17()  {	

             	   // Find the login button
                    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

                    // Check if the login button is displayed
                    if (loginButton.isDisplayed()) {
                        System.out.println("Login button is displayed.");
                    } else {
                        System.out.println("Login button is not displayed.");
                    }

                    // Check if the login button is enabled
                    if (loginButton.isEnabled()) {
                        System.out.println("Login button is enabled.");
                    } else {
                        System.out.println("Login button is not enabled.");
                    }
         	   
            }
         	   
  	        
  	          
  	          
             //To check that Password should be accept 8-15 character only

             @Test 
             public void TC_ID_01_18()  {	

            
          	// Define test cases
                 String[] passwords = {"pass1234", "password123456789", "password123"};

                 for (String password : passwords) {
                     // Find the UserID input field and enter a correct UserID
                     WebElement userIdField = driver.findElement(By.xpath("//input[@name='email']"));
                     userIdField.clear(); // Clear the field before entering a new email
                     userIdField.sendKeys("rfulzele@reyan.co.in");

                     // Find the Password input field and enter the test password
                     WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
                     passwordField.clear(); // Clear the field before entering a new password
                     passwordField.sendKeys(password);

                     // Find the login button and click it
                     WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
                     loginButton.click();
                     
                     // Wait for the URL to change or the response message to appear
                     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
                     wait.until(ExpectedConditions.or(
                         ExpectedConditions.urlToBe("https://jobs.reyan.co.in/dashboard/default"),
                         ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/div[2]/div/form/p"))
                     ));

                     String URL = driver.getCurrentUrl();
                     
                     if (URL.equals("https://jobs.reyan.co.in/dashboard/default")) {
                         System.out.println("Login Successful with password: " + password);
                         break; // Exit the loop after successful login
                     } else {
                         // Wait for the response message to appear
                         WebElement responseMessage = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/p"));

                         // Validate the response message based on password length
                         String actualMessage = responseMessage.getText();
                         if (password.length() < 8 || password.length() > 15) {
                             String expectedErrorMessage = "Incorrect password";
                             if (actualMessage.equals(expectedErrorMessage)) {
                                 System.out.println("Test passed for password: " + password);
                             } else {
                                 System.out.println("Test failed for password: " + password + ". Expected error message: " + expectedErrorMessage + " but got: " + actualMessage);
                             }
                         } else {
                             String expectedSuccessMessage = "Login successful";
                             if (actualMessage.equals(expectedSuccessMessage)) {
                                 System.out.println("Test passed for password: " + password);
                             } else {
                                 System.out.println("Test failed for password: " + password + ". Expected success message: " + expectedSuccessMessage + " but got: " + actualMessage);
                             }
                         }

                         // Navigate back to login page for next iteration
                         driver.navigate().refresh();

                         // Adding a short wait to ensure page is refreshed before the next iteration
                         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                     }
                 }
             }  
             
             }                                                                                                                                                                                                                                                                                                                                                                                            