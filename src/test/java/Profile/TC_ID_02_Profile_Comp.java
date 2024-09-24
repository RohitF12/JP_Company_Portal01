package Profile;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_1.Launch_Company_Portal;


public class TC_ID_02_Profile_Comp extends Launch_Company_Portal {
	
	 @Test
	   public void Login() throws InterruptedException { 
    
	  Login_Company.Login_Company_Website y = new Login_Company.Login_Company_Website();
	  
	   y.Login2App1();
	    
	   Thread.sleep(5000);
    		
 }
		//To check that toggle closed and open the left panel
		@Test  
		 public void TC_ID_02_01() throws InterruptedException  {
			
			  WebElement Toggle_Lines = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/button"));

	            // Check if the toggle is displayed and enabled
	            boolean isDisplayed = Toggle_Lines.isDisplayed();
	            boolean isEnabled = Toggle_Lines.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed, "Toggle_Lines is not displayed");
	            Assert.assertTrue(isEnabled, "Toggle_Lines is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed && isEnabled) {
	                System.out.println("Toggle_Lines is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Toggle_Lines is either not displayed or not enabled.");
	            }
	  
	            Toggle_Lines.click();
	            
	            Thread.sleep(3000);
	            
				WebElement Toggle_Lines_1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]/button"));
				
				Toggle_Lines_1.click();

	            Thread.sleep(4000);	
			
			
		}
		
		//To check that notification icon
		@Test  
		 public void TC_ID_02_02() throws InterruptedException  {
			
			 WebElement notification_icon = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/button"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed = notification_icon.isDisplayed();
	            boolean isEnabled = notification_icon.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed, "notification_icon is not displayed");
	            Assert.assertTrue(isEnabled, "notification_icon is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed && isEnabled) {
	                System.out.println("notification_icon is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("notification_icon is either not displayed or not enabled.");
	            }
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            notification_icon.click();
			
	            //New_Applications
	            
	            WebElement New_Applications = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/div[1]/a/div/div[2]"));
	            
	            String x= New_Applications.getText();

	            // Check if icon is displayed and enabled
	            boolean isDisplayed1 = New_Applications.isDisplayed();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed1, "notification_icon is not displayed");

	            // Use if-else for additional logic
	            if (isDisplayed1) {
	                System.out.println("New_Applications is displayed"+x);
	            } else {
	                System.out.println("New_Applications is either not displayed");
	            }

	            //clear_All_Button
	            
	            WebElement clear_All_Button = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed12 = clear_All_Button.isDisplayed();
	            boolean isEnabled12 = clear_All_Button.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed12, "clear_All_Button is not displayed");
	            Assert.assertTrue(isEnabled12, "clear_All_Button is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed12 && isEnabled12) {
	                System.out.println("clear_All_Button is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("clear_All_Button is either not displayed or not enabled.");
	            }
			
	            driver.navigate().refresh();
	            
	            Thread.sleep(5000);

		}
		
		//To check the Profile name and option available there 
		@Test  
		 public void TC_ID_02_03() throws InterruptedException  {
			
           WebElement Profile_name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));
			
			String x= Profile_name.getText();

            // Check if icon is displayed and enabled
            boolean isDisplayed = Profile_name.isDisplayed();
            boolean isEnabled = Profile_name.isEnabled();

            // Assert the conditions
            Assert.assertTrue(isDisplayed, "Profile_name is not displayed");
            Assert.assertTrue(isEnabled, "Profile_name is not enabled");

            // Use if-else for additional logic
            if (isDisplayed && isEnabled) {
                System.out.println("Profile_name is displayed and enabled. Ready for interaction."+x);
            } else {
                System.out.println("Profile_name is either not displayed or not enabled.");
            }
		
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    Profile_name.click();    
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    String Option_1_List = driver.findElement(By.xpath("//a[@href='/']")).getText();
			  
		    System.out.println("Option_1_List displayed = " + Option_1_List);

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    String Option_2_List = driver.findElement(By.xpath("//a[@href='/profile']")).getText();
			  
		    System.out.println("Option_2_List displayed = " + Option_2_List);

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    String Option_3_List = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[3]/li")).getText();
			  
		    System.out.println("Option_3_List displayed = " + Option_3_List);

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		

		//To check that Home option is working fine
		@Test  
		 public void TC_ID_02_04() throws InterruptedException  {
	
			 //click_on_Home
			  
			  WebElement Home = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[1]/li/a"));
			  
			  Home.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  // Locate the heading element
		      WebElement headingElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h1"));

		      // Get the text of the heading element
		      String actualHeading = headingElement.getText();

		      // Expected heading name
		      String expectedHeading = "Dashboard";

		      // Compare the text with the expected heading name
		      Assert.assertEquals(actualHeading, expectedHeading, "The page heading is not as expected.");
		      
		      Thread.sleep(5000);
		}
		

		//To check that Profile option is working fine
		@Test  
		 public void TC_ID_02_05() throws InterruptedException  {
			

			  WebElement Click_on_Profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));
			  			  
			  Click_on_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         

			
			  //Click_on_Edit_Profile
			  
             WebElement Click_on_Edit_Profile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[2]/li/a"));
			     
             Click_on_Edit_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   


			  //About_Tab
			  
			  WebElement About_Tab = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/button[1]"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed = About_Tab.isDisplayed();
	            boolean isEnabled = About_Tab.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed, "About_Tab is not displayed");
	            Assert.assertTrue(isEnabled, "About_Tab is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed && isEnabled) {
	                System.out.println("About_Tab is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("About_Tab is either not displayed or not enabled.");
	            }
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			  
			  //Edit_Tab
			    
			    WebElement Edit_Tab = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/button[2]"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed1 = Edit_Tab.isDisplayed();
	            boolean isEnabled1 = Edit_Tab.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed1, "Edit_Tab is not displayed");
	            Assert.assertTrue(isEnabled1, "Edit_Tab is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed1 && isEnabled1) {
	                System.out.println("Edit_Tab is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Edit_Tab is either not displayed or not enabled.");
	            }
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  //Security_Tab
			    
			    WebElement Security_Tab = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/button[3]"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed2 = Security_Tab.isDisplayed();
	            boolean isEnabled2 = Security_Tab.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed2, "Security_Tab is not displayed");
	            Assert.assertTrue(isEnabled2, "Security_Tab is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed2 && isEnabled2) {
	                System.out.println("Security_Tab is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Security_Tab is either not displayed or not enabled.");
	            }
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		  //To check that profile image and added email address
		 @Test  
		 public void TC_ID_02_06() throws InterruptedException  {
			 
			  WebElement Click_on_Profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));
  			  
			  Click_on_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         

			  WebElement Profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[1]"));

	            // Check if icon is displayed and enabled
	            boolean isDisplayed = Profile.isDisplayed();
	            boolean isEnabled = Profile.isEnabled();

	            // Assert the conditions
	            Assert.assertTrue(isDisplayed, "Profile is not displayed");
	            Assert.assertTrue(isEnabled, "Profile is not enabled");

	            // Use if-else for additional logic
	            if (isDisplayed && isEnabled) {
	                System.out.println("Profile is displayed and enabled. Ready for interaction.");
	            } else {
	                System.out.println("Profile is either not displayed or not enabled.");
	            }
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
				  WebElement Email = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/p"));

		            // Check if icon is displayed and enabled
		            boolean isDisplayed1 = Profile.isDisplayed();
		            boolean isEnabled1 = Profile.isEnabled();

		            // Assert the conditions
		            Assert.assertTrue(isDisplayed1, "Email is not displayed");
		            Assert.assertTrue(isEnabled1, "Email is not enabled");

		            // Use if-else for additional logic
		            if (isDisplayed1 && isEnabled1) {
		                System.out.println("Email is displayed and enabled. Ready for interaction.");
		            } else {
		                System.out.println("Email is either not displayed or not enabled.");
		            }
				
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 }
		 

		  //To check Logo and cover photo menu working fine.
		 @Test  
		 public void TC_ID_02_07() throws InterruptedException  {
					
			 WebElement Click_on_Profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));
 			  
			  Click_on_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         

			
			  //Click_on_Edit_Profile
			  
            WebElement Click_on_Edit_Profile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[2]/li/a"));
			     
            Click_on_Edit_Profile.click();
			  
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   

			
			// Specify the path to the file you want to upload
		 	   
	        String filePath = "C:\\Users\\RohitFulzele\\Downloads\\Test_Company\\Test_Company_01.jpg";
	              
	       // Locate the file input element by its name or id or other attribute
	       WebElement fileInput = driver.findElement(By.xpath("//input[@name='jp_logo']"));
	       
	       // Send the file path to the file input element
	       fileInput.sendKeys(filePath);
	       
	       WebElement successMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div/span"));
	       if (successMessage.isDisplayed()) {
	           System.out.println("File upload test passed!");
	       } else {
	           System.out.println("File upload test failed!");
	       }
	       
	       //Enter the path for the photo
	       
	       String filePath_photo = "C:\\Users\\RohitFulzele\\Downloads\\Test_Company\\Cover_01.jpg";
	       
	      // Locate the file input element by its name or id or other attribute
	      WebElement fileInput_photo = driver.findElement(By.xpath("//input[@name='jp_cover_photo']"));
	      
	      // Send the file path to the file input element
	      fileInput_photo.sendKeys(filePath_photo);
	      
	      WebElement successMessage1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[1]/div[2]/div/span"));
	      if (successMessage1.isDisplayed()) {
	          System.out.println("Photo upload test passed!");
	      } else {
	          System.out.println("Photo upload test failed!");
	      }
	       
	       
	          }
	      	

	    //To check that all the fields/drop down available 
	     @Test  
	     public void TC_ID_02_08() throws InterruptedException  {
	    	 
	    	// Locate the field element Add_Company_Name    
	   	  
	   	    WebElement Add_Company_Name_field = driver.findElement(By.xpath("//input[@name='jp_company_name']"));
	   	  
	         // Check if the field is displayed
	         boolean isDisplayed = Add_Company_Name_field.isDisplayed();

	         // Check if the field is enabled
	         boolean isEnabled = Add_Company_Name_field.isEnabled();

	         // Print the results
	         System.out.println("Add_Company_Name_field Displayed: " + isDisplayed);
	         System.out.println("Add_Company_Name_field Enabled: " + isEnabled);
	   	             
	       
	      //Address
	         
	      //City    
	               
	 	  WebElement City_field = driver.findElement(By.xpath("//input[@name='jp_city']"));
		  
	     // Check if the field is displayed
	     boolean isDisplayed_1 = City_field.isDisplayed();
	     		
	     // Check if the field is enabled
	     boolean isEnabled_1 = City_field.isEnabled();

	     // Print the results
	     System.out.println("City_field Displayed: " + isDisplayed_1);
	     System.out.println("City_field Enabled: " + isEnabled_1);
	     
	     //State    
	     
		  WebElement State_dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/input"));
		  
	    // Check if the field is displayed
	    boolean isDisplayed_2 = State_dropdown.isDisplayed();
	    		
	    // Check if the field is enabled
	    boolean isEnabled_2 = State_dropdown.isEnabled();

	    // Print the results
	    System.out.println("State Name dropdown Displayed: " + isDisplayed_2);
	    System.out.println("State Name dropdown Enabled: " + isEnabled_2);
	    
	    //Country   
	    
		  WebElement Country_dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[3]/div[3]/div/div/input"));
		  
		    // Check if the field is displayed
		    boolean isDisplayed_21 = Country_dropdown.isDisplayed();
		    		
		    // Check if the field is enabled
		    boolean isEnabled_21 = Country_dropdown.isEnabled();

		    // Print the results
		    System.out.println("Country_dropdown Displayed: " + isDisplayed_21);
		    System.out.println("Country_dropdown Enabled: " + isEnabled_21);
	    
	    
	    
	    //identify element
	    WebElement m = driver.findElement(By.xpath("//input[@name='jp_founded']"));
	    //scroll to middle with Javascript Executor
	    JavascriptExecutor j = (JavascriptExecutor) driver;
	    j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
	    System.out.println("Text is: " + m.getText()); 
	    
	    //Contact  
	    
	    //Website_Link
	    
		  WebElement Website_Link = driver.findElement(By.xpath("//input[@name='jp_website']"));
		  
	     // Check if the field is displayed
	      boolean isDisplayed_3 = Website_Link.isDisplayed();
	   		
	      // Check if the field is enabled
	      boolean isEnabled_3 = Website_Link.isEnabled();

	     // Print the results
	     System.out.println("Website_Link Displayed: " + isDisplayed_3);
	     System.out.println("Website_Link Enabled: " + isEnabled_3);    
	     
	       
	   //Email
	    
		  WebElement Email_Field = driver.findElement(By.xpath("//input[@name='jp_email']"));
		  
		     // Check if the field is displayed
		      boolean isDisplayed_5 = Email_Field.isDisplayed();
		   		
		     // Check if the field is enabled
		     boolean isEnabled_5 = Email_Field.isEnabled();

		    // Print the results
		    System.out.println("Email_Field Displayed: " + isDisplayed_5);
		    System.out.println("Email_Field Enabled: " + isEnabled_5);
	   
	   //Phone_Number
		    
			  WebElement Phone_Number_Field = driver.findElement(By.xpath("//input[@name='jp_contact_no']"));
			  
			     // Check if the field is displayed
			      boolean isDisplayed_6 = Phone_Number_Field.isDisplayed();
			   		
			     // Check if the field is enabled
			     boolean isEnabled_6 = Phone_Number_Field.isEnabled();

			    // Print the results
			    System.out.println("Phone_Number_Field Displayed: " + isDisplayed_6);
			    System.out.println("Phone_Number_Field Enabled: " + isEnabled_6);
	   
			 //About
			    
			 //Foundation_date
			    
			 WebElement Foundation_date_Field = driver.findElement(By.xpath("//input[@name='jp_founded']"));
				  
		     // Check if the field is displayed
		     boolean isDisplayed_7 = Foundation_date_Field.isDisplayed();
				   		
			 // Check if the field is enabled
			 boolean isEnabled_7 = Foundation_date_Field.isEnabled();

			 // Print the results
		     System.out.println("Foundation_date_Field Displayed: " + isDisplayed_7);
			 System.out.println("Foundation_date_Field Enabled: " + isEnabled_7);   
			    
			 //Industry
				    
		     WebElement Industry_Field = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div[2]/div/div/input"));
					  
		     // Check if the field is displayed
			 boolean isDisplayed_8 = Industry_Field.isDisplayed();
					   		
			 // Check if the field is enabled
		     boolean isEnabled_8 = Industry_Field.isEnabled();

			 // Print the results
		     System.out.println("Industry_Field Displayed: " + isDisplayed_8);
			 System.out.println("Industry_Field Enabled: " + isEnabled_8); 	    
			    
			 //Social_Media   
			 
			 WebElement Social_Media_Field = driver.findElement(By.xpath("//input[@name='jp_social_media_links']"));
			  
		     // Check if the field is displayed
		     boolean isDisplayed_9 = Social_Media_Field.isDisplayed();
				   		
			 // Check if the field is enabled
			 boolean isEnabled_9 = Social_Media_Field.isEnabled();

			 // Print the results
		     System.out.println("Social_Media_Field Displayed: " + isDisplayed_9);
			 System.out.println("Social_Media_Field Enabled: " + isEnabled_9);
			 
			    //identify element
			    WebElement m1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));
			    //scroll to middle with Javascript Executor
			    JavascriptExecutor j1 = (JavascriptExecutor) driver;
			    j1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m1);
			    System.out.println("Text is: " + m1.getText()); 
			 
			    //identify element
			    WebElement m01 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));
			    //scroll to middle with Javascript Executor
			    JavascriptExecutor j01 = (JavascriptExecutor) driver;
			    j01.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m01);
			    System.out.println("Text is: " + m01.getText()); 
			 
			 //Add_Description   
			 
			 WebElement Add_Description_field = driver.findElement(By.xpath("//textarea[@name='jp_about_company']"));
			  
		     // Check if the field is displayed
		     boolean isDisplayed_10 = Add_Description_field.isDisplayed();
				   		
			 // Check if the field is enabled
			 boolean isEnabled_10 = Add_Description_field.isEnabled();

			 // Print the results
		     System.out.println("Social_Media_Field Displayed: " + isDisplayed_10);
			 System.out.println("Social_Media_Field Enabled: " + isEnabled_10);
			 
			 //Add_Button
			 
			 WebElement Add_Button_field = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));
			  
		     // Check if the field is displayed
		     boolean isDisplayed_11 = Add_Button_field.isDisplayed();
				   		
			 // Check if the field is enabled
			 boolean isEnabled_11 = Add_Button_field.isEnabled();

			 // Print the results
		     System.out.println("Social_Media_Field Displayed: " + isDisplayed_11);
			 System.out.println("Social_Media_Field Enabled: " + isEnabled_11);
			 
			 Thread.sleep(2000);

	         driver.navigate().refresh();
	         
		     Thread.sleep(5000);
	   	       
	     }
	    	
	   //Add company with name of "Test Ponds India"
	   @Test  
	   public void TC_ID_02_09() throws InterruptedException  {
		   
		   WebElement Click_on_Profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));
			  
			  Click_on_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         

			
			  //Click_on_Edit_Profile
			  
          WebElement Click_on_Edit_Profile = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[2]/li/a"));
			     
          Click_on_Edit_Profile.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   

      
		   // Specify the path to the file you want to upload
		 	   
		        String filePath = "C:\\Users\\RohitFulzele\\Downloads\\Test_Company\\zathura_images.jpg";
		              
		       // Locate the file input element by its name or id or other attribute
		       WebElement fileInput = driver.findElement(By.xpath("//input[@name='jp_logo']"));
		       
		       // Send the file path to the file input element
		       fileInput.sendKeys(filePath);
		    	       
		       //Enter the path for the photo
		       
		       String filePath_photo = "C:\\Users\\RohitFulzele\\Downloads\\Test_Company\\zathura_cover.jpg";
		       
		      // Locate the file input element by its name or id or other attribute
		      WebElement fileInput_photo = driver.findElement(By.xpath("//input[@name='jp_cover_photo']"));
		      
		      // Send the file path to the file input element
		      fileInput_photo.sendKeys(filePath_photo);      	
		   
	   	// Locate the field element Add_Company_Name    
		   	  
	  	  WebElement Add_Company_Name_field = driver.findElement(By.xpath("//input[@name='jp_company_name']"));

	  	  Add_Company_Name_field.sendKeys("Test Ponds India");         
	      
	     //Address
	        
	     //City    
	              
		  WebElement City_field = driver.findElement(By.xpath("//input[@name='jp_city']"));
		  
		  City_field.sendKeys("Mumbai");
	    
	    //State    
	    
		  WebElement State_dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/input"));
		  
		  State_dropdown.sendKeys("MAHARASHTRA");
		  
		  State_dropdown.click();
		    
	       // Perform the keyboard actions: down arrow key and enter key
		  State_dropdown.sendKeys(Keys.ARROW_UP);
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	       State_dropdown.sendKeys(Keys.ENTER);
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	       State_dropdown.sendKeys(Keys.TAB);
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	          
	   //Country    
		  
	      WebElement Country = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[3]/div[3]/div/div/input"));
		  
	      Country.sendKeys("INDIA");
	      
	      Country.click();
		    
	      // Perform the keyboard actions: down arrow key and enter key
	      Country.sendKeys(Keys.ARROW_UP);
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      Country.sendKeys(Keys.ENTER);
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	      Country.sendKeys(Keys.TAB);
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	     
	   //Contact    
	      
	      //Website_Link
	      
	   	  WebElement Country_dropdown = driver.findElement(By.xpath("//input[@name='jp_website']"));
	   	  
	   	  Country_dropdown.sendKeys("www.pondsindia.com");
	   	  
	   	  //Email
	   
		  WebElement Email_Field = driver.findElement(By.xpath("//input[@name='jp_email']"));
		  
		  Email_Field.sendKeys("Hr@pondsindia.com");
	     
	      //Phone_Number
	   
		  WebElement Phone_Number = driver.findElement(By.xpath("//input[@name='jp_contact_no']"));

		  Phone_Number.sendKeys("9685478543");
	  
			 //About
			    
			 //Foundation_date
			    
			 WebElement Foundation_date_Field = driver.findElement(By.xpath("//input[@name='jp_founded']"));
			 
			 Foundation_date_Field.click();
				  
			 Foundation_date_Field.sendKeys("12052000");
			    
			 //Industry
				    
		     WebElement Industry_Field = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div[5]/div[1]/div[2]/div/div/input"));
					  
		     Industry_Field.sendKeys("Chemicals");   
			    
			 //Social_Media   
			 
			 WebElement Social_Media_Field = driver.findElement(By.xpath("//input[@name='jp_social_media_links']"));
			  
			 Social_Media_Field.sendKeys("Pondsindia.co.in");
			 
			    //identify element
			    WebElement m1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));
			    //scroll to middle with Javascript Executor
			    JavascriptExecutor j1 = (JavascriptExecutor) driver;
			    j1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m1);
			    System.out.println("Text is: " + m1.getText()); 
			 
			 //Add_Description   
			 
			 WebElement Add_Description_field = driver.findElement(By.xpath("//textarea[@name='jp_about_company']"));
			 
			 Add_Description_field.sendKeys("Explore the full range of POND'S® skin care products like lotions, cleansers, serums, body talc, anti-ageing creams, moisturiser & much more on the official POND'S® India website");
			  
		     // Check if the field is displayed
		     
		
		
		
	     }

	   //Click on update button and check the about section  
	     @Test  
	     public void TC_ID_02_10() throws InterruptedException  {			
					
					
	 //Update_Button
			 
			 WebElement Update_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/form/button"));
			 
			 Update_Button.click();
			 	 
			 Thread.sleep(2000);

	        driver.navigate().refresh();
	        
		     Thread.sleep(5000);
		     
		     //About
		     
	      WebElement About = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/button[1]"));
			 
	      About.click();
	      
	     }
	     
	     

		   //To check the profile Image and information displayed  
		     @Test  
		     public void TC_ID_02_11() throws InterruptedException  {	
		    	 
		    	 
  }
		     

		 //To click on security tab and check the information available. 
		  @Test  
		 public void TC_ID_02_12() throws InterruptedException  {	
			  
			  WebElement Security = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/button[3]"));
				
				 Security.click();
				 
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 //Current_Password
					
				  WebElement Current_Password = driver.findElement(By.xpath("//input[@name='current_password']"));

		         // Check if icon is displayed and enabled
		         boolean isDisplayed1 = Current_Password.isDisplayed();
		         boolean isEnabled1 = Current_Password.isEnabled();

		         // Assert the conditions
		         Assert.assertTrue(isDisplayed1, "Current_Password is not displayed");
		         Assert.assertTrue(isEnabled1, "Current_Password is not enabled");

		         // Use if-else for additional logic
		         if (isDisplayed1 && isEnabled1) {
		             System.out.println("Current_Password is displayed and enabled. Ready for interaction.");
		         } else {
		             System.out.println("Current_Password is either not displayed or not enabled.");
		         }
				
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					 //New_Password
					
					  WebElement New_Password = driver.findElement(By.xpath("//input[@name='new_password']"));

			         // Check if icon is displayed and enabled
			         boolean isDisplayed2 = New_Password.isDisplayed();
			         boolean isEnabled2 = New_Password.isEnabled();

			         // Assert the conditions
			         Assert.assertTrue(isDisplayed2, "New_Password is not displayed");
			         Assert.assertTrue(isEnabled2, "New_Password is not enabled");

			         // Use if-else for additional logic
			         if (isDisplayed2 && isEnabled2) {
			             System.out.println("New_Password is displayed and enabled. Ready for interaction.");
			         } else {
			             System.out.println("New_Password is either not displayed or not enabled.");
			         }
					
					    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

						 //Confirm_Password
						
						  WebElement Confirm_Password = driver.findElement(By.xpath("//input[@name='confirm_password']"));

				         // Check if icon is displayed and enabled
				         boolean isDisplayed3 = Confirm_Password.isDisplayed();
				         boolean isEnabled3 = Confirm_Password.isEnabled();

				         // Assert the conditions
				         Assert.assertTrue(isDisplayed3, "Confirm_Password is not displayed");
				         Assert.assertTrue(isEnabled3, "Confirm_Password is not enabled");

				         // Use if-else for additional logic
				         if (isDisplayed3 && isEnabled3) {
				             System.out.println("Confirm_Password is displayed and enabled. Ready for interaction.");
				         } else {
				             System.out.println("Confirm_Password is either not displayed or not enabled.");
				         }
						
						    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

							 //Confirm_Button
							
							  WebElement Confirm_Button = driver.findElement(By.xpath("//input[@name='confirm_password']"));

					         // Check if icon is displayed and enabled
					         boolean isDisplayed4 = Confirm_Button.isDisplayed();
					         boolean isEnabled4 = Confirm_Button.isEnabled();

					         // Assert the conditions
					         Assert.assertTrue(isDisplayed4, "Confirm_Button is not displayed");
					         Assert.assertTrue(isEnabled4, "Confirm_Button is not enabled");

					         // Use if-else for additional logic
					         if (isDisplayed4 && isEnabled4) {
					             System.out.println("Confirm_Button is displayed and enabled. Ready for interaction.");
					         } else {
					             System.out.println("Confirm_Button is either not displayed or not enabled.");
					         }
							
							 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


			  
		  }
		  
		//To click on security tab and check the information available. 
		  @Test  
		 public void TC_ID_02_13() throws InterruptedException  {
			  
			//Current_Password
				
			  WebElement Current_Password = driver.findElement(By.xpath("//input[@name='current_password']"));

			  Current_Password.sendKeys("Arohi@12");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  Thread.sleep(2000);
              
			//New_Password  
			
			  WebElement Confirm = driver.findElement(By.xpath("//input[@name='new_password']"));

			  Confirm.sendKeys("password@1234");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  Thread.sleep(2000);
			  
			  //Confirm_Password  
			  
			  WebElement Confirm_Password = driver.findElement(By.xpath("//input[@name='confirm_password']"));

			  Confirm_Password.sendKeys("password@1234");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  WebElement Confirm_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div/div/div[4]/form/div/button"));

			  Confirm_Button.click();
			  
			  Thread.sleep(5000);
			  
		}
		
		  //To check that logout button is able to logout  
		  @Test  
		  public void TC_ID_02_14() throws InterruptedException  {
			  
			  //Profile_click
			  
			  WebElement Logout_Click = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div"));

			  Logout_Click.click();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  		  
			  //Logout_Click
			  
			  WebElement Logout_Click1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/div[3]/li"));

			  Logout_Click1.click();
			  
			  Thread.sleep(5000);
		  

		     
		     
		     
}
}