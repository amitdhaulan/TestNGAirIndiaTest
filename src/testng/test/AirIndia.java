package testng.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.test.pom.POMClassViewSchedule;

public class AirIndia {
	static WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void goTo() {
		POMClassViewSchedule.Home(driver);
	}

	@AfterTest
	public void closeApplication() {
		driver.close();
	}

//	@Test(priority = 0)
//	public void logon() throws IOException {
//		POMClassViewSchedule.clickLinkByHref("logon", driver);
//		POMClassLogon.memberShipNumber(driver)
//				.sendKeys("amitkumarsinghkashyap");
//		POMClassLogon.password(driver).sendKeys("12345");
//		POMClassLogon.buttonClick(driver).click();
//		File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Home, new File("D:\\AirIndia\\logon.jpg"));
//		String str = POMClassLogon.findLinkText("forgotten", driver);
//		if (!(str.contains("novalue"))) {
//			System.out.println("Logon Test Result Pass");
//		} else {
//			System.out.println("Logon Test Result Fail");
//		}
//	}

//	@Test(priority = 1)
//	public void register() throws IOException {
//		POMClassViewSchedule.Home(driver);
	// File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(Home, new File("D:\\AirIndia\\register.jpg"));
//	}

//	@Test(priority = 2)
//	public void bookFlights() throws IOException {
//		POMClassViewSchedule.Home(driver);
//		File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Home, new File("D:\\AirIndia\\bookFlights.jpg"));
//	}

	@Test(priority = 0)
	public void viewSchedules() throws IOException {/*
		POMClassViewSchedule.Home(driver);
		POMClassViewSchedule.clickLinkByHref("schedules", driver);
		POMClassViewSchedule.radioButton(driver, 1).click();
		POMClassViewSchedule.dropDownOne(driver, "Delhi (DEL)");
		POMClassViewSchedule.dropDownTwo(driver, "London (LHR)");
		POMClassViewSchedule.dropDownThree(driver, "25");
		POMClassViewSchedule.dropDownFour(driver, "April 2015");
		POMClassViewSchedule.checkBox(driver, 0);
		POMClassViewSchedule.buttonClick(driver).click();
		File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Home, new File("D:\\AirIndia\\viewSchedules.jpg"));
	*/
		
	
	
	
		driver.get("https://book.airindia.in/itd/itd/lang/en/travel/schedules");
		List<WebElement> RadButtonList = driver.findElements(By.name("searchType"));
		RadButtonList.get(0).click();
		
		Select dropdown = new Select(driver.findElement(By.id("searchDepartLocation")));
		dropdown.selectByVisibleText("Delhi (DEL)");
		
		Select dropdown2 = new Select(driver.findElement(By.id("searchArriveLocation")));
		dropdown2.selectByVisibleText("London (LHR)");
		
		driver.findElement(By.id("calLink0")).click();  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		//Click on next so that we will be in next month  
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();  
		    
		/*DatePicker is a table.So navigate to each cell   
		* If a particular cell matches value 13 then select it  
		*/  
		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));  
		List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));  
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
	
	
	
	}

//	@Test(priority = 4)
//	public void viewStatus() throws IOException {
//		POMClassViewSchedule.Home(driver);
//		File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Home, new File("D:\\AirIndia\\viewStatus.jpg"));
//	}

//	@Test(priority = 5)
//	public void bookFindings() throws IOException {
//		POMClassViewSchedule.Home(driver);
//		File Home = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Home, new File("D:\\AirIndia\\bookFindings.jpg"));
//	}

}
