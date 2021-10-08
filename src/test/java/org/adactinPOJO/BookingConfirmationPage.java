package org.adactinPOJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "order_no")
	private WebElement orderNo;
	@FindBy(name = "logout")
	private WebElement logOut;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	public WebElement getLogOut() {
		return logOut;
	}
	
	
}
