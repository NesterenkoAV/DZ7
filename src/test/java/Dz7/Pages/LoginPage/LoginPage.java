package Dz7.Pages.LoginPage;

import Dz7.Pages.OtusTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final String OTUS_URL = "https://otus.ru/";
    private By Enter = By.cssSelector("span[class*=header2__auth-reg]");
    private By Login = By.cssSelector("input[class*='js-email-input']");
    private By Password = By.cssSelector("input[class*='js-psw-input']");
    private By EnterButton = By.cssSelector("button[class*='new-button_md']");

    public void openOtus() {
        driver.get(OTUS_URL);
    }


    public void enterAndReg() {

        String login = System.getProperty("login");
        String password = System.getProperty("password");

        driver.findElement(Enter).click();
//        driver.findElement(Login).sendKeys("nesterenkoav996@gmail.com");
        driver.findElement(Login).sendKeys(login);
//        driver.findElement(Password).sendKeys("Q1w2e3r4");
        driver.findElement(Password).sendKeys(password);

        //нажатие на кнопку "Вход и регистрация"
        driver.findElement(EnterButton).click();
    }
}
