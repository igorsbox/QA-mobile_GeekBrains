package automationMobile_GeekBrains.locators.Android;

import automationMobile_GeekBrains.locators.interfaces.MainPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}

