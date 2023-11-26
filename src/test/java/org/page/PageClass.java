package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass extends BaseClass {
	public PageClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login2")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="loginusername")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(id="loginpassword")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(xpath="(//a[@class='list-group-item'])[3]")
	private WebElement chooseLaptop;
	
	public WebElement getChooseLaptop() {
		return chooseLaptop;
	}
	@FindBy(xpath="(//a[@class='hrefch'])[3]")
	private WebElement macbookAir;
	
	public WebElement getMacbookAir() {
		return macbookAir;
	}
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	private WebElement addtoCart;
	
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cartClick;
	
	public WebElement getCartClick() {
		return cartClick;
	}
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement placeOrder;
	
	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	@FindBy(id="name")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}
	@FindBy(id="country")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(id="city")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	@FindBy(id="card")
	private WebElement creditCard;
	
	public WebElement getCreditCard() {
		return creditCard;
	}
	@FindBy(id="month")
	private WebElement month;
	
	public WebElement getMonth() {
		return month;
	}
	@FindBy(id="year")
	private WebElement year;
	
	public WebElement getYear() {
		return year;
	}
	@FindBy(xpath="//button[text()='Purchase']")
	private WebElement purchaseButton;
	
	public WebElement getPurchaseButton() {
		return purchaseButton;
	}
	@FindBy(xpath="//p[@class='lead text-muted ']")
	private WebElement buyDetails;
	
	public WebElement getBuyDetails() {
		return buyDetails;
	}
}
