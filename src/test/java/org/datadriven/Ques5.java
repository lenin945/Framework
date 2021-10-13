package org.datadriven;

import java.io.IOException;

import org.adactinPOJO.BookHotelPage;
import org.adactinPOJO.BookingConfirmationPage;
import org.adactinPOJO.LoginPage;
import org.adactinPOJO.SearchHotelPage;
import org.adactinPOJO.SelectHotelPage;
import org.utilities.BaseClass;

public class Ques5 extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchChrome();
		winMax();
		launchUrl("https://adactinhotelapp.com/");
		waitsec(20);
		LoginPage l = new LoginPage();
		insertValues(l.getUsrnme(), getExcelData("adactin_login_details", 2, 0));
		insertValues(l.getPasswd(), getExcelData("adactin_login_details", 2, 1));
		btnClick(l.getLoginbtn());
		SearchHotelPage s = new SearchHotelPage();
		selectValue(s.getLoc(), getExcelData("adactin_login_details", 2, 2));
		selectValue(s.getHotel(), getExcelData("adactin_login_details", 2, 3));
		selectValue(s.getRoomtype(), getExcelData("adactin_login_details", 2, 4));
		selectValue(s.getRoomnos(), getExcelData("adactin_login_details", 2, 5));
		clearText(s.getChkin());
		insertValues(s.getChkin(), getExcelData("adactin_login_details", 2, 6));
		clearText(s.getChkout());
		insertValues(s.getChkout(), getExcelData("adactin_login_details", 2, 7));
		selectValue(s.getAdultrm(), getExcelData("adactin_login_details", 2, 8));
		selectValue(s.getChildrm(), getExcelData("adactin_login_details", 2, 9));
		btnClick(s.getSubmitBtn());
		SelectHotelPage sc = new SelectHotelPage();
		btnClick(sc.getSelectHotel());
		btnClick(sc.getCont());
		BookHotelPage b = new BookHotelPage();
		insertValues(b.getFirstnm(), getExcelData("adactin_login_details", 2, 10));
		insertValues(b.getLastnm(), getExcelData("adactin_login_details", 2, 11));
		insertValues(b.getAddress(), getExcelData("adactin_login_details", 2, 12));
		insertValues(b.getCc_num(), getExcelData("adactin_login_details", 2, 13));
		selectValue(b.getCc_type(), getExcelData("adactin_login_details", 2, 14));
		selectValue(b.getCc_exp_month(), getExcelData("adactin_login_details", 2, 15));
		selectValue(b.getCc_exp_year(), getExcelData("adactin_login_details", 2, 16));
		insertValues(b.getCc_cvv(), getExcelData("adactin_login_details", 2, 17));
		btnClick(b.getBook_now());
		BookingConfirmationPage bc = new BookingConfirmationPage();
		String orderID = getAttribute(bc.getOrderNo());
		System.out.println(orderID);
		btnClick(bc.getLogOut());
		closeBrowser();

	}

}
