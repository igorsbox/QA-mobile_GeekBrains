package automationMobile_GeekBrains.locators;

import automationMobile_GeekBrains.locators.Android.AndroidLoginPageLocators;
import automationMobile_GeekBrains.locators.Android.AndroidMainPageLocators;
import automationMobile_GeekBrains.locators.iOS.iOSLoginPageLocators;
import automationMobile_GeekBrains.locators.iOS.iOSMainPageLocators;
import automationMobile_GeekBrains.locators.interfaces.LoginPageLocators;
import automationMobile_GeekBrains.locators.interfaces.MainPageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();

}

