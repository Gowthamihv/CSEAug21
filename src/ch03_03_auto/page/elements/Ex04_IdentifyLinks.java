package ch03_03_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex04_IdentifyLinks extends BaseTest1 {

	/*
	 * Identify Lost password link - By Link
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.linkText("Lost your password?"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}

	/*
	 * Identify Lost password link - By Partial Link text Contains <- and the name
	 * of the blog changes with the blog
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.partialLinkText("Back to"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}
	

}
