package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXX");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		WebElement marketingDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1=new Select(marketingDD);
		select1.selectByVisibleText("Automobile");
		WebElement ownershipDD=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2=new Select(ownershipDD);
		select2.selectByValue("OWN_CCORP");
	}

}
