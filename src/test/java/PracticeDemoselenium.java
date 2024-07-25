
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeDemoselenium {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.manager.driver",
					"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(option);
			driver.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(3000);
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			//Set a size of window
			Dimension d = new Dimension(1000,1000);
			driver.manage().window().setSize(d);
			
			//Set position
			 Point p=new Point(500,250);
			 driver.manage().window().setPosition(p);
			
			

	}

}
