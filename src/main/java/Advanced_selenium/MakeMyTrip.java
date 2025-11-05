package Advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(null));
		WebElement closePopup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement popup=wait.until(ExpectedConditions.elementToBeClickable(closePopup));
		//popup.click();
		closePopup.click();
		Thread.sleep(3000);
		WebElement multiTrip = driver.findElement(By.xpath("//li[text()='Multi City']"));
		multiTrip.click();
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.id("fromAnotherCity0"));
		from.click();
		//driver.quit();
		Thread.sleep(3000);
		WebElement fromCity = driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
		fromCity.click();
		Thread.sleep(3000);
		WebElement To = driver.findElement(By.xpath("//input[@type='text' and @aria-autocomplete='list']"));
		To.click();
		Thread.sleep(3000);
		WebElement ToCity = driver.findElement(By.xpath("//p[text()='Pune, India']"));
		ToCity.click();
		Thread.sleep(3000);
		WebElement Departure = driver.findElement(By.xpath("//div[@aria-label='Tue Nov 26 2024']"));
		Departure.click();
		Thread.sleep(2000);
		WebElement Traveller = driver.findElement(By.xpath("//span[text()='Travellers & Class']"));
		Traveller.click();
		Thread.sleep(2000);
		WebElement Adult = driver.findElement(By.xpath("//li[@data-cy='adults-5']"));
		Adult.click();
		WebElement children = driver.findElement(By.xpath("//li[@data-cy='children-2']"));
		children.click();
		WebElement infant = driver.findElement(By.xpath("//li[@data-cy='infants-1']"));
		infant.click();
		WebElement applyBtn = driver.findElement(By.xpath("//button[text()='APPLY']"));
		applyBtn.click();
		Thread.sleep(3000);
		WebElement Toocity = driver.findElement(By.id("toAnotherCity1"));
		Toocity.click();
		Thread.sleep(5000);
		WebElement To2City = driver.findElement(By.xpath("//p[text()='Hyderabad, India']//parent::div"));
		To2City.click();
		Thread.sleep(5000);
		WebElement anotherDept = driver.findElement(By.xpath("//input[@id='anotherDeparture 1']//parent::label"));
		anotherDept.click();
		

	}

}
