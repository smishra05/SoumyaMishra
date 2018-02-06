package WTA_Lib;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Driver implements WebDriver {

	WebDriver driver;
	String browserName;
	
	
// TODO Auto-generated method stub
		
public Driver(String browserName) {
	this.browserName = browserName;
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Webdrivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}
	
	if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Webdrivers/geckodriver.exe");
		this.driver = new FirefoxDriver();
		
	}
	//TODO add the rest of the browsers
}

public void get(String url) {
	this.driver.get(url);
}

public String getCurrentUrl() {
	return this.driver.getCurrentUrl();
}

public String getTitle() {
	return this.driver.getTitle();
}

public List<WebElement> findElements(By by) {
	return this.driver.findElements(by);
}

public WebElement findElement(By by) {
	return this.driver.findElement(by);
}

public String getPageSource() {
	return this.driver.getPageSource();
}

public void close() {
	this.driver.close();		
}

public void quit() {
	 this.driver.quit();
}

public Set<String> getWindowHandles() {
	return this.driver.getWindowHandles();
}

public String getWindowHandle() {
	return this.driver.getWindowHandle();
}

public TargetLocator switchTo() {
	return this.driver.switchTo();
}

public Navigation navigate() {
	return this.driver.navigate();
}

public Options manage() {
	return this.driver.manage();
}

}
