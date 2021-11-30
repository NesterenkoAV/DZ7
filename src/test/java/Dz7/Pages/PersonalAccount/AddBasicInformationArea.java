package Dz7.Pages.PersonalAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Dz7.Pages.OtusTest.BasePage;

public class AddBasicInformationArea extends BasePage {

    public AddBasicInformationArea(WebDriver driver) {
        super(driver);
    }

    private By Country = By.cssSelector("input[name='country'] + div");
    private By CountryValue = By.cssSelector("button[title='Россия']");
    private By EnglishLevel = By.cssSelector("input[data-title='Уровень знания английского языка'] + div");
    private By EnglishLevelValue = By.cssSelector("button[title='Средний (Intermediate)']");
    private By ReadyToRelocate = By.cssSelector("input[id='id_ready_to_relocate_1']+ span");
    private By WorkFormat = By.cssSelector("input[title='Гибкий график'] + span");
    private By City = By.cssSelector("input[data-title='Город'] + div");
    private By CityValue = By.cssSelector("button[title='Анапа']");


    public void addCountry() {
        driver.findElement(Country).click();
        driver.findElement(CountryValue).click();
    }

    public void addEnglishLevel() {
        driver.findElement(EnglishLevel).click();
        driver.findElement(EnglishLevelValue).click();
    }

    public void addReadyToRelocate() {
        driver.findElement(ReadyToRelocate).click();
    }

    public void addWorkFormat() {
        driver.findElement(WorkFormat).click();
    }

    public void addCity() {
        driver.findElement(City).click();
        driver.findElement(CityValue).click();
    }
}
