package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOtherArea extends BasePage {

    public AddOtherArea(WebDriver driver) {
        super(driver);
    }


    private By Gender = By.cssSelector("select[id='id_gender']");
    private By GenderValue = By.cssSelector("option[value='m']");
    private By Appointment = By.cssSelector("input[id='id_work']");
    private By Company = By.cssSelector("input[id='id_company']");


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
