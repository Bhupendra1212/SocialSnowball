package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintAllDataInTheTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"datepicker1\"]")).click();
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		for(WebElement listOfRow:row) {
			List<WebElement> lirow=driver.findElements(By.tagName("td"));
			for(WebElement data:lirow)
				System.out.println(data.getText());
			
		}
			
			
		}
		

	}


