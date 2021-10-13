package org.datadriven;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.utilities.BaseClass;
import org.utilities.DemoQa_HomePOJO;
import org.utilities.DemoQa_LoginPOJO;

public class Ques8 extends BaseClass {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	launchChrome();
	launchUrl("https://demoqa.com/");
	winMax();
	waitsec(10);
	
	DemoQa_HomePOJO d =new DemoQa_HomePOJO();
	btnClick(d.getBtnForms());
	
	DemoQa_LoginPOJO dl =new DemoQa_LoginPOJO();
	btnClick(dl.getCloseAd());
	btnClick(dl.getBtnForm());
	insertValues(dl.getFirstName(), getExcelData("demoqa_reg", 2, 0));
	insertValues(dl.getLastName(), getExcelData("demoqa_reg", 2, 1));
	insertValues(dl.getUserEmail(), getExcelData("demoqa_reg", 2, 2));
	btnClick(dl.getMale());
	insertValues(dl.getMobNum(), getExcelData("demoqa_reg", 2, 3));
	btnClick(dl.getDOB());
//	clearText(dl.getDOB());
//	selectValue(dl.getYear(), "1995");
//	selectValue(dl.getMonth(), "3");
//	btnClick(dl.getDay());
	insertValues(dl.getDOB(), getExcelData("demoqa_reg", 2, 4));
	btnClick(dl.getSubject());
	insertValues(dl.getSubject(), getExcelData("demoqa_reg", 2, 7));
	downKey();
	enterKey();
	btnClick(dl.getSportsHobby());
	btnClick(dl.getMusicHobby());
	btnClick(dl.getReadingHobby());
	insertValues(dl.getSelectPicture(), "C:\\Users\\lenin\\OneDrive\\Documents\\GIt_Cloning\\Framework\\Data\\wp2599337.jpg");
	insertValues(dl.getAddress(), getExcelData("demoqa_reg", 2, 8));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("argument[0].setAttribute('value', 'Rajasthan')", dl.getState());
//	btnClick(dl.getTxtState());
//	Thread.sleep(4000);
//	insertValues(dl.getTxtState(), getExcelData("demoqa_reg", 2, 9));
//	downKey();
////	Thread.sleep(2000);
////	downKey();
////	Thread.sleep(2000);
////	downKey();
//	enterKey();
//	Thread.sleep(2000);
//	btnClick(dl.getCity());
//	insertValues(dl.getCity(), getExcelData("demoqa_reg", 2, 10));
//	Thread.sleep(2000);
//	enterKey();
//	btnClick(dl.getSubmit());
////	switchToFrame(dl.getGivenDetails());
////	defaultWindow();
//	Thread.sleep(3000);
//	scrollDown(dl.getClose());
//	btnClick(dl.getClose());
//	closeBrowser();

}
}
