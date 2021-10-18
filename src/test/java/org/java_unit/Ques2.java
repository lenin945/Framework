package org.java_unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.Redbus_LoginPage;

public class Ques2 extends BaseClass {

	Redbus_LoginPage r;

	@BeforeClass
	public static void launchBrowser() {
		launchChrome();
		// winMax();
	}

	@AfterClass
	public static void quitBrowser() {
		 closeBrowser();
	}

	@Before
	public void startTime() {
		printDateAndTime();
	}

	@After
	public void endTime() {
		printDateAndTime();
	}

	@Test
	public void tc1() {

		launchUrl("https://www.redbus.in/");
		winMax();
	}

	@Test
	public void tc2() throws InterruptedException {
		waitsec(10);
		r = new Redbus_LoginPage();
		btnClick(r.getSinginBtn());
		btnClick(r.getSignInLink());
		switchToFrame(r.getSignInFrame());
		Thread.sleep(3000);
		btnClick(r.getSignInFb());
		Thread.sleep(3000);
		switchWindow(1);
		insertValues(r.getFbUsr(), "leninmathiyarasi@gmail.com");
		insertValues(r.getFbPass(), "Lenin@1995");
		btnClick(r.getFbLogin());
		switchWindow(0);
	}

	@Test
	public void tc3() throws InterruptedException {
		waitsec(20);
		WebElement trip = locateWebelement(By.xpath("(//li[@class='personalization-link-blocks config-options'])[1]"));
		r = new Redbus_LoginPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement loc = locateWebelement(By.id("i-icon-profile"));
		// btnClick(r.getSinginBtn());
		js.executeScript("arguments[0].click()", r.getSinginBtn());

		WebElement signout = locateWebelement(By.xpath("//li[@id='signOutLink']"));

		if (signout.isDisplayed()) {
			System.out.println("Login Succesful");
			btnClick(signout);
		} else {
			System.out.println("Login Unsuccesful");
		}
	}

}
