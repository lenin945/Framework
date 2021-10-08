package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQa_HomePOJO extends BaseClass {
	
	public DemoQa_HomePOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='card mt-4 top-card'])[2]")
	private WebElement btnForms;

	public WebElement getBtnForms() {
		return btnForms;
	}
	

}
