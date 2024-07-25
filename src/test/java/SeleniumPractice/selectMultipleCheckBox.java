package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selectMultipleCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> checkboxlist=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		//Select all checkbox
//		for(WebElement x:checkboxlist) {
//			x.click();
	//	}
		//select two checkbox
		for(WebElement m:checkboxlist) {
			if(m.getAttribute("value").equals("Hockey")||m.getAttribute("value").equals("Movies")){
				m.click();
			}
			//print Selected Value
			if(m.isSelected()) {
				System.out.println(m.getAttribute("value"));
			}
		}
		
	}

}
