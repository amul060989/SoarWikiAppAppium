package SoarAppium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2Test extends Base {

    @Test
    public void Task2()
    {
        driver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("New York");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertNotNull(driver.findElement(By.className("android.view.View")));
        driver.findElement(AppiumBy.accessibilityId("Clear query")).click();
        driver.findElement(By.className("android.widget.ImageButton"));
        Assert.assertTrue(driver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).isDisplayed());
    }



}
