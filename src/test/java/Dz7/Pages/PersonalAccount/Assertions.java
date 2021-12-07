package Dz7.Pages.PersonalAccount;

import Dz7.Pages.OtusTest.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assertions extends BasePage {
    public Assertions(WebDriver driver) {
        super(driver);
    }

    public void checkEnteredValues() {
        // Проверяем корреткноть заполнения значений атрибутов
        Assert.assertEquals("Алексей", driver.findElement(By.id("id_fname")).getAttribute("value"));
        Assert.assertEquals("Нестеренко", driver.findElement(By.id("id_lname")).getAttribute("value"));
        Assert.assertEquals("Alexey", driver.findElement(By.id("id_fname_latin")).getAttribute("value"));
        Assert.assertEquals("Nesterenko", driver.findElement(By.id("id_lname_latin")).getAttribute("value"));
        Assert.assertEquals("06.09.1985", driver.findElement(By.cssSelector("input[name='date_of_birth']")).getAttribute("value"));
        Assert.assertEquals("Россия", driver.findElement(By.cssSelector("input[name='country']+div")).getText());
        Assert.assertEquals("Анапа", driver.findElement(By.cssSelector("input[data-title='Город']+div")).getText());
        Assert.assertEquals("Средний (Intermediate)", driver.findElement(By.cssSelector("input[data-title='Уровень знания английского языка']+div")).getText());
        Assert.assertTrue("Есть готовность к переезду", driver.findElement(By.cssSelector("input[id='id_ready_to_relocate_1']")).isSelected());
        Assert.assertTrue("Гибкий график", driver.findElement(By.cssSelector("input[title='Гибкий график']")).isSelected());
        Assert.assertEquals("1111111", driver.findElement(By.id("id_contact-0-value")).getAttribute("value"));
        Assert.assertEquals("222222", driver.findElement(By.id("id_contact-1-value")).getAttribute("value"));
        Assert.assertEquals("m", driver.findElement(By.id("id_gender")).getAttribute("value"));
        Assert.assertEquals("тестировщик", driver.findElement(By.id("id_work")).getAttribute("value"));
        Assert.assertEquals("тест", driver.findElement(By.id("id_company")).getAttribute("value"));
    }

}
