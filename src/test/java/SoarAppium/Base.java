package SoarAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class Base {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configureAppium() throws URISyntaxException, MalformedURLException {
        //Can be made configurable hard coding to save time.
        service = new AppiumServiceBuilder().withAppiumJS(new File("//Users//amulyaverma//node_modules" +
                "//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("WikiTesting");
        options.setApp("src//test//java//resources//WikipediaSample.apk");
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    public void longPressAction(WebElement element)
//    {
//        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element).getId(),"duration",2000
//        ));
//    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
        service.stop();
    }
}
