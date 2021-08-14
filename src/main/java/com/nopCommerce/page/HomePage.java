package com.nopCommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;
    private By currencyDropdown = By.id("customerCurrency");
    private By logoutText = By.xpath("//a[@class='ico-logout']");

    Select select ;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement onLink(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public void selectCurrency(String currencyName){
        select = new Select(driver.findElement(currencyDropdown));
        select.selectByVisibleText(currencyName);
    }
    public RegisterPage clickOnRegister(){
         onLink("//a[@class='ico-register']").click();
         return new RegisterPage(driver);
    }
    public LoginPage clickOnLogin(){
        onLink("//a[@class='ico-login']").click();
        return new LoginPage(driver);
    }
    public String getLogoutText(){
        return driver.findElement(logoutText).getText();
    }



    
}
