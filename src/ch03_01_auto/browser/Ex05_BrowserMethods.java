package ch03_01_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex05_BrowserMethods {

	public static void main(String[] args) {
		WebDriver driver = Configuration.createChromeDriver();
		driver.manage().window().maximize();
		driver.get(Configuration.BLOG_URL);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		System.out.println("Windows Handle: " + driver.getWindowHandle());

		for (String win : driver.getWindowHandles()) {
			System.out.println("H " + win);
		}

		driver.quit();

	}

}
