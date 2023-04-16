package org.sample;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Urgent {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANIKANDAN\\eclipse-workspace_selenium\\Urgent\\driveer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\MANIKANDAN\\eclipse-workspace_selenium\\Urgent\\driveer\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\MANIKANDAN\\eclipse-workspace_selenium\\Urgent\\driveer\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("http://output.jsbin.com/osebed/2");

		TakesScreenshot t = (TakesScreenshot)driver;
		
		File img = t.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\MANIKANDAN\\eclipse-workspace_selenium\\Urgent\\Screenshot\\jdbn.png");
		
		//FileUtils.copyFile(img, des);
		
		FileUtils.copyFile(img, des);		
		
		System.out.println();
		
	}

}
