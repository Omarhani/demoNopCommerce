package com.nopCommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By email = By.id("Email");
    private By password = By.id("Password");
    private By loginButton = By.xpath("//button[@class='button-1 login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String Email){
        driver.findElement(email).sendKeys(Email);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public void pressOnLoginButton(){
        driver.findElement(loginButton).click();
    }

}
