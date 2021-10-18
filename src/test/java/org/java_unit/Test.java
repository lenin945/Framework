package org.java_unit;

import org.utilities.BaseClass;
import org.utilities.Redbus_LoginPage;

public class Test extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		launchUrl("https://www.redbus.in/");
		waitsec(10);
		winMax();
		Redbus_LoginPage r = new Redbus_LoginPage();
		btnClick(r.getSinginBtn());
		btnClick(r.getSignInLink());
		switchToFrame(r.getSignInFrame());
		Thread.sleep(5000);
		btnClick(r.getSignInFb());
		Thread.sleep(5000);
		switchWindow(1);
		insertValues(r.getFbUsr(), "ganapathyraja945@gmail.com");
		insertValues(r.getFbPass(), "Pgr.pgr@1");
		btnClick(r.getFbLogin());
		switchWindow(0);
	}
}
