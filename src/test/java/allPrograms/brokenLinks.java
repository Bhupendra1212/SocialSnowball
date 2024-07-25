package allPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brokenLinks {

	public static void main(String[] args) throws IOException,MalformedURLException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=1;i<links.size();i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			System.out.println(url);
			URL link=new URL(url);
			
			HttpURLConnection connection= (HttpURLConnection)link.openConnection();
			connection.connect();
			int response=connection.getResponseCode();
			if(response>=400) {
				System.out.println("BrokenLinke:-"+url);
			}else {
				System.out.println("Valid link:-"+url);
			}
			
		}
		

	}

}
