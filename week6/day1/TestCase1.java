package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{
	@Test(dataProvider="Data")
	public void salesForce(String entity)  {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act=new Actions(driver);
		act.click(element).perform();
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[7]")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(entity);
		driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/button")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
				
	}
	@DataProvider(name="Data")
	public String[][] data() {
		String[][] name=new String[2][1];
		name[0][0]="Salesforce Automation by Sasi";
		name[1][0]="Salesforce Automation by Rekha";
		return name;
	}

}
