package automationMobile_GeekBrains;

import automationMobile_GeekBrains.base.BaseTest;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;


import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenShotHelper extends BaseTest {

    @Test
    public void createScreen() {
        openApp("pixel 11");
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }
}

