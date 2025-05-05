package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		/*
		 * Interacting with web elements
		 */
				ChromeOptions options=new ChromeOptions();
				options.addArguments("guest");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				//Load URL
				driver.get("http://leaftaps.com/opentaps/");
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");//Enter username
				driver.findElement(By.id("password")).sendKeys("crmsfa");//Enter password
				driver.findElement(By.className("decorativeSubmit")).click();//Click login
				driver.findElement(By.partialLinkText("CRM")).click();//Click CRM/SFA
				driver.findElement(By.linkText("Leads")).click();//Click Leads
				driver.findElement(By.linkText("Create Lead")).click();//Click Create Lead
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXX");//Enter company name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");//Enter First name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");// Enter Last name
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Quality Analyst");//Enter Title
				driver.findElement(By.className("smallSubmit")).click();
				String Title=driver.getTitle();
				System.out.println(Title);
				//driver.close();

	}

}
