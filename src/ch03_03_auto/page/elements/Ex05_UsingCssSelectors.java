package ch03_03_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex05_UsingCssSelectors extends BaseTest1 {

	/*
	 * Identify user name text field using CSS Selector (Tag Name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.cssSelector("input"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify user name text field using CSS Selector (Tag Name and a given
	 * attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type]"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify Password text field using CSS Selector (Tag Name, attribute and a
	 * value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='password']"));
		SeleniumUtils.printElementInfo("Password Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector (Tag Name, attribute and a
	 * value) variant of test03
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id='user_login']"));
		SeleniumUtils.printElementInfo("User name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector (Tag Name, attribute and a
	 * value) variant of test03
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[class='input']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector (Tag Name, attribute and a
	 * value) variant of test03
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[name='log']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Special Symbols # means ID
	 */
	@Test
	void test04_01() {
		WebElement element = getDriver().findElement(By.cssSelector("#user_login"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Special Symbols . means
	 * class
	 */
	@Test
	void test04_02() {
		WebElement element = getDriver().findElement(By.cssSelector(".input"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Special Symbols * any tag
	 */
	@Test
	void test04_03() {
		WebElement element = getDriver().findElement(By.cssSelector("*[name='log']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Relationships (Parent to
	 * child) Denoted by >
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.cssSelector("label>input"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Relationships (Sibling)
	 * Denoted by +
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.cssSelector("br+input"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Partial Match Contains *=
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id*='er_l']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Partial Match Starts With
	 * ^=
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id^='user_']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Partial Match ends With $=
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id$='_login']"));
		SeleniumUtils.printElementInfo("User Name Text Field", element);
	}

	/*
	 * Identify Login Button using CSS Selector - Partial Match Contains Word - ~=
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[value~='In']"));
		SeleniumUtils.printElementInfo("Login Button", element);
	}

	/*
	 * Identify User name text field using CSS Selector - Logical Operators Logical
	 * OR (comma ,)
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input, input[name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using CSS Selector - Logical Operators You can
	 * use a class with . operator which acts as an and condition on the previous
	 * part of the CSS Selector
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input.input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field using CSS Selector - Logical Operators You can
	 * use an id with # operator which acts as an and condition on the previous part
	 * of the CSS Selector
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input#user_pass"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}

	/*
	 * Identify Password text field using CSS Selector - Logical Operators Using the
	 * not() function
	 */
	@Test
	void test07_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input:not([name='log'])"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}

	/*
	 * Identify User Name text field using CSS Selector - Multiple Attributes
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type][name]"));
		SeleniumUtils.printElementInfo("User name Text field", element);
	}

	/*
	 * Identify Password text field using CSS Selector - Multiple Attributes with
	 * value
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='text'][name='log']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}

}
