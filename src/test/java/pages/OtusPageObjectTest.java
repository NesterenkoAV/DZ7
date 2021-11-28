package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class OtusPageObjectTest extends BaseTest {
    private Logger logger = LogManager.getLogger(Logger.class);


    @Test
    public void OtusPageObjectTest() throws InterruptedException {
        GoToUrlAndLogin goToUrlAndLogin = new GoToUrlAndLogin(driver);
        goToUrlAndLogin.openOtus();
        logger.info("Сайт открыт");
        goToUrlAndLogin.enterAndReg();
        logger.info("Авторизация завершена");

        GoToPersonalAccount goToPersonalAccount = new GoToPersonalAccount(driver);
        goToPersonalAccount.openPersonalAccount();
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

        SaveAndContinueAndLogout saveAndContinueAndLogout = new SaveAndContinueAndLogout(driver);
        saveAndContinueAndLogout.ClickSaveAndContinue();
        logger.info("Вышли из личного кабинета");
        saveAndContinueAndLogout.ClickLogout();

        goToUrlAndLogin.openOtus();
        logger.info("Сайт открыт");
        goToUrlAndLogin.enterAndReg();
        logger.info("Авторизация завершена");

        goToPersonalAccount.openPersonalAccount();
        logger.info("Открыт Личный кабинет");

        ClearAttributeValues clearAttributeValues = new ClearAttributeValues(driver);
        clearAttributeValues.clearAttributeValues();
        logger.info("Значения атрибутов удалены");

        saveAndContinueAndLogout.ClickSaveAndContinue();
        logger.info("Вышли из личного кабинета");
        saveAndContinueAndLogout.ClickLogout();


    }

}
