package com.nopCommerce.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {

    private WebDriver driver;
    Select select ;
    private By firstName = By.xpath("//input[@id='FirstName']");
    private By lastName = By.xpath("//input[@id='LastName']");
    private By email = By.xpath("//input[@id='Email']");
    private By company = By.xpath("//input[@id='Company']");
    private By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By password = By.xpath("//input[@id='Password']");
    private By registerButton = By.xpath("//button[@id='register-button']");
    private By genderMale  = By.xpath("//input[@id='gender-male']");
    private By selectDay  = By.xpath("//select[@name='DateOfBirthDay']");
    private By selectMonth  = By.xpath("//select[@name='DateOfBirthMonth']");
    private By selectYear  = By.xpath("//select[@name='DateOfBirthYear']");
    private By confirmText = By.xpath("//div[@class='result']");



    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSelectDay(String day){
        select = new Select(driver.findElement(selectDay));
        select.selectByVisibleText(day);
    }
    public void setSelectMonth(String month){
        select = new Select(driver.findElement(selectMonth));
        select.selectByVisibleText(month);
    }
    public void setSelectYear(String year){
        select = new Select(driver.findElement(selectYear));
        select.selectByVisibleText(year);
    }
    public String getConfirmText(){
        return driver.findElement(confirmText).getText();
    }

    public void setFirstName(String Name){
        driver.findElement(firstName).sendKeys(Name);
    }
    public void setLastName(String Name){
        driver.findElement(lastName).sendKeys(Name);
    }
    public void setEmail(String Email){
        driver.findElement(email).sendKeys(Email);
    }
    public void setCompanyName(String Company){
        driver.findElement(company).sendKeys(Company);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public void setConfirmPassword(String Password){
        driver.findElement(confirmPassword).sendKeys(Password);
    }
    public void clickOnRegisterButton(){
        driver.findElement(registerButton).click();
    }
    public void clickOnGenderMale(){
        driver.findElement(genderMale).click();
    }





}
