package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddPersonalDateArea extends BasePage {

    public AddPersonalDateArea(WebDriver driver) {
        super(driver);
    }

    private By Name = By.cssSelector("input[id='id_fname']");
    private By Surname = By.cssSelector("input[id='id_lname']");
    private By BlogName = By.cssSelector("input[id='id_blog_name']");
    private By LatinName = By.cssSelector("input[id='id_fname_latin']");
    private By LatinSurname = By.cssSelector("input[id='id_lname_latin']");
    private By BirthDate = By.cssSelector("input[name='date_of_birth']");


    public void addName(String name) {
        driver.findElement(Name).clear();
        driver.findElement(Name).sendKeys(name);
    }

    public void addSurname(String surname) {
        driver.findElement(Surname).clear();
        driver.findElement(Surname).sendKeys(surname);
    }

    public void addBlogName(String blogName) {
        driver.findElement(BlogName).sendKeys(blogName);
    }

    public void addLatinName(String latinName) {
        driver.findElement(LatinName).sendKeys(latinName);
    }

    public void addLatinSurname(String latinSurname) {
        driver.findElement(LatinSurname).sendKeys(latinSurname);
    }

    public void addBirthDate() {
        driver.findElement(BirthDate).sendKeys("06.09.1985" + Keys.ENTER);
    }
}
