package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecificMethod {
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
