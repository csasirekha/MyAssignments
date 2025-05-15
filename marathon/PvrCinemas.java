package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("https://www.pvrcinemas.com/");
		//Click cinema
		driver.findElement(By.xpath("//span[text()=\"Cinema\"]")).click();
		//Select Cinema
		driver.findElement(By.xpath("//span[text()=\"Select Cinema\"]")).click();
		Thread.sleep(3000);
		//Select Theatre
		driver.findElement(By.xpath("//span[contains(text(),'Marina')]")).click();
		Thread.sleep(2000);
		//Select Date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(2000);
		//Select Movie
		driver.findElement(By.xpath("(//span[text()=\"ELEVEN\"])[2]")).click();
		Thread.sleep(2000);
		//Select Timing
		driver.findElement(By.xpath("//span[contains(text(),'10:25')]")).click();
		//Book Movie
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		//Accept terms and conditions
		driver.findElement(By.xpath("//button[text()=\"Accept\"]")).click();
		//Select Seat
		driver.findElement(By.xpath("//span[@id=\"CL.CLUB|C:1\"]")).click();
		//Click Proceed
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		//Print Seat Info
		String text = driver.findElement(By.xpath("//div[@class=\"seat-number\"]")).getText();
		System.out.println(text);
		//Print Grand Total
		//System.out.println(driver.findElement(By.xpath("//div[@class=\"grand-tota col-md-3\"]//span")));
		//System.out.println(element);
		String Title=driver.getTitle();
		
		System.out.println(Title);
		driver.close();


	}

}
