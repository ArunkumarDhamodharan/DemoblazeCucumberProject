package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginPageStepClass extends BaseClass {

	@Given("User Should in E-Commerce Login Page")
	public void user_should_in_e_commerce_login_page() {
		try {
			getDriver("Chrome");
			windMax();
			
			getUrl("https://www.demoblaze.com/");
			System.out.println("Browser and Url getting Launched successfully");

		} catch (Exception e) {
			System.out.println("Browser and Url not getting launched");
		}

	}

	@When("User Should Enter the UserName and Password")
	public void user_should_enter_the_user_name_and_password() {
		try {
			PageClass a = new PageClass();

			WebElement login = a.getLogin();
			login.click();

			WebElement userName = a.getUserName();
			userName.clear();
//		sendBasedOnJs(excelRead(1, 0), userName);
			userName.sendKeys("arunkumar9344974530@gmail.com");

			WebElement password = a.getPassword();
			password.clear();
//		sendBasedOnJs(excelRead(1,1),password );
			password.sendKeys("Arun111#@");

			System.out.println("Valid UserName and Password are Entered");
		} catch (Exception e) {
			System.out.println("Valid UserName and Password are Not Entered " + "Error" + e.getMessage());
		}
	}

	@When("User should Click The Login button")
	public void user_should_click_the_login_button() {
		try {
			PageClass a = new PageClass();
			WebElement loginButton = a.getLoginButton();
			loginButton.click();
			Thread.sleep(5000);
			System.out.println("Login button clicked Successfull");
		} catch (Exception e) {
			System.out.println("Login button not clicked " + "Error" + e.getMessage());
		}

	}

	@When("User Should Choose The Laptop and Add To Cart")
	public void user_should_choose_the_laptop_and_add_to_cart() {
		try {
			PageClass a = new PageClass();

			WebElement chooseLaptop = a.getChooseLaptop();
			chooseLaptop.click();

			Thread.sleep(2000);
			WebElement macbookAir = a.getMacbookAir();
			macbookAir.click();

			Thread.sleep(2000);
			WebElement addtoCart = a.getAddtoCart();
			addtoCart.click();

			Thread.sleep(2000);
			acceptAlert();

			System.out.println("AddTo Cart and Alerts are clicked Successfully");
		} catch (Exception e) {
			System.out.println("AddTo Cart and Alerts are Not clicked " + "Error" + e.getMessage());
		}
	}

	@When("User Should Cart Click and Accept the Alert")
	public void user_should_cart_click_and_accept_the_alert() {
		try {
			PageClass a = new PageClass();

			WebElement cartClick = a.getCartClick();
			cartClick.click();

			Thread.sleep(3000);
			WebElement placeOrder = a.getPlaceOrder();
			placeOrder.click();

			System.out.println("Place Order Clicked Successfullly ");

		} catch (Exception e) {
			System.out.println("Place Order Not Clicked " + "Error " + e.getMessage());
		}
	}

	@When("User Should Enter The Valid Credentials")
	public void user_should_enter_the_valid_credentials() {
		try {
			PageClass a = new PageClass();

			WebElement name = a.getName();
			sendBasedOnJs(excelRead(1, 2), name);
//		name.sendKeys("Arunkumar");

			WebElement country = a.getCountry();
			sendBasedOnJs(excelRead(1, 3), country);
//		country.sendKeys("India");

			WebElement city = a.getCity();
			sendBasedOnJs(excelRead(1, 4), city);
//		city.sendKeys("Chennai");

			WebElement creditCard = a.getCreditCard();
			sendBasedOnJs(excelRead(1, 5), creditCard);
//		creditCard.sendKeys("7890876756789087");

			WebElement month = a.getMonth();
			sendBasedOnJs(excelRead(1, 6), month);
//		month.sendKeys("11");

			WebElement year = a.getYear();
			sendBasedOnJs(excelRead(1, 7), year);
//		year.sendKeys("2025");

			Thread.sleep(3000);
			WebElement purchaseButton = a.getPurchaseButton();
			purchaseButton.click();
			Thread.sleep(2000);

			System.out.println("Valid Credentials Are Entered and Purchase button Clicked");
		} catch (Exception e) {
			System.out.println(
					"Valid Credentials Are not Entered and Purchase button not Clicked " + "Error" + e.getMessage());
		}
	}

	@When("User Should Get The BuyDetails")
	public void user_should_get_the_buy_details() {
		try {
			PageClass a = new PageClass();

			WebElement buyDetails = a.getBuyDetails();
			String text2 = buyDetails.getText();
			System.out.println(text2);
			System.out.println("********************");

			System.out.println("Details collect Successfull");
		} catch (Exception e) {
			System.out.println("Details Not Collect" + "Error" + e.getMessage());
		}
	}

	@Then("User Should verify the Succesfull Message")
	public void user_should_verify_the_succesfull_message() {
		System.out.println("verify the Succesfull Message");
	}
}
