package automationMobile_GeekBrains.tests.login;

import automationMobile_GeekBrains.base.BaseTest;
import automationMobile_GeekBrains.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckFailPassword extends BaseTest {

    @Test
    public void checkFailPasswords() {
        openApp("pixel 11")
                .clickLoginMenuButton()
                .clickSignUpForm()
                .fillEmail("123@1.ru")
                .fillPassword("12345678")
                .fillRepeatPassword("87654321")
                .clickSignUpButton()
                .checkSamePasswordErrorText("Please enter the same password");
    }


}
