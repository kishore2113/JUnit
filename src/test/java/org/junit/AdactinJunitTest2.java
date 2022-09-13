package org.junit;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinJunitTest2 extends BaseClass {
	public static AdactinJunitTest2 b;
	public static PageObject p;

	@Test
	public void b1() {
		b = new AdactinJunitTest2();
		p = new PageObject();
		WebElement btnSelect = p.getBtnSelect();
		b.btnClick(btnSelect);
	}

	@Test
	public void b2() {
		WebElement btnContinue = p.getBtnContinue();
		b.btnClick(btnContinue);
	}

}
