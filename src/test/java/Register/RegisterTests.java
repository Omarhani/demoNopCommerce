package Register;

import Base.BaseTests;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class RegisterTests extends BaseTests {

    private String firstName = "Omar";
    private String lastName = "Hany";
    private String companyName = "upWork";

    private String userDay = "2";
    private String userMonth = "April";
    private String userYear = "1997";

    @Test(priority = 2)
    public void register() throws IOException {
        var registerPage = homePage.clickOnRegister();
        registerPage.clickOnGenderMale();
        registerPage.setFirstName(firstName);
        registerPage.setLastName(lastName);
        registerPage.setSelectDay(userDay);
        registerPage.setSelectMonth(userMonth);
        registerPage.setSelectYear(userYear);
        registerPage.setEmail(email);
        registerPage.setCompanyName(companyName);
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(password);
        registerPage.clickOnRegisterButton();
        assertEquals(registerPage.getConfirmText(),"Your registration completed");


    }
}
