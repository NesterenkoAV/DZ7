package Dz7.Pages.MainPage;

import Dz7.Pages.OtusTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtusMainPage extends BasePage {

    public OtusMainPage(WebDriver driver) {
        super(driver);
    }

    private By UserName = By.cssSelector("div[class*='item-wrapper__username']");
    private By Fio = By.xpath("//b[contains(text(), 'Алексей Нестеренко')]");

    public void openPersonalAccount() {
        driver.findElement(UserName).click();
        driver.findElement(Fio).click();
    }

}
