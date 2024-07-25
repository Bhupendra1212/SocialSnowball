import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement switchlist=driver.findElement(By.xpath("//select"));
		Select select=new Select(switchlist);
		
	    select.selectByIndex(1);
		select.selectByIndex(5);
		select.selectByIndex(2);
		
		
	}

}
