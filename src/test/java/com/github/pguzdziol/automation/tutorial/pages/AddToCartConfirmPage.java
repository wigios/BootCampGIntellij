package com.github.pguzdziol.automation.tutorial.pages;

import com.github.pguzdziol.automation.tutorial.components.NavigationMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartConfirmPage {
    private static final By CONFIRM_TEXT_FIELD = By.id("confirm-text");
    private final NavigationMenu navigationMenu;
    private WebDriver driver;

    public AddToCartConfirmPage(WebDriver driver) {
        this.driver = driver;
        this.navigationMenu = new NavigationMenu(driver);
    }

    public String getConfirmationText() {
        return driver.findElement(CONFIRM_TEXT_FIELD)
                .getText();
    }

    public NavigationMenu navigationMenu() {
        return navigationMenu;
    }
}
