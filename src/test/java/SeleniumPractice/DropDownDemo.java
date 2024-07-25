package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//a[@href=\"Widgets.html\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(s).perform();
		Thread.sleep(2000);
		WebElement p=driver.findElement(By.xpath("(//a[@href=\"SwitchTo.html\"])[1]"));
		action.moveToElement(p).perform();
		

	}

}
