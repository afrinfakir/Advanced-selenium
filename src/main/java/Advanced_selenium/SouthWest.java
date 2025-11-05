package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SouthWest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Set up WebDriver for Chrome (make sure to set the path to your chromedriver)
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();

//		try {
//			// 1. Navigate to Southwest website
//			driver.get("https://www.southwest.com/");
//			driver.manage().window().maximize();
//
//			// Explicit wait
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//
//			// 2. Select 'One-Way' or 'Round-Trip'
//			WebElement roundTripOption = wait
//					.until(ExpectedConditions.elementToBeClickable(By.id("trip-type-round-trip")));
//			roundTripOption.click();
//
//			// 3. Enter Departure City
//			WebElement departureCity = driver.findElement(By.id("originationAirportCode"));
//			departureCity.clear();
//			departureCity.sendKeys("LAX"); // Enter the desired departure code
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@aria-labelledby='Checkbox_178']//ancestor::li")).click();
//
//			// 4. Enter Arrival City
//			WebElement arrivalCity = driver.findElement(By.id("destinationAirportCode"));
//			arrivalCity.clear();
//			arrivalCity.sendKeys("JFK"); // Enter the desired arrival code
//
//			// 5. Select Departure Date
//			WebElement departureDate = driver.findElement(By.id("departureDate"));
//			departureDate.click();
//			WebElement selectDepartureDate = driver
//					.findElement(By.xpath("//button[@aria-label='Choose Nov 15, 2024']")); // adjust the date as needed
//			selectDepartureDate.click();
//
//			// 6. Select Return Date (only if round trip)
//			WebElement returnDate = driver.findElement(By.id("returnDate"));
//			returnDate.click();
//			WebElement selectReturnDate = driver.findElement(By.xpath("//button[@aria-label='Choose Nov 22, 2024']")); // adjust
//																														// the
//																														// date
//																														// as
//																														// needed
//			selectReturnDate.click();
//
//			// 7. Click on "Search" button
//			WebElement searchButton = driver.findElement(By.id("form-mixin--submit-button"));
//			searchButton.click();
//
//			// 8. Wait for search results to load and select a flight
//			WebElement selectFlight = wait
//					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Select')]")));
//			selectFlight.click();
//
//			// 9. Proceed to the next steps (login/payment, if required)
//			// Note: At this stage, Southwest may require login or passenger details before
//			// proceeding to payment.
//			WebElement continueButton = wait
//					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Continue')]")));
//			continueButton.click();
//
//			// Additional steps would depend on further pages requiring login/payment
//			// details
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// Close the browser after completing the automation
//			driver.quit();
//		}
//	}
		
		WebElement roundtrip = driver.findElement(By.xpath("//span[text()='Round trip']"));
		roundtrip.click();
		Thread.sleep(5000);
		WebElement depart = driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode"));
		depart.sendKeys("LGA");
		WebElement checkbox = driver.findElement(By.xpath("//span[text()= 'New York (LaGuardia), NY - ']"));
		checkbox.click();
		Thread.sleep(3000);
		WebElement arrive = driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode"));
		arrive.sendKeys("BUR");
		WebElement arriveCheck = driver.findElement(By.xpath("//span[text()= 'bank, CA - BUR']"));
		arriveCheck.click();
		
		WebElement departDate = driver.findElement(By.id("LandingAirBookingSearchForm_departureDate"));
		departDate.click();
		
		WebElement datedepart = driver.findElement(By.id("calendar-71-2024-11-29"));
		datedepart.click();
		Thread.sleep(2000);
		WebElement returnDate = driver.findElement(By.id("LandingAirBookingSearchForm_returnDate"));
		returnDate.click();
		
		WebElement dateReturn = driver.findElement(By.id("calendar-74-2024-12-25"));
		dateReturn.click();
		Thread.sleep(2000);
		WebElement Passenger = driver.findElement(By.id("passenger-selector--input"));
		Passenger.click();
		
		WebElement MoreAdults = driver.findElement(By.xpath("//button[@data-test='more-adults']"));
		MoreAdults.click();
		
		//((WebElement) driver).sendKeys(Keys.TAB);
		//((WebElement) driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		
//		WebElement promoCode = driver.findElement(By.id("LandingAirBookingSearchForm_promoCode"));
//		promoCode.sendKeys("ROOFY@123");
		
		Thread.sleep(3000);
		WebElement Search = driver.findElement(By.id("LandingAirBookingSearchForm_submit-button"));
		Search.click();
	}
}

		
		
