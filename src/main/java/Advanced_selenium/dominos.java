package Advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dominos {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriveManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/postorder-ui/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement skip = driver.findElement(By.xpath("//span[text()='Skip']"));
		skip.click();
		Thread.sleep(15000);
		WebElement volcano = driver.findElement(By.xpath("//span[text()='Cheese Volcano']"));
		volcano.click();
		Thread.sleep(5000);
		WebElement peppy = driver.findElement(By.xpath("//div[@id='Showing Cheese Volcano | 1/8']//span[text()='Cheese Volcano Peppy Paneer']"));
		peppy.click();
		Thread.sleep(5000);
		WebElement add = driver.findElement(By.xpath("//span[text()='Add '] "));
		add.click();
		Thread.sleep(5000);
		WebElement cart = driver.findElement(By.xpath("//span[text()='View Cart']"));
		cart.click();
		Thread.sleep(5000);
		WebElement place_order = driver.findElement(By.xpath("//span[text()='Place Order']"));
		place_order.click();
		
		
	}

}
