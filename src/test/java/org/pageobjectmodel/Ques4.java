package org.pageobjectmodel;

import java.awt.AWTException;

import org.utilities.BaseClass;
import org.utilities.DemoQa_HomePOJO;
import org.utilities.DemoQa_LoginPOJO;

public class Ques4 extends BaseClass{
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		launchChrome();
		launchUrl("https://demoqa.com/");
		winMax();
		waitsec(10);
		
		DemoQa_HomePOJO d =new DemoQa_HomePOJO();
		btnClick(d.getBtnForms());
		
		DemoQa_LoginPOJO dl =new DemoQa_LoginPOJO();
		btnClick(dl.getCloseAd());
		btnClick(dl.getBtnForm());
		insertValues(dl.getFirstName(), "lenin");
		insertValues(dl.getLastName(), "Raju");
		insertValues(dl.getUserEmail(), "lenin@gmail.com");
		btnClick(dl.getMale());
		insertValues(dl.getMobNum(), "9943680807");
		btnClick(dl.getDOB());
		selectValue(dl.getYear(), "1995");
		selectValue(dl.getMonth(), "3");
		btnClick(dl.getDay());
		btnClick(dl.getSubject());
		insertValues(dl.getSubject(), "Maths");
		enterKey();
		insertValues(dl.getSubject(), "physics");
		enterKey();
		btnClick(dl.getSportsHobby());
		btnClick(dl.getMusicHobby());
		btnClick(dl.getReadingHobby());
		insertValues(dl.getSelectPicture(), "C:\\Users\\lenin\\OneDrive\\Documents\\GIt_Cloning\\Framework\\Data\\wp2599337.jpg");
		insertValues(dl.getAddress(), "kullathupathai street, Sankarapuram");
		Thread.sleep(3000);
		btnClick(dl.getState());
		downKey();
		downKey();
		downKey();
		enterKey();
		Thread.sleep(3000);
		btnClick(dl.getCity());
		downKey();
		enterKey();
		btnClick(dl.getSubmit());
//		switchToFrame(dl.getGivenDetails());
//		defaultWindow();
		Thread.sleep(3000);
		scrollDown(dl.getClose());
		btnClick(dl.getClose());
		closeBrowser();
	
	}

}
