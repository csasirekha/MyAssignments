package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("https://www.amazon.in/");
		//Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type Bags for boys in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		//Click bags for boys
		driver.findElement(By.xpath("//div[text()=\"bags for boys\"]")).click();
		//Print 1-40 of 40000 results
		String text = driver.findElement(By.xpath("//h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]")).getText();
		System.out.println(text);
		//Click First two brands of bags
		
		driver.findElement(By.xpath("(//div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"]//i)[3]")).click();
		driver.findElement(By.xpath("(//div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"]//i)[4]")).click();
		//Click Sort
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		//Print first Bag info
		String text2 = driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base\"]")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[4]")).getText();
		System.out.println(text3);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
	}

}
