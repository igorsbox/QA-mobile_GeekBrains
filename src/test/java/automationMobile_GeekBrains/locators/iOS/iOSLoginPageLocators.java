package automationMobile_GeekBrains.locators.iOS;

import automationMobile_GeekBrains.locators.interfaces.LoginPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class iOSLoginPageLocators implements LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }

    public By signUpForm() {

        return MobileBy.AccessibilityId("button-sign-up-container");
    }

    public By emailField() {
        return MobileBy.AccessibilityId("input-email");
    }

    public By passwordField() {
        return MobileBy.AccessibilityId("input-password");
    }

    public By repeatPasswordField() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

    public By signUpButton() {
        return MobileBy.AccessibilityId("button-SIGN UP");
    }

    public By errorSamePassword() {
        return MobileBy.xpath("//android.widget" +
                ".ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]");
    }
    public By homeScreen() {
        return MobileBy.AccessibilityId("Login-screen");
    }
}

