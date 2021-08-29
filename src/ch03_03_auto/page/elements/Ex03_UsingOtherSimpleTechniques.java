package ch03_03_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex03_UsingOtherSimpleTechniques extends BaseTest1 {

	/*
	 * Identify user Name By Name
	 */
	@Test
	void test01() {
		WebElement userTextField = getDriver().findElement(By.name("log"));
		System.out.println(userTextField);
	}
	/*
	 * Identify user Name By ID
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.id("user_login"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify user Name By TagName
	 */
	@Test
	void test03() {
		WebElement element = getDriver().findElement(By.tagName("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify user Name By ClassName
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.className("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Submit Button By ClassName - (using one class from multiple classes)
	 */
	@Test
	void test05() {
		WebElement element = getDriver().findElement(By.className("button-primary"));
		SeleniumUtils.printElementInfo("Submit button", element);
	}

}
