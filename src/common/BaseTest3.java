package common;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest3 {

	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	void login() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		setDriver(Configuration.createChromeDriver(options));
		wait = new WebDriverWait(getDriver(), 60);

		getDriver().manage().window().maximize();
		getDriver().get(Configuration.ADMIN_URL);

		WebElement userTextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_login")));
		userTextBox.sendKeys(Configuration.USER_NAME);

		WebElement passwordTextBox = getDriver().findElement(By.id("user_pass"));
		passwordTextBox.sendKeys(Configuration.PASSWORD);
		passwordTextBox.submit();

		boolean dashBoardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dashBoardLoaded, "Assert that dashboard is loaded");

	}

	@AfterEach
	void logOut() throws Exception {

		WebElement logOut = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
		getDriver().get(logOut.getAttribute("href"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'logged out')]")));
		getDriver().quit();

	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	protected WebDriver getDriver() {
		return driver;
	}

	protected WebDriverWait getWaiter() {
		return this.wait;
	}

}
