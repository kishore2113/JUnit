package org.junit;

import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinJunitTest3 extends BaseClass {
	public static BaseClass c;
	public static PageObject p;

	@Test
	public void c1() throws IOException {
		c = new AdactinJunitTest2();
		p = new PageObject();
		WebElement txtFirstName = p.getTxtFirstName();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 10);
		c.sendvalue(txtFirstName, readxclSingleValue);
	}

	@Test
	public void c2() throws IOException {
		WebElement txtLastName = p.getTxtLastName();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 11);
		c.sendvalue(txtLastName, readxclSingleValue);
	}

	@Test
	public void c3() throws IOException {
		WebElement txtAddress = p.getTxtAddress();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 12);
		c.sendvalue(txtAddress, readxclSingleValue);
	}

	@Test
	public void c4() throws IOException {
		WebElement txtCcNumber = p.getTxtCcNumber();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 13);
		c.sendvalue(txtCcNumber, readxclSingleValue);
	}

	@Test
	public void c5() throws IOException {
		WebElement ddCcType = p.getDdCcType();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 14);
		c.sendvalue(ddCcType, readxclSingleValue);
	}

	@Test
	public void c6() throws IOException {
		WebElement ddExpiryMonth = p.getDdExpiryMonth();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 15);
		c.sendvalue(ddExpiryMonth, readxclSingleValue);
	}

	@Test
	public void c7() throws IOException, InterruptedException {
		Thread.sleep(3000);
		WebElement ddExpiryYear = p.getDdExpiryYear();
		String readxclSingleValue = c.readxclSingleValue("Adactin", 1, 16);
		c.ddSelectByVisibleText(ddExpiryYear, readxclSingleValue);

	}

	@Test
	public void c8() throws IOException {
		WebElement txtCvv = p.getTxtCvv();
		String string = c.readxclSingleValue("Adactin", 1, 17);
		c.sendvalue(txtCvv, string);
	}

	@Test
	public void c9() {
		WebElement btnBookNow = p.getBtnBookNow();
		c.btnClick(btnBookNow);
	}

}

