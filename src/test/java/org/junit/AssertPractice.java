package org.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AssertPractice extends BaseClass {
	public static AssertPractice a;
	@Test
	public void tc01() {
		a= new AssertPractice();
		a.getdriver();
		a.launchUrl("https://adactinhotelapp.com/");
		WebElement locators = a.Locators("id", "username");
		a.sendvalue(locators, "Kishore2113");
		Assert.assertEquals(locators, true);
		System.out.println("test1");
		WebElement locators1 = a.Locators("id", "password");
		a.sendvalue(locators1, "powertyu");
	}

	@Test
	public void tc02() {
		System.out.println("test4");
	}
}

