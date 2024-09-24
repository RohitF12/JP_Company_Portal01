package Login_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Launch_1.Launch_Company_Portal;

public class Login_comp extends Launch_Company_Portal{
	
	@Test
	 public void Login2App1() throws InterruptedException { 

	// Find the UserID input field and enter the correct UserID
   WebElement userIdField1 = driver.findElement(By.xpath("//input[@name='email']"));
   
   userIdField1.sendKeys("rfulzele@reyan.co.in");
   

   // Find the Password input field and enter the correct password
   WebElement passwordField1 = driver.findElement(By.xpath("//input[@name='password']"));
 
   passwordField1.sendKeys("Arohi@12");

   // Find the login button and click it
   WebElement loginButton1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/button"));
   
   loginButton1.click();

}
}