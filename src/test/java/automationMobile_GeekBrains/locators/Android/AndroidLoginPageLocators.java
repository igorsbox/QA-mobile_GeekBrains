package automationMobile_GeekBrains.locators.Android;

import automationMobile_GeekBrains.locators.interfaces.LoginPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return  MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }

    @Override
    public By signUpForm() {
        return MobileBy.AccessibilityId("button-sign-up-container");
    }
    @Override
    public By emailField() {
        return MobileBy.AccessibilityId("input-email");
    }

    @Override
    public By passwordField() {
        return MobileBy.AccessibilityId("input-password");
    }

    @Override
    public By repeatPasswordField() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

    @Override
    public By signUpButton() {
        return MobileBy.AccessibilityId("button-SIGN UP");
    }

    @Override
    public By errorSamePassword() {
        return MobileBy.xpath("//android.widget" +
                ".ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]");
    }
    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Login-screen");
    }
}

