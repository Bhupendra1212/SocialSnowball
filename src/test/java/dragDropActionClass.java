import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragDropActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
//		WebElement interation = driver.findElement(By.xpath("//a[@href=\"Interactions.html\"]"));
		Actions action = new Actions(driver);
//		action.moveToElement(interation).perform();
//		WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()=\"Drag and Drop \"]"));
//		action.moveToElement(dragAndDrop).build().perform();
//		WebElement staticDropDown = driver.findElement(By.xpath("//a[@href=\"Static.html\"]"));
//		action.moveToElement(staticDropDown).click().build().perform();
		// DropDownCode started
		WebElement sourceOfElement = driver.findElement(By.xpath("//img[@src=\"original.png\"]/parent::div"));
		WebElement targetAreaOfElement = driver.findElement(By.id("droparea"));
		action.dragAndDrop(sourceOfElement, targetAreaOfElement).perform();
//		//Verify the drop down
//		String textTo = targetAreaOfElement.getText();
//		if(textTo.equals(textTo))

	}

}
