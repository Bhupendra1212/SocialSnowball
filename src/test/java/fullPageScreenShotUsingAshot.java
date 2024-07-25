import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class fullPageScreenShotUsingAshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot screenshota = ashot.takeScreenshot(driver);
		BufferedImage image = screenshota.getImage();
		ImageIO.write(image, "PNG", new File("UsingAshot.png"));

	}

}
