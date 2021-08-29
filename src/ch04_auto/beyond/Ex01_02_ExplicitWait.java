package ch04_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Configuration;

class Ex01_02_ExplicitWait {

	@Test
	void test() {
		WebDriver driver = Configuration.createChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);

		driver.get(Configuration.ADMIN_URL);

		WebElement userTextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_login")));
		userTextBox.sendKeys(Configuration.USER_NAME);

		WebElement passwordTextBox = driver.findElement(By.id("user_pass"));
		passwordTextBox.sendKeys(Configuration.PASSWORD);

		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("wp-submit")));
		submitButton.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='WordPress News']")));

		WebElement logOut = driver.findElement(By.xpath("//*[text()='Log Out']"));
		driver.get(logOut.getAttribute("href"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'logged out')]")));
		driver.quit();

	}

}
