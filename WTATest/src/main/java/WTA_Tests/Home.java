package WTA_Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home extends BaseTest {
	
	@Test
	public void NavtoOurWork() 
	{
				driver.findElement(By.cssSelector("#portaltab-our-work > a")).click();
				assertTrue(driver.getCurrentUrl().contains("our-work"));
				driver.get("http://wta.org");
				
			
	}

	@Test
	public void NavtoGoOutside() 
	{

		driver.findElement(By.cssSelector("#portaltab-go-outside > a")).click();
		assertTrue(driver.getCurrentUrl().contains("go-outside"));
		driver.get("http://wta.org");		  
				  


	}
	@Test
	public void NavtoGetInvolved() 
	{
		
			driver.findElement(By.cssSelector("#portaltab-get-involved > a")).click();
			assertTrue(driver.getCurrentUrl().contains("get-involved"));
			driver.get("http://wta.org");		  
					  
		

	}

	@Test
	public void NavtoJoin() 
	{
		 
			driver.findElement(By.cssSelector("#portaltab-join > a")).click();
			assertTrue(driver.getCurrentUrl().contains("join"));
			driver.get("http://wta.org");		  
				  
		
			
	}

	@Test
	public void NavtoDonate() 
	{
			driver.findElement(By.cssSelector("#intro-strip > div > nav > ul > li.donate > a")).click();
			assertTrue(driver.getCurrentUrl().contains("join"));
			driver.get("http://wta.org");		  
		
		
	}

	@Test
	public void NavtoNews() 
	{
		 
				driver.findElement(By.cssSelector("#intro-strip > div > nav > ul > li.news > a")).click();
				assertTrue(driver.getCurrentUrl().contains("news"));
				driver.get("http://wta.org");		  
						  
			
			
	}

	@Test // functional test
	public void TestSearch() 
	{
		 
			
				driver.findElement(By.xpath("//*[@id=\"intro-strip\"]/div/nav/ul/li[2]")).click();
				driver.findElement(By.id("search-field")).sendKeys("hiking");
				driver.findElement(By.cssSelector("#intro-strip > div > nav > ul > li.search > form > button")).click();;
				driver.findElement(By.id("resInfo-0"));
						  
			
			
	}

	
}
