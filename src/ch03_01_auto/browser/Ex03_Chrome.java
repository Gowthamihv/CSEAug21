package ch03_01_auto.browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_Chrome {

	public static void main(String[] args) throws Exception {

		String driverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator
				+ "chromedriver"; // add .exe for windows

		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000); // static wait
		driver.quit();

	}

}
