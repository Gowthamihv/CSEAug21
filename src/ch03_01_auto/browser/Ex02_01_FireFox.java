package ch03_01_auto.browser;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex02_01_FireFox {

	public static void main(String[] args) throws Exception {

		String driverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator
				+ "geckodriver"; // add .exe for windows

		System.setProperty("webdriver.gecko.driver", driverPath);
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(3000); // static wait
		driver.quit();

	}

}
