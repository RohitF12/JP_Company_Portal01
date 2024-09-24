package Post_A_Job;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_1.Launch_Company_Portal;

public class TC_ID_03_Post_A_Job extends Launch_Company_Portal {
		
		  @Test
		   public void Login() throws InterruptedException { 
		
			  Login_Company.Login_Company_Website x = new  Login_Company.Login_Company_Website();
				
			    x.Login2App1();
	    
	}

		   @Test
		   //To check the page name displayed 
		   public void TC_ID_03_01() throws InterruptedException { 
	        
	        WebElement Post_a_job = driver.findElement(By.xpath("//a[@href='/jobs/postjob']"));
			 
	        Post_a_job.click();
			 
			 Thread.sleep(5000);
			
			  // Locate the heading element
	        WebElement headingElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/h1"));

	        // Get the text of the heading element
	        String actualHeading = headingElement.getText();

	        // Expected heading name
	        String expectedHeading = "Post A Job";

	        // Compare the text with the expected heading name
	        Assert.assertEquals(actualHeading, expectedHeading, "The page heading is not as expected.");
	        
	        Thread.sleep(15000);
	        
		   }
		   
		   @Test
		   //To check the all the fields/ dropdown displayed
		   public void TC_ID_03_02() throws InterruptedException { 
			   
			   
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		          // Check if the field is displayed
		          boolean isDisplayed = Job_Title_Field.isDisplayed();

		          // Check if the field is enabled
		          boolean isEnabled = Job_Title_Field.isEnabled();

		          // Print the results
		          System.out.println("Job_Title_Field Displayed: " + isDisplayed);
		          System.out.println("Job_Title_Field Enabled: " + isEnabled);
			   
			  //Company_List_Dropdown 
			   
	    	  WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	  
		          // Check if the field is displayed
		          boolean isDisplayed1 = Company_List_Dropdown.isDisplayed();

		          // Check if the field is enabled
		          boolean isEnabled1 = Company_List_Dropdown.isEnabled();

		          // Print the results
		          System.out.println("Company_List_Dropdown Displayed: " + isDisplayed1);
		          System.out.println("Company_List_Dropdown Enabled: " + isEnabled1);
			   
			   //Start_Date
			   
   	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	  
		          // Check if the field is displayed
		          boolean isDisplayed2 = Start_Date.isDisplayed();

		          // Check if the field is enabled
		          boolean isEnabled2 = Start_Date.isEnabled();

		          // Print the results
		          System.out.println("Start_Date Displayed: " + isDisplayed2);
		          System.out.println("Start_Date Enabled: " + isEnabled2);  
		          
		        //End_Date
				   
	   	           WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
			    	  
			          // Check if the field is displayed
			          boolean isDisplayed3 = End_Date.isDisplayed();

			          // Check if the field is enabled
			          boolean isEnabled3 = End_Date.isEnabled();

			          // Print the results
			          System.out.println("End_Date Displayed: " + isDisplayed3);
			          System.out.println("End_Date Enabled: " + isEnabled3);    
			      
                 // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		                WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed4 = Employment_Type.isDisplayed();
			            boolean isEnabled4 = Employment_Type.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed4, "Employment_Type is not displayed");
			            Assert.assertTrue(isEnabled4, "Employment_Type is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed4 && isEnabled4) {
			                System.out.println("Employment_Type is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Employment_Type is either not displayed or not enabled.");
			            } 
			          
			     //Experience_Level
			            
			            WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed5 = Experience_Level.isDisplayed();
			            boolean isEnabled5 = Experience_Level.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed5, "Experience_Level is not displayed");
			            Assert.assertTrue(isEnabled5, "Experience_Level is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed5 && isEnabled5) {
			                System.out.println("Experience_Level is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Experience_Level is either not displayed or not enabled.");
			            }   
			            
			            		            
 			     //Highest_Education_Level
			            
			            WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed6 = Highest_Education_Level.isDisplayed();
			            boolean isEnabled6 = Highest_Education_Level.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed6, "Highest_Education_Level is not displayed");
			            Assert.assertTrue(isEnabled6, "Highest_Education_Level is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed6 && isEnabled6) {
			                System.out.println("Highest_Education_Level is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Highest_Education_Level is either not displayed or not enabled.");
			            } 
			          
			     //Required_Degree_field  
			            
			            WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed7 = Required_Degree_field.isDisplayed();
			            boolean isEnabled7 = Required_Degree_field.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed7, "Required_Degree_field is not displayed");
			            Assert.assertTrue(isEnabled7, "Required_Degree_field is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed7 && isEnabled7) {
			                System.out.println("Required_Degree_field is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Required_Degree_field is either not displayed or not enabled.");
			            } 
			          
			     //Skill_Requirement
			          
			     //Add_Skill_Button
			            
			            WebElement Add_Skill_Button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed8 = Add_Skill_Button.isDisplayed();
			            boolean isEnabled8 = Add_Skill_Button.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed8, "Add_Skill_Button is not displayed");
			            Assert.assertTrue(isEnabled8, "Add_Skill_Button is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed8 && isEnabled8) {
			                System.out.println("Add_Skill_Button is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Add_Skill_Button is either not displayed or not enabled.");
			            }  
			            
			          
			     //Required_Skill
			            
			            WebElement Required_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed9 = Required_Skill.isDisplayed();
			            boolean isEnabled9 = Required_Skill.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed9, "Required_Skill is not displayed");
			            Assert.assertTrue(isEnabled9, "Required_Skill is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed9 && isEnabled9) {
			                System.out.println("Required_Skill is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Required_Skill is either not displayed or not enabled.");
			            }  
			          
			            
			            //identify element
		                WebElement m = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));
		                //scroll to middle with Javascript Executor
		                JavascriptExecutor j = (JavascriptExecutor) driver;
		                j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
		                System.out.println("Text is: " + m.getText()); 
		                
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed10 = Minimum_Pay_Ranges.isDisplayed();
			            boolean isEnabled10 = Minimum_Pay_Ranges.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed10, "Minimum_Pay_Ranges is not displayed");
			            Assert.assertTrue(isEnabled10, "Minimum_Pay_Ranges is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed10 && isEnabled10) {
			                System.out.println("Minimum_Pay_Ranges is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Minimum_Pay_Ranges is either not displayed or not enabled.");
			            }  
			          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed11 = Maximum_Pay_Ranges.isDisplayed();
			            boolean isEnabled11 = Maximum_Pay_Ranges.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed11, "Maximum_Pay_Ranges is not displayed");
			            Assert.assertTrue(isEnabled11, "Maximum_Pay_Ranges is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed11 && isEnabled11) {
			                System.out.println("Maximum_Pay_Ranges is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Maximum_Pay_Ranges is either not displayed or not enabled.");
			            }  
			  
		   }
		   
		   
		   @Test
		   //To check the all the fields/ dropdown displayed
		   public void TC_ID_03_03() throws InterruptedException { 
			            
			     	            
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed12 = Location_Type.isDisplayed();
			            boolean isEnabled12 = Location_Type.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed12, "Location_Type is not displayed");
			            Assert.assertTrue(isEnabled12, "Location_Type is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed12 && isEnabled12) {
			                System.out.println("Location_Type is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Location_Type is either not displayed or not enabled.");
			            }
			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed13 = City.isDisplayed();
			            boolean isEnabled13 = City.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed13, "City is not displayed");
			            Assert.assertTrue(isEnabled13, "City is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed13 && isEnabled13) {
			                System.out.println("City is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("City is either not displayed or not enabled.");
			            }
			          
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed14 = State.isDisplayed();
			            boolean isEnabled14 = State.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed14, "State is not displayed");
			            Assert.assertTrue(isEnabled14, "State is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed14 && isEnabled14) {
			                System.out.println("State is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("State is either not displayed or not enabled.");
			            }
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed16 = Add_benifit.isDisplayed();
			            boolean isEnabled16 = Add_benifit.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed16, "Add_benifit is not displayed");
			            Assert.assertTrue(isEnabled16, "Add_benifit is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed16 && isEnabled16) {
			                System.out.println("Add_benifit is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Add_benifit is either not displayed or not enabled.");
			            }
			          
			          
			     //Job_Benifit
			            
			            WebElement Job_Benifit = driver.findElement(By.xpath("//input[@placeholder='Job Benefits']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed17 = Job_Benifit.isDisplayed();
			            boolean isEnabled17 = Job_Benifit.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed17, "Job_Benifit is not displayed");
			            Assert.assertTrue(isEnabled17, "Job_Benifit is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed17 && isEnabled17) {
			                System.out.println("Job_Benifit is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Job_Benifit is either not displayed or not enabled.");
			            }
			          
			     //Add Job Description     
			          
			     //Job_Description   
			            
			            WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed18 = Job_Description.isDisplayed();
			            boolean isEnabled18 = Job_Description.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed18, "Job_Description is not displayed");
			            Assert.assertTrue(isEnabled18, "Job_Description is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed18 && isEnabled18) {
			                System.out.println("Job_Description is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Job_Description is either not displayed or not enabled.");
			            }
			          
			     //Submit      
			          
			            WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			            // Check if the field is displayed and enabled
			            boolean isDisplayed19 = Submit.isDisplayed();
			            boolean isEnabled19 = Submit.isEnabled();

			            // Assert the conditions
			            Assert.assertTrue(isDisplayed19, "Submit is not displayed");
			            Assert.assertTrue(isEnabled19, "Submit is not enabled");

			            // Use if-else for additional logic
			            if (isDisplayed19 && isEnabled19) {
			                System.out.println("Submit is displayed and enabled. Ready for interaction.");
			            } else {
			                System.out.println("Submit is either not displayed or not enabled.");
			            }
			          
			                   
}
		   @Test
		//  Try to post a job with name "Android Developer" and check the submit message 	
		   public void TC_ID_03_04() throws InterruptedException { 
			   
			   
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		    	  Job_Title_Field.sendKeys("Android Developer");
			   
			    //Company_List_Dropdown 
			   
	    	    WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	
	    	    Company_List_Dropdown.sendKeys("Test Company01 Ltd");
	    	  
	    	    Company_List_Dropdown.click();
	    	    
		        // Perform the keyboard actions: down arrow key and enter key
	    	    Company_List_Dropdown.sendKeys(Keys.ARROW_UP);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            Company_List_Dropdown.sendKeys(Keys.ENTER);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          
	            Company_List_Dropdown.sendKeys(Keys.TAB);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
		         
			   //Start_Date
			   
	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	
	           Start_Date.sendKeys("08012024");
		       
               Thread.sleep(2000);	
               
               //End_Date
					            
	   	        WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
	   	           
	   	        End_Date.click();
	   	        
	            Thread.sleep(2000);	
			    	  
	   	        End_Date.sendKeys("08312024");
	   	        
	            Thread.sleep(2000);	
		      			      
              // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		         WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

		          Employment_Type.sendKeys("Full-Time");
			          
		          Employment_Type.click();
			    	    
				  // Perform the keyboard actions: down arrow key and enter key
		          Employment_Type.sendKeys(Keys.ARROW_UP);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Employment_Type.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			       Employment_Type.sendKeys(Keys.TAB);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			       		                
			     //Experience_Level
			            
			     WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));
                        
			     Experience_Level.sendKeys("Fresher/Entry-Level");
			            
			     Experience_Level.click();
			    	    
				 // Perform the keyboard actions: down arrow key and enter key
                 Experience_Level.sendKeys(Keys.ARROW_UP);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Experience_Level.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			      Experience_Level.sendKeys(Keys.TAB);
			            
		          Thread.sleep(3000);

			            			            		            
			     //Highest_Education_Level
			            
		        WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[3]/div/div/input"));

			    Highest_Education_Level.sendKeys("Bachelor's Degree");
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			    Highest_Education_Level.click();
			    	    
				// Perform the keyboard actions: down arrow key and enter key
			    Highest_Education_Level.sendKeys(Keys.ARROW_DOWN);
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			     Highest_Education_Level.sendKeys(Keys.ENTER);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			     Highest_Education_Level.sendKeys(Keys.TAB);
			            
	            Thread.sleep(3000);

			         
			  //Required_Degree_field  
			            
		      WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));
			            
			  Required_Degree_field.sendKeys("BE");
			            
			  Thread.sleep(7000);

			  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor j = (JavascriptExecutor) driver;
		       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
               System.out.println("Text is: " + m.getText());  

			  //Skill_Requirement
			          
			  //Add_Skill_Button
			            

			         // Locate the Add Skill button
				        WebElement addSkillButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

				        // Click the Add Skill button
				        addSkillButton.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new skill field to appear or success message to be displayed
				      	        
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement newSkillField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='jp_skills']")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_Skill = driver.findElement(By.xpath("//input[@id='jp_skills']"));

				        Add_Skill.sendKeys("Android Developement");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement addSkillButton_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         addSkillButton_3.click();
				         
					     Thread.sleep(5000); 
				         
				         //Click on Add_Skill_Button
				          
				          WebElement Enter_Add_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

				         Enter_Add_Skill.sendKeys("Android Developement");
				         
				         Thread.sleep(2000);
				         
			            Enter_Add_Skill.click();
				        // Perform the keyboard actions: down arrow key and enter key
			            Enter_Add_Skill.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Enter_Add_Skill.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Enter_Add_Skill.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
				         Thread.sleep(7000);

			          
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            Minimum_Pay_Ranges.sendKeys("25000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			          		          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));
			            
			            Maximum_Pay_Ranges.sendKeys("35000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));
			            
			            Location_Type.sendKeys("Onsite");
			            
			            Location_Type.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
                        Location_Type.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Location_Type.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Location_Type.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          		           			         			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            City.sendKeys("Delhi");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			           
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            State.sendKeys("DELHI");
			            
			            State.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
			            State.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            State.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            State.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));
                 
			            // Click the Add Skill button
				        
			            Add_benifit.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new Benifit field to appear or success message to be displayed
				      	        
				        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement NewBenifit = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_benifit_here = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input"));

				        Add_benifit_here.sendKeys("Health Insurence");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement Click_on_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         Click_on_Button.click();
				         
				         Thread.sleep(5000);
				         
					   //Add Job Description     
				          
					  //Job_Description   
								       
					  WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

		              Job_Description.sendKeys("We are looking for an Android Developer who possesses a passion for pushing mobile technologies to the limits. This Android app developer will work with our team of talented engineers to design and build the next generation of our mobile applications. Android programming works closely with other app");
								        			
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				         

				     //Click on Add_Benifit_Field
				          
				     WebElement Add_Benifit_Fields = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div/div[9]/div/div/div/input"));

				     Add_Benifit_Fields.sendKeys("Health Insurence");
				         
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         
				     Add_Benifit_Fields.click();
				         
				     // Perform the keyboard actions: down arrow key and enter key
				     
				     Add_Benifit_Fields.sendKeys(Keys.ARROW_UP);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			         Add_Benifit_Fields.sendKeys(Keys.ENTER);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			         Add_Benifit_Fields.sendKeys(Keys.TAB);
			                						            
				 Thread.sleep(5000);
			  			          		  		         		       		            
			     //Submit      
			          
			      WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			      Submit.click();
			            
			      Thread.sleep(10000);
			            
			      driver.navigate().refresh();
			          
			      Thread.sleep(10000);
		   }
		   
		   
		   @Test
		//  Try to post a job with name "Data Analyst" and check the submit message 	
		   public void TC_ID_03_05() throws InterruptedException { 
			   
			   //Post a Job
			   
			   WebElement Post_a_job = driver.findElement(By.xpath("//a[@href='/jobs/postjob']"));
				 
		        Post_a_job.click();
				 
				 Thread.sleep(5000);
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		    	  Job_Title_Field.sendKeys("Data Analyst");
			   
			    //Company_List_Dropdown 
			   
	    	    WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	
	    	    Company_List_Dropdown.sendKeys("Test Company02 Ltd");
	    	  
	    	    Company_List_Dropdown.click();
	    	    
		        // Perform the keyboard actions: down arrow key and enter key
	    	    Company_List_Dropdown.sendKeys(Keys.ARROW_UP);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            Company_List_Dropdown.sendKeys(Keys.ENTER);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          
	            Company_List_Dropdown.sendKeys(Keys.TAB);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
		         
			   //Start_Date
			   
	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	
	           Start_Date.sendKeys("06012024");
		       
               Thread.sleep(2000);	
               
               //End_Date
					            
	   	        WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
	   	           
	   	        End_Date.click();
	   	        
	            Thread.sleep(2000);	
			    	  
	   	        End_Date.sendKeys("07302024");
	   	        
	            Thread.sleep(2000);	
		      			      
              // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		         WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

		          Employment_Type.sendKeys("Full-Time");
			          
		          Employment_Type.click();
			    	    
				  // Perform the keyboard actions: down arrow key and enter key
		          Employment_Type.sendKeys(Keys.ARROW_UP);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Employment_Type.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			       Employment_Type.sendKeys(Keys.TAB);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			       		                
			     //Experience_Level
			            
			     WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));
                        
			     Experience_Level.sendKeys("Mid-Level");
			            
			     Experience_Level.click();
			    	    
				 // Perform the keyboard actions: down arrow key and enter key
                 Experience_Level.sendKeys(Keys.ARROW_UP);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Experience_Level.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			      Experience_Level.sendKeys(Keys.TAB);
			            
		          Thread.sleep(3000);

			            			            		            
			     //Highest_Education_Level
			            
		        WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[3]/div/div/input"));

			    Highest_Education_Level.sendKeys("Bachelor's Degree");
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			    Highest_Education_Level.click();
			    	    
				// Perform the keyboard actions: down arrow key and enter key
			    Highest_Education_Level.sendKeys(Keys.ARROW_DOWN);
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			     Highest_Education_Level.sendKeys(Keys.ENTER);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			     Highest_Education_Level.sendKeys(Keys.TAB);
			            
	            Thread.sleep(3000);

			         
			  //Required_Degree_field  
			            
		      WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));
			            
			  Required_Degree_field.sendKeys("BE");
			            
			  Thread.sleep(7000);

			  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor j = (JavascriptExecutor) driver;
		       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
               System.out.println("Text is: " + m.getText());  

			  //Skill_Requirement
			          
			  //Add_Skill_Button
			            

			         // Locate the Add Skill button
				        WebElement addSkillButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

				        // Click the Add Skill button
				        addSkillButton.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new skill field to appear or success message to be displayed
				      	        
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement newSkillField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='jp_skills']")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_Skill = driver.findElement(By.xpath("//input[@id='jp_skills']"));

				        Add_Skill.sendKeys("PowerBi");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement addSkillButton_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         addSkillButton_3.click();
				         
					     Thread.sleep(5000); 
				         
				         //Click on Add_Skill_Button
				          
				          WebElement Enter_Add_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

				         Enter_Add_Skill.sendKeys("PowerBi");
				         
				         Thread.sleep(2000);
				         
			            Enter_Add_Skill.click();
				        // Perform the keyboard actions: down arrow key and enter key
			            Enter_Add_Skill.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Enter_Add_Skill.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Enter_Add_Skill.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
				         Thread.sleep(7000);

			          
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            Minimum_Pay_Ranges.sendKeys("50000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			          		          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));
			            
			            Maximum_Pay_Ranges.sendKeys("65000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));
			            
			            Location_Type.sendKeys("Onsite");
			            
			            Location_Type.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
                        Location_Type.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Location_Type.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Location_Type.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          		           			         			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            City.sendKeys("Pune");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			           
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            State.sendKeys("MAHARASHTRA");
			            
			            State.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
			            State.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            State.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            State.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));
                 
			            // Click the Add Skill button
				        
			            Add_benifit.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new Benifit field to appear or success message to be displayed
				      	        
				        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement NewBenifit = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_benifit_here = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input"));

				        Add_benifit_here.sendKeys("Business Analyst");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement Click_on_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         Click_on_Button.click();
				         
				         Thread.sleep(5000);
				         
					   //Add Job Description     
				          
					  //Job_Description   
								       
					  WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

		              Job_Description.sendKeys("A Data Analyst, or Analytics Manager, collects, stores, and analyses large sets of data to identify trends and insights and design and implement data-driven solutions for an organisation. Their duties include verifying data accuracy, using statistical tools to analyse complex data to interpret trends and patterns and creating data systems and reports for management.");
								        			
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				         

				     //Click on Add_Benifit_Field
				          
				     WebElement Add_Benifit_Fields = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div/div[9]/div/div/div/input"));

				     Add_Benifit_Fields.sendKeys("Business Analyst");
				         
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         
				     Add_Benifit_Fields.click();
				         
				     // Perform the keyboard actions: down arrow key and enter key
				     
				     Add_Benifit_Fields.sendKeys(Keys.ARROW_UP);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			         Add_Benifit_Fields.sendKeys(Keys.ENTER);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			         Add_Benifit_Fields.sendKeys(Keys.TAB);
			                						            
				 Thread.sleep(5000);
			  			          		  		         		       		            
			     //Submit      
			          
			      WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			      Submit.click();
			            
			      Thread.sleep(10000);
			            
			      driver.navigate().refresh();
			          
			      Thread.sleep(10000);	 
			      
		   }
		   
		   
		@Test
        //  Try to post a job with name "Project Manager" and check the submit message 	
		   public void TC_ID_03_06() throws InterruptedException { 
			   
			   //Post a job
			
			    WebElement Post_a_job = driver.findElement(By.xpath("//a[@href='/jobs/postjob']"));
			 
		        Post_a_job.click();
				 
				 Thread.sleep(5000);
			   
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		    	  Job_Title_Field.sendKeys("Project Manager");
			   
			    //Company_List_Dropdown 
			   
	    	    WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	
	    	    Company_List_Dropdown.sendKeys("Test Company03 Ltd");
	    	  
	    	    Company_List_Dropdown.click();
	    	    
		        // Perform the keyboard actions: down arrow key and enter key
	    	    Company_List_Dropdown.sendKeys(Keys.ARROW_UP);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            Company_List_Dropdown.sendKeys(Keys.ENTER);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          
	            Company_List_Dropdown.sendKeys(Keys.TAB);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
		         
			   //Start_Date
			   
	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	
	           Start_Date.sendKeys("08012024");
		       
            Thread.sleep(2000);	
            
            //End_Date
					            
	   	        WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
	   	           
	   	        End_Date.click();
	   	        
	            Thread.sleep(2000);	
			    	  
	   	        End_Date.sendKeys("08312024");
	   	        
	            Thread.sleep(2000);	
		      			      
           // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		         WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

		          Employment_Type.sendKeys("Full-Time");
			          
		          Employment_Type.click();
			    	    
				  // Perform the keyboard actions: down arrow key and enter key
		          Employment_Type.sendKeys(Keys.ARROW_UP);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Employment_Type.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			       Employment_Type.sendKeys(Keys.TAB);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			       		                
			     //Experience_Level
			            
			     WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));
                     
			     Experience_Level.sendKeys("Intermediate");
			            
			     Experience_Level.click();
			    	    
				 // Perform the keyboard actions: down arrow key and enter key
              Experience_Level.sendKeys(Keys.ARROW_UP);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Experience_Level.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			      Experience_Level.sendKeys(Keys.TAB);
			            
		          Thread.sleep(3000);
			            			            		            
			     //Highest_Education_Level
			            
		        WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[3]/div/div/input"));

			    Highest_Education_Level.sendKeys("Master's Degree");
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			    Highest_Education_Level.click();
			    	    
				// Perform the keyboard actions: down arrow key and enter key
			    Highest_Education_Level.sendKeys(Keys.ARROW_DOWN);
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			     Highest_Education_Level.sendKeys(Keys.ENTER);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			     Highest_Education_Level.sendKeys(Keys.TAB);
			            
	            Thread.sleep(3000);

			         
			  //Required_Degree_field  
			            
		      WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));
			            
			  Required_Degree_field.sendKeys("ME");
			            
			  Thread.sleep(7000);

			  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor j = (JavascriptExecutor) driver;
		       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
            System.out.println("Text is: " + m.getText());  

			  //Skill_Requirement
			          
			  //Add_Skill_Button
			            

			         // Locate the Add Skill button
				        WebElement addSkillButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

				        // Click the Add Skill button
				        addSkillButton.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new skill field to appear or success message to be displayed
				      	        
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement newSkillField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='jp_skills']")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_Skill = driver.findElement(By.xpath("//input[@id='jp_skills']"));

				        Add_Skill.sendKeys("Project Developement");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement addSkillButton_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         addSkillButton_3.click();
				         
					     Thread.sleep(5000); 
				         
				         //Click on Add_Skill_Button
				          
				          WebElement Enter_Add_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

				         Enter_Add_Skill.sendKeys("Project Developement");
				         
				         Thread.sleep(2000);
				         
			            Enter_Add_Skill.click();
				        // Perform the keyboard actions: down arrow key and enter key
			            Enter_Add_Skill.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Enter_Add_Skill.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Enter_Add_Skill.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
				         Thread.sleep(7000);

			          
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            Minimum_Pay_Ranges.sendKeys("65000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			          		          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));
			            
			            Maximum_Pay_Ranges.sendKeys("75000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));
			            
			            Location_Type.sendKeys("Onsite");
			            
			            Location_Type.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
                     Location_Type.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Location_Type.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Location_Type.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          		           			         			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            City.sendKeys("Banglore");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			           
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            State.sendKeys("KARNATAKA");
			            
			            State.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
			            State.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            State.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            State.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));
              
			            // Click the Add Skill button
				        
			            Add_benifit.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new Benifit field to appear or success message to be displayed
				      	        
				        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement NewBenifit = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_benifit_here = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input"));

				        Add_benifit_here.sendKeys("Professional Development");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement Click_on_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         Click_on_Button.click();
				         
				         Thread.sleep(5000);
				         
					   //Add Job Description     
				          
					  //Job_Description   
								       
					  WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

		              Job_Description.sendKeys("This job requires a high level of expertise in project planning and communication between teams, and scheduling tasks. People in this role often oversee multiple projects, monitor their progress and completion, and ensure that they meet the overall business goals and objectives ");
								        			
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				         

				     //Click on Add_Benifit_Field
				          
				     WebElement Add_Benifit_Fields = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div/div[9]/div/div/div/input"));

				     Add_Benifit_Fields.sendKeys("Professional Development");
				         
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         
				     Add_Benifit_Fields.click();
				         
				     // Perform the keyboard actions: down arrow key and enter key
				     
				     Add_Benifit_Fields.sendKeys(Keys.ARROW_UP);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			         Add_Benifit_Fields.sendKeys(Keys.ENTER);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			         Add_Benifit_Fields.sendKeys(Keys.TAB);
			                						            
				 Thread.sleep(5000);
			  			          		  		         		       		            
			     //Submit      
			          
			      WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			      Submit.click();
			            
			      Thread.sleep(10000);
			            
			      driver.navigate().refresh();
			          
			      Thread.sleep(10000);	
		}
		
		@Test
	   //  Try to post a job with name "Team Lead" and check the submit message 	
		   public void TC_ID_03_07() throws InterruptedException { 
			   
			//Post a job
			
			     WebElement Post_a_job = driver.findElement(By.xpath("//a[@href='/jobs/postjob']"));
			 
		        Post_a_job.click();
				 
				 Thread.sleep(5000);
			   
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		    	  Job_Title_Field.sendKeys("Team Lead");
			   
			    //Company_List_Dropdown 
			   
	    	    WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	
	    	    Company_List_Dropdown.sendKeys("Test Company04 Ltd");
	    	  
	    	    Company_List_Dropdown.click();
	    	    
		        // Perform the keyboard actions: down arrow key and enter key
	    	    Company_List_Dropdown.sendKeys(Keys.ARROW_UP);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            Company_List_Dropdown.sendKeys(Keys.ENTER);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          
	            Company_List_Dropdown.sendKeys(Keys.TAB);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
		         
			   //Start_Date
			   
	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	
	           Start_Date.sendKeys("06012024");
		       
         Thread.sleep(2000);	
         
         //End_Date
					            
	   	        WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
	   	           
	   	        End_Date.click();
	   	        
	            Thread.sleep(2000);	
			    	  
	   	        End_Date.sendKeys("09302024");
	   	        
	            Thread.sleep(2000);	
		      			      
        // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		         WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

		          Employment_Type.sendKeys("Full-Time");
			          
		          Employment_Type.click();
			    	    
				  // Perform the keyboard actions: down arrow key and enter key
		          Employment_Type.sendKeys(Keys.ARROW_UP);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Employment_Type.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			       Employment_Type.sendKeys(Keys.TAB);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			       		                
			     //Experience_Level
			            
			     WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));
                  
			     Experience_Level.sendKeys("Senior");
			            
			     Experience_Level.click();
			    	    
				 // Perform the keyboard actions: down arrow key and enter key
           Experience_Level.sendKeys(Keys.ARROW_UP);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Experience_Level.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			      Experience_Level.sendKeys(Keys.TAB);
			            
		          Thread.sleep(3000);

			            			            		            
			     //Highest_Education_Level
			            
		        WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[3]/div/div/input"));

			    Highest_Education_Level.sendKeys("Master's Degree");
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			    Highest_Education_Level.click();
			    	    
				// Perform the keyboard actions: down arrow key and enter key
			    Highest_Education_Level.sendKeys(Keys.ARROW_DOWN);
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			     Highest_Education_Level.sendKeys(Keys.ENTER);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			     Highest_Education_Level.sendKeys(Keys.TAB);
			            
	            Thread.sleep(3000);

			         
			  //Required_Degree_field  
			            
		      WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));
			            
			  Required_Degree_field.sendKeys("ME");
			            
			  Thread.sleep(7000);

			  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor j = (JavascriptExecutor) driver;
		       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
         System.out.println("Text is: " + m.getText());  

			  //Skill_Requirement
			          
			  //Add_Skill_Button
			            

			         // Locate the Add Skill button
				        WebElement addSkillButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

				        // Click the Add Skill button
				        addSkillButton.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new skill field to appear or success message to be displayed
				      	        
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement newSkillField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='jp_skills']")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_Skill = driver.findElement(By.xpath("//input[@id='jp_skills']"));

				        Add_Skill.sendKeys("Java");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement addSkillButton_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         addSkillButton_3.click();
				         
					     Thread.sleep(5000); 
				         
				         //Click on Add_Skill_Button
				          
				          WebElement Enter_Add_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

				         Enter_Add_Skill.sendKeys("Java");
				         
				         Thread.sleep(2000);
				         
			            Enter_Add_Skill.click();
				        // Perform the keyboard actions: down arrow key and enter key
			            Enter_Add_Skill.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Enter_Add_Skill.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Enter_Add_Skill.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
				         Thread.sleep(7000);

			          
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            Minimum_Pay_Ranges.sendKeys("105000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			          		          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));
			            
			            Maximum_Pay_Ranges.sendKeys("155000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));
			            
			            Location_Type.sendKeys("Onsite");
			            
			            Location_Type.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
                  Location_Type.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Location_Type.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Location_Type.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          		           			         			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            City.sendKeys("Luknow");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			           
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            State.sendKeys("UTTAR PRADESH");
			            
			            State.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
			            State.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            State.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            State.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));
           
			            // Click the Add Skill button
				        
			            Add_benifit.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new Benifit field to appear or success message to be displayed
				      	        
				        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement NewBenifit = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_benifit_here = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input"));

				        Add_benifit_here.sendKeys("Project lead");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement Click_on_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         Click_on_Button.click();
				         
				         Thread.sleep(5000);
				         
					   //Add Job Description     
				          
					  //Job_Description   
								       
					  WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

		              Job_Description.sendKeys("Master's degree in a relevant field, such as business administration or management. Certifications in leadership, project management or other relevant areas. Excellent communication, interpersonal and problem-solving skills. Strong leadership and organisational skills ");
								        			
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				         

				     //Click on Add_Benifit_Field
				          
				     WebElement Add_Benifit_Fields = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[9]/div/div/div/input"));

				     Add_Benifit_Fields.sendKeys("Project lead");
				         
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         
				     Add_Benifit_Fields.click();
				         
				     // Perform the keyboard actions: down arrow key and enter key
				     
				     Add_Benifit_Fields.sendKeys(Keys.ARROW_UP);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			         Add_Benifit_Fields.sendKeys(Keys.ENTER);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			         Add_Benifit_Fields.sendKeys(Keys.TAB);
			                						            
				 Thread.sleep(5000);
			  			          		  		         		       		            
			     //Submit      
			          
			      WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			      Submit.click();
			            
			      Thread.sleep(10000);
			            
			      driver.navigate().refresh();
			          
			      Thread.sleep(10000);			 
		}

		@Test
	   //  Try to post a job with name "Managing Director" and check the submit message 	
		   public void TC_ID_03_08() throws InterruptedException { 
			  
			//post a job
			
			 WebElement Post_a_job = driver.findElement(By.xpath("//a[@href='/jobs/postjob']"));
			 
		        Post_a_job.click();
				 
				 Thread.sleep(5000);
			   
			   // Locate the Job_Title_Field    
		    	  
		    	  WebElement Job_Title_Field = driver.findElement(By.xpath("//input[@name='jp_title']"));
		    	  
		    	  Job_Title_Field.sendKeys("Managing Director");
			   
			    //Company_List_Dropdown 
			   
	    	    WebElement Company_List_Dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div[2]/div/div/input"));
		    	
	    	    Company_List_Dropdown.sendKeys("Test Company05 Ltd");
	    	  
	    	    Company_List_Dropdown.click();
	    	    
		        // Perform the keyboard actions: down arrow key and enter key
	    	    Company_List_Dropdown.sendKeys(Keys.ARROW_UP);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            Company_List_Dropdown.sendKeys(Keys.ENTER);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          
	            Company_List_Dropdown.sendKeys(Keys.TAB);
	            
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
		         
			   //Start_Date
			   
	           WebElement Start_Date = driver.findElement(By.xpath("//input[@name='jp_start_date']"));
		    	
	           Start_Date.sendKeys("06012024");
		       
      Thread.sleep(2000);	
      
      //End_Date
					            
	   	        WebElement End_Date = driver.findElement(By.xpath("//input[@name='jp_end_date']"));
	   	           
	   	        End_Date.click();
	   	        
	            Thread.sleep(2000);	
			    	  
	   	        End_Date.sendKeys("09302024");
	   	        
	            Thread.sleep(2000);	
		      			      
     // Basic Requirements               
			          
			     //Employment_Type 
			          			          
		         WebElement Employment_Type = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[1]/div/div/input"));

		          Employment_Type.sendKeys("Full-Time");
			          
		          Employment_Type.click();
			    	    
				  // Perform the keyboard actions: down arrow key and enter key
		          Employment_Type.sendKeys(Keys.ARROW_UP);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Employment_Type.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			       Employment_Type.sendKeys(Keys.TAB);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			       		                
			     //Experience_Level
			            
			     WebElement Experience_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[2]/div/div/input"));
               
			     Experience_Level.sendKeys("Senior");
			            
			     Experience_Level.click();
			    	    
				 // Perform the keyboard actions: down arrow key and enter key
        Experience_Level.sendKeys(Keys.ARROW_UP);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			      Experience_Level.sendKeys(Keys.ENTER);
			            
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			      Experience_Level.sendKeys(Keys.TAB);
			            
		          Thread.sleep(3000);

			            			            		            
			     //Highest_Education_Level
			            
		        WebElement Highest_Education_Level = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[3]/div[3]/div/div/input"));

			    Highest_Education_Level.sendKeys("PhD");
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			    Highest_Education_Level.click();
			    	    
				// Perform the keyboard actions: down arrow key and enter key
			    Highest_Education_Level.sendKeys(Keys.ARROW_DOWN);
			            
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			     Highest_Education_Level.sendKeys(Keys.ENTER);
			            
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			     Highest_Education_Level.sendKeys(Keys.TAB);
			            
	            Thread.sleep(3000);

			         
			  //Required_Degree_field  
			            
		      WebElement Required_Degree_field = driver.findElement(By.xpath("//input[@name='jp_required_degree']"));
			            
			  Required_Degree_field.sendKeys("Project Management");
			            
			  Thread.sleep(7000);

			  //identify element
			   WebElement m = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));
			   //scroll to middle with Javascript Executor
			   JavascriptExecutor j = (JavascriptExecutor) driver;
		       j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", m);
               System.out.println("Text is: " + m.getText());  

			  //Skill_Requirement
			          
			  //Add_Skill_Button
			            

			         // Locate the Add Skill button
				        WebElement addSkillButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[4]/button"));

				        // Click the Add Skill button
				        addSkillButton.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new skill field to appear or success message to be displayed
				      	        
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement newSkillField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='jp_skills']")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_Skill = driver.findElement(By.xpath("//input[@id='jp_skills']"));

				        Add_Skill.sendKeys("Project Enhancement");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement addSkillButton_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         addSkillButton_3.click();
				         
					     Thread.sleep(5000); 
				         
				         //Click on Add_Skill_Button
				          
				          WebElement Enter_Add_Skill = driver.findElement(By.xpath("//input[@placeholder='Required Skills']"));

				         Enter_Add_Skill.sendKeys("Project Management");
				         
				         Thread.sleep(2000);
				         
			            Enter_Add_Skill.click();
				        // Perform the keyboard actions: down arrow key and enter key
			            Enter_Add_Skill.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Enter_Add_Skill.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Enter_Add_Skill.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
				         Thread.sleep(7000);

			          
			     //Pay Range
			       		   
			     //Minimum_Pay_Ranges
			            
			            WebElement Minimum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_minimum_salary']"));

			            Minimum_Pay_Ranges.sendKeys("185000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			          		          
			     //Maximum_Pay_Ranges 
			            
			            WebElement Maximum_Pay_Ranges = driver.findElement(By.xpath("//input[@name='jp_maximum_salary']"));
			            
			            Maximum_Pay_Ranges.sendKeys("255000");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          
			     //Location
			         
			     //Location_Type
			            
			            WebElement Location_Type = driver.findElement(By.xpath("//input[@placeholder='Location Type']"));
			            
			            Location_Type.sendKeys("Onsite");
			            
			            Location_Type.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
               Location_Type.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            Location_Type.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            Location_Type.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          		           			         			          
			     //City
			            WebElement City = driver.findElement(By.xpath("//input[@name='jp_city']"));

			            City.sendKeys("Mumbai");
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			           
			     //State
			            
			            WebElement State = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[7]/div[3]/div/div/input"));

			            State.sendKeys("MAHARASHTRA");
			            
			            State.click();
			    	    
				        // Perform the keyboard actions: down arrow key and enter key
			            State.sendKeys(Keys.ARROW_UP);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			            State.sendKeys(Keys.ENTER);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			            State.sendKeys(Keys.TAB);
			            
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			            
			            Thread.sleep(2000);
			          
			     //Benefits
			          			          
			     //Add_benifit
			            
			            WebElement Add_benifit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[8]/button"));
        
			            // Click the Add Skill button
				        
			            Add_benifit.click();

			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				        
				        // Wait for the new Benifit field to appear or success message to be displayed
				      	        
				        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				        
				        WebElement NewBenifit = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input")));
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				             	
				        //Add_Skill
				        
				        WebElement Add_benifit_here = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[1]/div/input"));

				        Add_benifit_here.sendKeys("Project Enhancement");
				        
			            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         	            
				        // add skill button
				            
				         WebElement Click_on_Button = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/div/div[2]/button[2]"));

				         Click_on_Button.click();
				         
				         Thread.sleep(5000);
				         
					   //Add Job Description     
				          
					  //Job_Description   
								       
					  WebElement Job_Description = driver.findElement(By.xpath("//textarea[@name='jp_description']"));

		              Job_Description.sendKeys("We are looking for an experienced managing director to oversee business operations and provide strategic leadership. The managing director's responsibilities include developing and implementing strategic plans and company policies, maintaining an open dialogue with stakeholders, and driving organizational success");
								        			
		              Thread.sleep(3000);
				         
				     //Click on Add_Benifit_Field
				          
				     WebElement Add_Benifit_Fields = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/div/div[9]/div/div/div/input"));

				     Add_Benifit_Fields.sendKeys("Project Enhancement");
				         
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				         
				     Add_Benifit_Fields.click();
				     
				     Thread.sleep(2000);
				         
				     // Perform the keyboard actions: down arrow key and enter key
				     
				     Add_Benifit_Fields.sendKeys(Keys.ARROW_UP);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			         Add_Benifit_Fields.sendKeys(Keys.ENTER);
			            
			         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          
			         Add_Benifit_Fields.sendKeys(Keys.TAB);
			                						            
				 Thread.sleep(5000);
			  			          		  		         		       		            
			     //Submit      
			          
			      WebElement Submit = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/form/button"));

			      Submit.click();
			            
			      Thread.sleep(10000);
			            
			      driver.navigate().refresh();
			          
			      Thread.sleep(10000);
			      
		}
		
}
