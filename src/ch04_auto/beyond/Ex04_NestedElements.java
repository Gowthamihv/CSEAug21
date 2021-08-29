package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;

class Ex04_NestedElements extends BaseTest2 {

	@Test
	void test() {
		this.getDriver().findElement(By.linkText("Posts")).click();
		this.getDriver().findElement(By.linkText("Categories")).click();

		WebElement table = getDriver().findElement(By.className("wp-list-table"));
		WebElement firstCheckbox = table.findElement(By.name("delete_tags[]"));
		firstCheckbox.click();
		assertTrue(firstCheckbox.isSelected(), "Assert checkbox selection");

	}

}
