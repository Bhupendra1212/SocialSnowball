package com.InterviewQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CheckDuplicateInDropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		List <WebElement> list=driver.findElements(By.xpath("//select"));
		System.out.println(list);
		for(int i=1;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
		}
		
			
		}
		
	}


