package automationMobile_GeekBrains.tests;

import automationMobile_GeekBrains.base.BaseTest;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Description;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class AutoTest_GB extends BaseTest {

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void checkEmptyEmail() {

//        // Устанавливаем capabilities.
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel");
//        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
////      Проверьте актуальность пути до приложения на своём компьютере.
//        capabilities.setCapability("app",
//                "C:/GeekBrains/Автоматизация тестирования мобильных приложений/Android-NativeDemoApp-0.2.1.apk");
//        MobileDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        Thread.sleep(2000);
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
//        loginMenuButton.click();
//        Thread.sleep(2000);
////      Нажимаем Login на странице логин/пароль.
//        MobileElement loginButton = (MobileElement) driver.findElementByAccessibilityId("button-LOGIN");
//        loginButton.click();
//        Thread.sleep(2000);
////      Проверяем текст ошибки.
//        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget" +
//                ".ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
//        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText("Please enter a valid email address");
    }

//    @Test
//    public void checkValidEmailSignUp() throws Exception {
//
//        // Устанавливаем capabilities.
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel");
//        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
////      Проверьте актуальность пути до приложения на своём компьютере.
//        capabilities.setCapability("app",
//                "C:/GeekBrains/Автоматизация тестирования мобильных приложений/Android-NativeDemoApp-0.2.1.apk");
//        MobileDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        Thread.sleep(2000);
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
//        loginMenuButton.click();
//        Thread.sleep(2000);
//        MobileElement signUpButton = (MobileElement) driver.findElementByAccessibilityId("button-sign-up-container");
//        signUpButton.click();
//        MobileElement fillEmail = (MobileElement) driver.findElementByAccessibilityId("input-email");
//        fillEmail.sendKeys("123@1.ru");
//        Thread.sleep(2000);
////      Нажимаем Sign Up на странице Регистрация.
//        MobileElement signUpButton2 = (MobileElement) driver.findElementByAccessibilityId("button-SIGN UP");
//        signUpButton2.click();
//        Thread.sleep(2000);
////      Проверяем текст ошибки.
//        MobileElement errorText2 = (MobileElement) driver.findElementByXPath("//android.widget" +
//                ".ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
//        Assert.assertEquals(errorText2.getText(), "");
//    }
//
//    @Test
//    public void checkTheSamePasswordSignUp() throws Exception {
//
//        // Устанавливаем capabilities.
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel");
//        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
////      Проверьте актуальность пути до приложения на своём компьютере.
//        capabilities.setCapability("app",
//                "C:/GeekBrains/Автоматизация тестирования мобильных приложений/Android-NativeDemoApp-0.2.1.apk");
//        MobileDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        Thread.sleep(2000);
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
//        loginMenuButton.click();
//        Thread.sleep(2000);
//        MobileElement signUpButton = (MobileElement) driver.findElementByAccessibilityId("button-sign-up-container");
//        signUpButton.click();
//        MobileElement fillEmail = (MobileElement) driver.findElementByAccessibilityId("input-email");
//        fillEmail.sendKeys("123@1.ru");
//        MobileElement fillPassword = (MobileElement) driver.findElementByAccessibilityId("input-password");
//        fillPassword.sendKeys("12345678");
//        MobileElement fillRepeatPassword = (MobileElement) driver.findElementByAccessibilityId("input-repeat-password");
//        fillRepeatPassword.sendKeys("1234567");
//        Thread.sleep(2000);
////      Нажимаем Sign Up на странице Регистрация.
//        MobileElement signUpButton2 = (MobileElement) driver.findElementByAccessibilityId("button-SIGN UP");
//        signUpButton2.click();
//        Thread.sleep(2000);
////      Проверяем текст ошибки.
//        MobileElement errorText3 = (MobileElement) driver.findElementByXPath("//android.widget" +
//                ".ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[3]");
//        Assert.assertEquals(errorText3.getText(), "Please enter the same password");
//    }

}
