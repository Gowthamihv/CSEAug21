package ch03_03_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex02_PrintElementInfo extends BaseTest1 {

	/*
	 * Identify user Name By Name
	 */
	@Test
	void test() {
		WebElement userTextField = getDriver().findElement(By.name("log"));
		SeleniumUtils.printElementInfo("User Name Text field", userTextField);

	}

}
