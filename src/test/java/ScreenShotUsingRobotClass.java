import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotUsingRobotClass {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		Rectangle rec = new Rectangle();
		rec.setSize(1280, 800);
		BufferedImage Image = robo.createScreenCapture(rec);
		File file = new File("Screenshot.png");
		ImageIO.write(Image, "PNG",file);

	}

}
