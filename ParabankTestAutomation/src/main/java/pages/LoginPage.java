package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanici adi alani doldurulur")
    public LoginPage fillUsername(String text) {
        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("Password alani doldurulur")
    public LoginPage fillPassword(String text) {
        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }

    @Step("Login butonu tiklanir")
    public void clickLogin() {
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
    }

    @Step("Register linki tiklanir")
    public void clickRegister() {
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
    }
}
