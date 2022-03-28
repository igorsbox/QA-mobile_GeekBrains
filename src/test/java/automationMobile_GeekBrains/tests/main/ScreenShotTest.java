package automationMobile_GeekBrains.tests.main;

import automationMobile_GeekBrains.base.BaseTest;
import automationMobile_GeekBrains.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class ScreenShotTest extends BaseTest {

    @Test
    public void checkMainPageScreen() {
        openApp("pixel 10")
                .checkScreenshot();
    }
}
