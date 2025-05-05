package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/*
		 * Interacting with web elements
		 */
				//Instantiate the Browser driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//Load URL
				driver.get("https://www.facebook.com/");
				//Print Title of web page
				String Title=driver.getTitle();
				System.out.println(Title);
				//Enter Email id
				driver.findElement(By.id("email")).sendKeys("csrekha1988@gmail.com");
				//Enter Password
				driver.findElement(By.id("pass")).sendKeys("welcome");
				//Click login
				driver.findElement(By.name("login")).click();
				
	}

}
