package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectByMetohd {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement list=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select select=new Select(list);
		boolean b=select.isMultiple();
		System.out.println(b);
		select.selectByVisibleText("Art Design");
		List<WebElement> web=select.getAllSelectedOptions();
		for(WebElement sb:web) {
			String selectoption=sb.getText();
			System.out.println(selectoption);
		}
		
		
		

	}

}
