package ch03_01_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex04_Browser {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createChromeDriver();
		Thread.sleep(3000);
		driver.quit();

	}

}
