package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UseFindElementsMethodAndCountAllLinkOfGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (int i = 1; i <= list.size() - 1; i++) {
			String alllink = list.get(i).getAttribute("href");
			
				System.out.println(alllink);
			 
		}
	}

}
