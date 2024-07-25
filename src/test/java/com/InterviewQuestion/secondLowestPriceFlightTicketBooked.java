package com.InterviewQuestion;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class secondLowestPriceFlightTicketBooked {
	 RemoteWebDriver driver=null;
	@Test(priority=1)
	public void openbrowser() {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\\\\\Users\\\\\\\\Infiwave\\\\\\\\eclipse-workspace\\\\\\\\Socialsnowball\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/flights/");

	}
    @Test(priority=2)
	 public void SelectDepartureFlight() throws Exception {
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchCity inactiveWidget \"]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=\"autoSuggestPlugin hsw_autocomplePopup\"]/div/input"))
					.sendKeys("Pune");
			Thread.sleep(3000);
			List<WebElement> dyanamicWebElementFrom = driver
					.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
			for (int i = 0; i < dyanamicWebElementFrom.size(); i++) {
				String text = dyanamicWebElementFrom.get(i).getText();
				System.out.println(text);
				if (text.contains("Aurangabad")) {
					dyanamicWebElementFrom.get(i).click();
					break;
				}
			}
		 

	}
    
		
	@Test(priority=3)	
      public void SelectToFlight() throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchToCity inactiveWidget \"]/label")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(
			"//div[@class=\"autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween\"]/div/input"))
			.sendKeys("Raipur");
	Thread.sleep(5000);
	List<WebElement> dyanmicWebElementTo = driver
			.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
	
	for (int i = 0; i < dyanmicWebElementTo.size(); i++) {
		String textto = dyanmicWebElementTo.get(i).getText();
		System.out.println("Text of" + textto);
		if (textto.contains("Raipur")) {
			dyanmicWebElementTo.get(i).click();
		}
	}
	}
	
	@Test(priority=3,dependsOnMethods ="SelectToFlight",alwaysRun=true )
		public void Selectthedata() throws InterruptedException {
			String month="August 2024";
	           String date="12";
	           Thread.sleep(3000);
	           driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
	         //span[@aria-label="Next Month"]
	         //div[@class="DayPicker-Caption"]
	         //div[@class="dateInnerCell"]
	           Thread.sleep(3000);
	           while(true) {
	        	   String txt=driver.findElement(By.xpath("//div[@class=\"DayPicker-Month\"]")).getText();
	        	   System.out.println(txt);
	        	   if(txt.equals(month)) {
	        		   break;
	        	   
	           }
	        	   Thread.sleep(3000);
			String alldate=driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]")).getText();
			if(alldate.contains(date)){
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class=\"dateInnerCell\"]")).click();
			}
			

		}
	}
}
           
	


