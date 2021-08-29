package ch03_03_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class Ex02_LoginAndLogOut extends BaseTest1 {

	@Test
	void test() throws Exception {

		WebElement userTextBox = getDriver().findElement(By.id("user_login"));
		userTextBox.sendKeys(Configuration.USER_NAME);

		WebElement passwordTextBox = getDriver().findElement(By.id("user_pass"));
		passwordTextBox.sendKeys(Configuration.PASSWORD);
		passwordTextBox.submit();

		boolean dashBoardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dashBoardLoaded, "Assert that dashboard is loaded");

		WebElement logOut = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
		getDriver().get(logOut.getAttribute("href"));

		Thread.sleep(3000);

		WebElement logOutMsg = getDriver().findElement(By.xpath("//*[contains(text(),'logged out')]"));
		assertTrue(logOutMsg.isDisplayed(), "Assert successfull logout");

	}

}
