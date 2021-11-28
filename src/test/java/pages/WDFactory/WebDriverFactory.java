package pages.WDFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class WebDriverFactory {

    private static WebDriver driver;

//    protected static final String BROWSER = System.getProperty("BROWSER", "chrome");


    //Настройка ВебДрайвера

    public static WebDriver create(Browsers BROWSER) {
        if (BROWSER != null) {
            switch (BROWSER) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case Edge:
                    WebDriverManager.edgedriver();
                    driver = new EdgeDriver();
                    break;
            }
        } else {
            System.out.println("Incorrect browser");
          }

        return driver;

    }
}
