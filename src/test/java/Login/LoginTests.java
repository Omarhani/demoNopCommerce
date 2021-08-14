package Login;

import Base.BaseTests;
import Register.RegisterTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {



    @Test(priority = 3)
    public void loginWithValidData(){
        var loginPage= homePage.clickOnLogin();

        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.pressOnLoginButton();
        assertEquals(homePage.getLogoutText(),"Log out");

    }
}
