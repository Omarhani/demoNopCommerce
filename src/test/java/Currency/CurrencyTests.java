package Currency;

import Base.BaseTests;

import org.testng.annotations.Test;

public class CurrencyTests extends BaseTests{

    private String currency = "Euro";

    @Test   (priority = 1)
    public void selectEuro(){
        homePage.selectCurrency(currency);
    }
}
