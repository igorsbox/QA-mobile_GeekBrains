package automationMobile_GeekBrains.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Login-screen");
    }

    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
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

}
