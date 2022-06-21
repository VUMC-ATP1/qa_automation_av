package practice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BrowserTest {
    FirefoxDriver webDriver;

    public final String satUrl = "https://manjaro.org/";

    @BeforeMethod
    public void setUp() {
        webDriver = new FirefoxDriver();
    }

    @Test
    public void firefoxBrowserTest() {
        webDriver.get(satUrl);
        Assert.assertEquals(webDriver.getCurrentUrl(), satUrl);
        Assert.assertEquals(webDriver.getTitle(), "Manjaro");

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        webDriver.close();
    }
}
