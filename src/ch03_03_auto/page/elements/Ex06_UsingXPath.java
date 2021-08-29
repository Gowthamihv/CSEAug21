package ch03_03_auto.page.elements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06_UsingXPath extends BaseTest1 {

	/*
	 * Identify User name text field using XPath - Absolute (tag name) DO NOT USE
	 * THIS IN PROFESSIONAL WORK Absolute XPath are Evil ;->
	 */
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[1]/form/p[1]/label/input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Now onwards we will stick to relative XPath as Absolute XPath are brittle
	 * Identify User name text field using XPath (tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath (tag name with attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field using XPath (tag name, attribute and value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User name text field using XPath - ID Variant of test03
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - class Variant of test03
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - name Variant of test03
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - any tag - attribute and value
	 * Variant of test03
	 */
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Lost your password link using XPath - Text
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost your Password link text", element);
	}

	/*
	 * Identify user name text field using XPath - Relationships - Child
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify user name text field using XPath - Relationships - Following-Sibling
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//br/following-sibling::input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify user name text field using XPath - Partial Match - Attribute value
	 * Contains
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id,'er_l')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify user name text field using XPath - Partial Match - Attribute value
	 * starts-with
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id,'user_')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify user name text field using XPath - Partial Match - Attribute value
	 * ends-with is not supported in current browsers. As it requires XPath V2.0
	 * whereas all the browsers use XPath V1.0
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id,'login')]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Lost your password link using XPath - Partial Match - Text Contains
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.xpath("//a[contains(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}

	/*
	 * Identify Lost your password using XPath - Partial Match - Text starts-with
	 */
	@Test
	void test06_05() {
		WebElement element = getDriver().findElement(By.xpath("//a[starts-with(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password", element);
	}

	/*
	 * Identify user name text field using XPath - Logical OR: using the or keyword
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class = 'input' or @id = 'user_pass']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify user name text field using XPath - Logical AND: using the and
	 * keyword
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class = 'input' and @id = 'user_pass']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Password text field using XPath - Logical NOT: using the not()
	 * function
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class = 'input' and not(@name='log')]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Form using XPath - Hierarchy (Axis) - Parent
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/../.."));
		SeleniumUtils.printElementInfo("Form", element);
	}

	/*
	 * Identify User name text field using XPath - Hierarchy (Axis) - Descendant
	 * (Using // instead of / between form and input
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.xpath("//form//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify Form using XPath - Hierarchy (Axis) - Ancestors
	 */
	@Test
	void test08_03() {
		WebElement element = getDriver().findElement(By.xpath("//input/ancestor::form"));
		SeleniumUtils.printElementInfo("Form", element);
	}

	/*
	 * Identify User name text field using XPath - Hierarchy (Axis) -
	 * Preceding-Sibling Starting from the submit paragraph
	 */
	@Test
	void test08_04() {
		WebElement element = getDriver().findElement(By.xpath("//p[@class='submit']/preceding-sibling::p//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Index (Index uses Human Counting)
	 * This variant looks at children of the same parent This is the reason
	 * //input[2] does not point to the password field
	 */
	@Test
	void test09_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Index (Index uses Human Counting)
	 * This variant looks at elements across the DOM Here (//input)[2] would point
	 * to password field
	 */
	@Test
	void test09_02() {
		WebElement element = getDriver().findElement(By.xpath("(//input)[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Multiple attribute names
	 */
	@Test
	void test10_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type and @name]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Multiple attribute names values
	 */
	@Test
	void test10_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type = 'text' and @name= 'log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

}
