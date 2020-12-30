package com.epam.ta.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends AbstractPageWithStaticUrl {

    @FindBy(id = "profile-password-link")
    private WebElement profileButton;

    @FindBy(xpath = "//div[@class='sub-nav-menu-container-v3']/ul/li[2]")
    private WebElement toDeliveryAdressesButton;

    public AccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public AccountPage openPage() {
        driver.get("https://www.walmart.com/account/");
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public DeliveryAdressesPage openDeliveryAdressesPage() {
        toDeliveryAdressesButton.click();
        return new DeliveryAdressesPage(driver);

    }
}
