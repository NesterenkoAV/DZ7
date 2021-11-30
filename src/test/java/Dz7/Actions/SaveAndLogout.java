package Dz7.Actions;

import Dz7.Pages.OtusTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveAndLogout extends BasePage {

    public SaveAndLogout(WebDriver driver) {
        super(driver);
    }

    private By SaveAndContinue = By.cssSelector("button[title='Сохранить и продолжить']");
    private By UserName = By.cssSelector("div[class*='item-wrapper__username']");
    private By Exit = By.cssSelector("a[title='Выход']");

    public void clickSaveAndContinue() {
        driver.findElement(SaveAndContinue).click();
    }

    public void clickLogout() {
        driver.findElement(UserName).click();
        driver.findElement(Exit).click();
    }

}
