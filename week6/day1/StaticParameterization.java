package week6.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameterization {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preconditions(String url, String uName, String pwd) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		
	}
	@AfterMethod
	public void postconditions() {
		driver.close();
	}
		
	@Test
	public void salesForce() {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act=new Actions(driver);
		act.click(element).perform();
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[7]")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/button")).click();
		act.click(driver.findElement(By.xpath("//span[text()='Active']"))).perform();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		act.click(driver.findElement(By.xpath("//button[@title='Close error dialog']"))).perform();
				
	}

}
