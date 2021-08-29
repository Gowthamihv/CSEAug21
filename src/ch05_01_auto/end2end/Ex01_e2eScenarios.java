package ch05_01_auto.end2end;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;

class Ex01_e2eScenarios extends BaseTest2 {

	@Test
	void updateSettings() {

		getDriver().findElement(By.linkText("Settings")).click();
		getWaiter().until(ExpectedConditions.elementToBeClickable(By.id("submit")));

		String blogTitle = "Selenium Blog";
		WebElement blogName = getDriver().findElement(By.id("blogname"));
		blogName.clear();
		blogName.sendKeys(blogTitle);
		assertEquals(blogTitle, blogName.getAttribute("value"),
				String.format("Blog title should be %s.", blogTitle));

		WebElement usersCanRegister = getDriver().findElement(By.id("users_can_register"));
		if (!usersCanRegister.isSelected()) {
			usersCanRegister.click();
		}
		assertTrue(usersCanRegister.isSelected(), "Verify that anyone can register is checked");

		WebElement targetRadio = getDriver().findElement(By.cssSelector("input[type='radio'][value='m/d/Y']"));
		targetRadio.click();
		assertTrue(targetRadio.isSelected(),
				String.format("%s date format should be selected", targetRadio.getAttribute("value")));

		String expectedDay = "Tuesday";

		Select weekStart = new Select(getDriver().findElement(By.id("start_of_week")));
		weekStart.selectByVisibleText(expectedDay);

		String actualDay = weekStart.getFirstSelectedOption().getText();
		assertEquals(expectedDay, actualDay, "Verify selected Start of the week");

		getDriver().findElement(By.tagName("form")).submit();
		assertTrue(getDriver().findElement(By.xpath("//strong[text()='Settings saved.']")).isDisplayed(),
				"Settings should be saved. ");

	}

}
