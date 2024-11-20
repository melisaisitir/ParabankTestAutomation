package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    @Step("Kullanici Kontrolu")
    public void accountControl(String value) {
        String text = driver.findElement(By.cssSelector("[class='smallText']")).getText();
        Assert.assertEquals(value, text);
    }

    @Step("Kullanici olusturma kontrolu")
    public void registerControl(String value) {
        String text = driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(value, text);
    }
}
