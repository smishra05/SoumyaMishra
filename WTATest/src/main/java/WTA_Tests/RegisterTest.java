package WTA_Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	
	@Test
	public void SignUp() 
	{

	driver.get("https://www.wta.org/login");
	
	driver.findElement(By.id("__ac_name")).sendKeys("##########"); //removed email
	driver.findElement(By.id("__ac_password")).sendKeys("#######"); //removed password
	
	driver.findElement(By.cssSelector("#login-form > div.formControls > input")).click();
	driver.findElement(By.cssSelector("#content > h1"));
	
	}

}
