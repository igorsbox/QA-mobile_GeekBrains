package automationMobile_GeekBrains.pages;

import automationMobile_GeekBrains.locators.LoginPageLocators;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

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
}
