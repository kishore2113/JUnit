package org.junit;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinJunitTest1 extends BaseClass {

	public static AdactinJunitTest1 a;
	public static PageObject p;

	@Test
	public void a1() {
		a = new AdactinJunitTest1();
		a.getdriver();
		a.launchUrl("https://adactinhotelapp.com/");
		p = new PageObject();
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void a2() {

		WebElement findName = p.getTxtUserName();
		a.sendvalue(findName, "kishore2113");
		WebElement findPassword = p.getTxtPassword();
		a.sendvalue(findPassword, "powertyu");
		WebElement btnLogIn = p.getBtnLogIn();
		a.btnClick(btnLogIn);
	}

	@Test
	public void a3() throws IOException {
		WebElement txtLocation = p.getTxtLocation();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 2);
		a.ddSelectByVisibleText(txtLocation, readxclSingleValue);
	}

	@Test
	public void a4() throws IOException {
		WebElement ddHotels = p.getDdHotels();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 3);
		a.ddSelectByVisibleText(ddHotels, readxclSingleValue);
	}

	@Test
	public void a5() throws IOException {
		WebElement ddRoomType = p.getDdRoomType();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 4);
		a.ddSelectByVisibleText(ddRoomType, readxclSingleValue);
	}

	@Test
	public void a6() throws IOException {
		WebElement ddRooms = p.getDdRooms();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 5);
		a.ddSelectByVisibleText(ddRooms, readxclSingleValue);
	}

	@Test
	public void a7() throws IOException {
		WebElement txtCheckInDate = p.getTxtCheckInDate();
		txtCheckInDate.clear();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 6);
		a.sendvalue(txtCheckInDate, readxclSingleValue);

		WebElement txtCheckOutDate = p.getTxtCheckOutDate();
		txtCheckOutDate.clear();
		String readxclSingleValue2 = a.readxclSingleValue("Adactin", 1, 7);
		a.sendvalue(txtCheckOutDate, readxclSingleValue2);

	}

	@Test
	public void a8() throws IOException {
		WebElement ddAdultsPerRoom = p.getDdAdultsPerRoom();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 8);
		p.ddSelectByVisibleText(ddAdultsPerRoom, readxclSingleValue);
	}

	@Test
	public void a9() throws IOException {
		WebElement ddchild = p.getDdChildPerRoom();
		String readxclSingleValue = a.readxclSingleValue("Adactin", 1, 9);
		a.ddSelectByVisibleText(ddchild, readxclSingleValue);
	}

	@Test
	public void a10() {
		WebElement btnSearch = p.getBtnSearch();
		a.btnClick(btnSearch);
	}

}
