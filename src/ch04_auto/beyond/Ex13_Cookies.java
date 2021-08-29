package ch04_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import common.BaseTest2;

class Ex13_Cookies extends BaseTest2 {

	@Test
	void handleCookies() {
		for (Cookie cookie : getDriver().manage().getCookies()) {
			System.out.println("Cookie information");
			System.out.println("Name: " + cookie.getName());
			System.out.println("Value: " + cookie.getValue());
			System.out.println("Domain: " + cookie.getDomain());
			System.out.println("Path: " + cookie.getPath());
			System.out.println("Secure? " + cookie.isSecure());
			System.out.println("Httponly? " + cookie.isHttpOnly());
			System.out.println("Full text: " + cookie);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().navigate().refresh(); // login page

		getDriver().findElement(By.name("log"));
		// As we are on the home page, the @AfterEach will fail in BaseTest2

	}

}
