package shoppingCart;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestPrueba {

    @Test
    public void sampleTestMethod() {
        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open().loginAs("username", "password");
        // TODO
    }

}
