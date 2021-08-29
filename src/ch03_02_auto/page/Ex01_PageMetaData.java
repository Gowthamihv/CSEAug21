package ch03_02_auto.page;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex01_PageMetaData {

	public static void main(String[] args) {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);

		System.out.println("URL: " + driver.getCurrentUrl());
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Page source: " + driver.getPageSource());

		driver.quit();

	}

}
