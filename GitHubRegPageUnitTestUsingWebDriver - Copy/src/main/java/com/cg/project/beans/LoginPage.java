package com.cg.project.beans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	@FindBy(id="user[login]")
	WebElement username;

	@FindBy(id="user[email]")
	WebElement email;
	
	@FindBy(id="user[password]")
	WebElement password;

	@FindBy(className="btn")
	WebElement button;


	public LoginPage(){}
	public WebElement getUsername() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickSubmitButton() {
		button.submit();
	}
}
