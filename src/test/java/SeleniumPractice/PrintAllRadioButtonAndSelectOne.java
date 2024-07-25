package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintAllRadioButtonAndSelectOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
//		for(int i=1;i<=3;i++) {
//			Thread.sleep(3000);
//			String text=driver.findElement(By.xpath("(//label[@class=\"checks\"])["+i+"]")).getText();
//			System.out.println(text);
//			
//		}
		//OR
		for(int j=1;j<=3;j++) {
			Thread.sleep(2000);
		String newText=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+j+"]")).getAttribute("value");
		System.out.println(newText);
		if(newText.equals("Movies")) {
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+j+"]")).click();
			
		}
		}

	}

}
