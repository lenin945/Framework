package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQa_LoginPOJO extends BaseClass{

	public DemoQa_LoginPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//li[@id='item-0'])[2]")
	private WebElement btnForm;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	
	@FindBy(id="userNumber")
	private WebElement mobNum;
	
	//Date of Birth
	@FindBy(id="dateOfBirthInput")
	private WebElement DOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy(xpath="//div[text()='19']")
	private WebElement day;
	
	@CacheLookup
	@FindAll({
	@FindBy(xpath="//*[@id='subjectsInput']"),
	@FindBy(className=" css-2b097c-container"),
	@FindBy(xpath="//div[@class='subjects-auto-complete__control css-yk16xz-control']")
	})
	private WebElement subject;
	
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement sportsHobby;
	
	@FindBy(xpath="//label[text()='Reading']")
	private WebElement readingHobby;
	
	@FindBy(xpath="//label[text()='Music']")
	private WebElement musicHobby;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement selectPicture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement address;
	
	public WebElement getTxtState() {
		return txtState;
	}

	@FindBy(xpath="(//*[@class='css-19bqh2r'])[1]")
	private WebElement state;
	
	@FindBy(xpath="(//*[@class=' css-1wa3eu0-placeholder'])[1]")
	private WebElement txtState;
	
	@FindBy(xpath="//div[text()='Select City']")
	private WebElement city;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	@FindBy(xpath="//button[text()='Close']")
	private WebElement close;
	
	public WebElement getClose() {
		return close;
	}

	@FindBy(xpath="(//iframe)[1]")
	private WebElement givenDetails;
	
	@FindBy(xpath="//a[@id='close-fixedban']")
	private WebElement closeAd;

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getGivenDetails() {
		return givenDetails;
	}

	public WebElement getCloseAd() {
		return closeAd;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getMobNum() {
		return mobNum;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getSportsHobby() {
		return sportsHobby;
	}

	public WebElement getReadingHobby() {
		return readingHobby;
	}

	public WebElement getMusicHobby() {
		return musicHobby;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getBtnForm() {
		return btnForm;
	}
	
	public WebElement getSelectPicture() {
		return selectPicture;
	}

	
	
}
