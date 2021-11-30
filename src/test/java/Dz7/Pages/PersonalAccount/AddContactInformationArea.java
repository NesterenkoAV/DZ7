package Dz7.Pages.PersonalAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Dz7.Pages.OtusTest.BasePage;

public class AddContactInformationArea extends BasePage {

    public AddContactInformationArea(WebDriver driver) {
        super(driver);
    }

    private By CommunicationMethod1 = By.cssSelector("input[name='contact-0-service'] + div");
    private By Telegram = By.cssSelector("button[data-value='telegram']");
    private By Contact1Number = By.cssSelector("input[id='id_contact-0-value']");
    private By AddButton = By.cssSelector("button[class*='js-lk-cv-custom-select-add']");
    private By CommunicationMethod2 = By.cssSelector("input[name='contact-1-service'] + div");
    private By WhatsAPP = By.cssSelector("div[data-num='1']>div>div>div>div>div>div>button+button+button+button+button+button+button+button");
    private By Contact2Number = By.cssSelector("input[id='id_contact-1-value']");
    private By Gender = By.cssSelector("select[id='id_gender']");
    private By GenderValue = By.cssSelector("option[value='m']");
    private By Appointment = By.cssSelector("input[id='id_work']");
    private By Company = By.cssSelector("input[id='id_company']");

    public void addCommunicationMethod1(String number) {
        driver.findElement(CommunicationMethod1).click();
        driver.findElement(Telegram).click();
        driver.findElement(Contact1Number).sendKeys(number);
    }

    public void AddButtonClick() {
        driver.findElement(AddButton).click();
    }

    public void addCommunicationMethod2(String number2) {
        driver.findElement(CommunicationMethod2).click();
        driver.findElement(WhatsAPP).click();
        driver.findElement(Contact2Number).sendKeys(number2);
    }

    public void addMGender() {
        driver.findElement(Gender).click();
        driver.findElement(GenderValue).click();
    }

    public void addAppointment(String appointment) {
        driver.findElement(Appointment).sendKeys(appointment);
    }

    public void addCompany(String company) {
        driver.findElement(Company).sendKeys(company);
    }


}
