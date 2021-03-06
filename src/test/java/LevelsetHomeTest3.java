import Actions.BrowserActions;
import Actions.BrowserActions3;
import POM.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class LevelsetHomeTest3 {
    Home3 home;

    BrowserActions3 BrowserActions;

    @BeforeTest
    void setup() {
        BrowserActions = new BrowserActions3();
        BrowserActions.initializeTheWebDriver("Chrome");
        BrowserActions.maximizeScreen();
        home = new Home3();

    }

    @AfterTest
    void teardown() {
        BrowserActions.closeDriver();
    }
    @Parameters


    @Test
    void test1() {
        home.navigateToHome();
        home.pressCreateDocument();

    }
    @Test
    @Parameters({"browser"})
    void parametersTest(String browser){
        System.out.println(browser);

    }


    @Test
    void testFluentPOM(){

            home.navigateToHome_FluentPOM()
                    .pressCreateDocument_FluentPOM()
                    .navigateToHome_FluentPOM()
                    .pressCreateDocument_FluentPOM()
                    .navigateToHome_FluentPOM();

        }
    }
