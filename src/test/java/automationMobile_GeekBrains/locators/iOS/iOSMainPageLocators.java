package automationMobile_GeekBrains.locators.iOS;

import automationMobile_GeekBrains.locators.interfaces.MainPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class iOSMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}

