package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Brand Mouse hover
		WebElement brandMousehover = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(brandMousehover).perform();
		//watches mouse hover
		WebElement watchesMousehover = driver.findElement(By.xpath("//div[text()=\"Watches & Accessories\"]"));
		act.moveToElement(watchesMousehover).perform();
		//Click first brand in Featured
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//sort to new arrivals
		driver.findElement(By.xpath("//option[text()=\"New Arrivals\"]")).click();
		//select Men
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		//Print price of all watches
		Thread.sleep(2000);
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		System.out.println(priceList.size());
		
		for (WebElement iter : priceList) {
			System.out.println(iter.getText());
		}
		
		// click first watch
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(childwindow);
		driver.switchTo().window(listWindow.get(1));
		
		//add to bag and print count of bag
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		System.out.println("Bag Count is: "+ driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText());
		//click bag
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		//Compare bag price and total price
		String bagprice = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
		String totalPrice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']")).getText();
		
        String Input1 = bagprice.replace("₹", "");
        String Input2 = totalPrice.replace("₹ ", "");
        int dot = Input1.indexOf('.');
        if (dot != -1) {
            Input1 = Input1.substring(0, dot);
        }
        int dot2 = Input2.indexOf('.');
        if (dot2 != -1) {
            Input2 = Input2.substring(0, dot2);
        }
        // Step 3: Convert to integer
        int price1 = Integer.parseInt(Input1);
        int price2 = Integer.parseInt(Input2);

        if (price1 == price2) {
			System.out.println("Both prices are similar");
		}
        else {
        	System.out.println("Both prices are not similar");
        }
        //close all windows
       driver.close();
       driver.switchTo().window(parentwindow);
       driver.close();
	}

}
