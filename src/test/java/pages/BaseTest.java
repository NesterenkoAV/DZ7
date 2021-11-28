package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.WDFactory.Browsers;
import pages.WDFactory.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    private final Logger logger =
            LogManager.getLogger(Logger.class);


    @Before
    public void setUp() {
        //Настройка ВебДрайвера
        String browserName = System.getProperty("browser").trim().toLowerCase();
        Browsers Name = Browsers.fetchValue(browserName);
        driver = WebDriverFactory.create(Name);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Драйвер поднят");
    }

    @After
    public void cleanUP() {
        driver.quit();
    }
}