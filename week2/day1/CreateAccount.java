package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
				driver.findElement(By.linkText("Accounts")).click();//Click Accounts
				driver.findElement(By.linkText("Create Account")).click();//Click Create account
				driver.findElement(By.id("accountName")).sendKeys("SasirekhaC1");//Enter Account name
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//Enter Description
				driver.findElement(By.id("numberEmployees")).sendKeys("4");//Enter No. of Employees
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//Enter Site name
				driver.findElement(By.className("smallSubmit")).click();//Click create account
				String Title=driver.getTitle();
				System.out.println(Title);
				driver.close();

	}

}
