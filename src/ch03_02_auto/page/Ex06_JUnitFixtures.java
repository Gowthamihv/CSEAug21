package ch03_02_auto.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex06_JUnitFixtures {

	WebDriver driver = null;

	@BeforeEach
	void launchBrowser() throws Exception {
		driver = Configuration.createChromeDriver();
	}

	@AfterEach
	void closeBrowser() throws Exception {
		driver.quit();
	}

	@Test
	void testSiteTitle() {
		driver.get(Configuration.BLOG_URL);
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();

		assertEquals(expectedTitle, actualTitle, "Verifying Site Title");
	}

}
