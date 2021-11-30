package Dz7.Pages.OtusTest;

import Dz7.Actions.ClearAttributeValues;
import Dz7.Actions.SaveAndLogout;
import Dz7.Pages.MainPage.OtusMainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import Dz7.Pages.LoginPage.LoginPage;
import Dz7.Pages.PersonalAccount.AddBasicInformationArea;
import Dz7.Pages.PersonalAccount.AddContactInformationArea;
import Dz7.Pages.PersonalAccount.AddOtherArea;
import Dz7.Pages.PersonalAccount.AddPersonalDateArea;


public class OtusPageObjectTest extends BaseTest {
    private Logger logger = LogManager.getLogger(Logger.class);


    @Test
    public void otusPageObjectTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openOtus();
        logger.info("Сайт открыт");
        loginPage.enterAndReg();
        logger.info("Авторизация завершена");

        OtusMainPage otusMainPage = new OtusMainPage(driver);
        otusMainPage.openPersonalAccount();
        logger.info("Открыт Личный кабинет");

        AddPersonalDateArea addPersonalDateArea = new AddPersonalDateArea(driver);
        addPersonalDateArea.addName("Алексей");
        addPersonalDateArea.addSurname("Нестеренко");
        addPersonalDateArea.addLatinName("Alexey");
        addPersonalDateArea.addLatinSurname("Nesterenko");
        addPersonalDateArea.addBlogName("Алексей");
        addPersonalDateArea.addBirthDate();
        logger.info("Заполнены атрибуты области 'Персональные данные'");

        AddBasicInformationArea addBasicInformationArea = new AddBasicInformationArea(driver);
        addBasicInformationArea.addCountry();
        addBasicInformationArea.addEnglishLevel();
        addBasicInformationArea.addWorkFormat();
        addBasicInformationArea.addReadyToRelocate();
        addBasicInformationArea.addCity();
        logger.info("Заполнены атрибуты области 'Основная информация'");


        AddContactInformationArea addContactInformationArea = new AddContactInformationArea(driver);
        addContactInformationArea.addCommunicationMethod1("1111111");
        addContactInformationArea.AddButtonClick();
        addContactInformationArea.addCommunicationMethod2("222222");
        logger.info("Заполнены атрибуты области 'Контактная информация'");

        AddOtherArea addOtherArea = new AddOtherArea(driver);
        addOtherArea.addMGender();
        addOtherArea.addCompany("Test");
        addOtherArea.addAppointment("тестировщик");
        logger.info("Заполнены атрибуты области 'Другое'");

        SaveAndLogout saveAndLogout = new SaveAndLogout(driver);
        saveAndLogout.clickSaveAndContinue();
        logger.info("Вышли из личного кабинета");
        saveAndLogout.clickLogout();

        loginPage.openOtus();
        logger.info("Сайт открыт");
        loginPage.enterAndReg();
        logger.info("Авторизация завершена");

        otusMainPage.openPersonalAccount();
        logger.info("Открыт Личный кабинет");

        ClearAttributeValues clearAttributeValues = new ClearAttributeValues(driver);
        clearAttributeValues.clearAttributeValues();
        logger.info("Значения атрибутов удалены");

        saveAndLogout.clickSaveAndContinue();
        logger.info("Вышли из личного кабинета");
        saveAndLogout.clickLogout();


    }

}
