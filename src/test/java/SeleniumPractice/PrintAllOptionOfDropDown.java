package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionOfDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement e = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select select = new Select(e);
		// print all dropdownlist
		List<WebElement> op = select.getOptions();
		for (WebElement text : op) {
//			System.out.println(text.getText());
			System.out.println(text.getAttribute("value"));
		}

	}

}
