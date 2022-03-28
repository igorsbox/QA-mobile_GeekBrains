package automationMobile_GeekBrains.pages;

import automationMobile_GeekBrains.locators.LoginPageLocators;
import com.codeborne.selenide.Condition;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Кликаем по вкладку Sign Up")
    public LoginPage clickSignUpForm() {
        $(locator().signUpForm()).click();
        return new LoginPage();
    }

    @Step("Заполняем поле Email")
    public LoginPage fillEmail(String email) {
        $(locator().emailField()).sendKeys(email);
        return new LoginPage();
    }

    @Step("Заполняем поле Пароль")
    public LoginPage fillPassword(String password) {
        $(locator().passwordField()).sendKeys(password);
        return new LoginPage();
    }

    @Step("Заполняем поле Повторить пароль")
    public LoginPage fillRepeatPassword(String repeatPassword) {
        $(locator().repeatPasswordField()).sendKeys(repeatPassword);
        return new LoginPage();
    }

    @Step("Кликаем на кнопку SIGN UP")
    public LoginPage clickSignUpButton() {
        $(locator().signUpButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки при вводе повторного пароля")
    public LoginPage checkSamePasswordErrorText(String textError) {
        $(locator().errorSamePassword()).shouldHave(Condition.text(textError));
        return new LoginPage();
    }
    @Step("Делаем скриншот Sign Up страницы и сравниваем с требованием.")
    public LoginPage checkScreenshot() {
        // Загружаем ожидаемое изображения для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/LoginForm_Screenshot.png");
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_CheckSignUpPageScreenshot.png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }
}
