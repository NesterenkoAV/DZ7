package Dz7.Actions;

import Dz7.Pages.OtusTest.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClearAttributeValues extends BasePage {

    public ClearAttributeValues(WebDriver driver) {

        super(driver);
    }


    private By WorkFormat = By.cssSelector("input[title='Гибкий график'] + span");
    private By BlogName = By.cssSelector("input[id='id_blog_name']");
    private By LatinName = By.cssSelector("input[id='id_fname_latin']");
    private By LatinSurname = By.cssSelector("input[id='id_lname_latin']");
    private By BirthDate = By.cssSelector("input[name='date_of_birth']");
    private By CommunicationMethod1 = By.cssSelector("input[name='contact-0-service'] + div");
    private By CommunicationMethod = By.cssSelector("button[data-empty='Способ связи']");
    private By Contact1Number = By.cssSelector("input[id='id_contact-0-value']");
    private By Contact2Number = By.cssSelector("input[id='id_contact-1-value']");
    private By Appointment = By.cssSelector("input[id='id_work']");
    private By Company = By.cssSelector("input[id='id_company']");


    public void clearAttributeValues() {
        driver.findElement(WorkFormat).click();
        driver.findElement(BlogName).clear();
        driver.findElement(LatinName).clear();
        driver.findElement(LatinSurname).clear();
        driver.findElement(BirthDate).clear();
        driver.findElement(CommunicationMethod1).click();
        driver.findElement(CommunicationMethod).click();
        driver.findElement(Contact1Number).clear();
        driver.findElement(Contact2Number).clear();
        driver.findElement(Appointment).clear();
        driver.findElement(Company).clear();
    }

}
