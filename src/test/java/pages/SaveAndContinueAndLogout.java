package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveAndContinueAndLogout extends BasePage {

    public SaveAndContinueAndLogout(WebDriver driver) {
        super(driver);
    }

    private By SaveAndContinue = By.cssSelector("button[title='Сохранить и продолжить']");
    private By UserName = By.cssSelector("div[class*='item-wrapper__username']");
    private By Exit = By.cssSelector("a[title='Выход']");

    public void ClickSaveAndContinue() {
        driver.findElement(SaveAndContinue).click();
    }

    public void ClickLogout() {
        driver.findElement(UserName).click();
        driver.findElement(Exit).click();
    }

}
