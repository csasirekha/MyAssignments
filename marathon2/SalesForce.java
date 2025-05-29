package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Mouse hover on products 
		Shadow shadow=new Shadow(driver);
		Thread.sleep(2000);
		shadow.findElementByXPath("//span[text()='Products']").click();
		WebElement element = shadow.findElementByXPath("//a[text()='See all product pricing']");
		Actions act = new Actions(driver);
		act.scrollToElement(element);
		shadow.findElementByXPath("//a[text()='See all product pricing']").click();
		driver.findElement(By.linkText("Agentforce")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
