package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WithoutDrapAndDropMethodDragAndDropPerform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//img[@id=\"node\"]"));
		WebElement to=driver.findElement(By.xpath("//div[@id=\"droparea\"]"));
		a.clickAndHold(source).moveToElement(to).release(to).perform();

	}

}
