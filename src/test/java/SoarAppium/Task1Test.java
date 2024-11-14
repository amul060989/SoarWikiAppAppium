package SoarAppium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class Task1Test extends Base
{
    @Test
    public void Task1() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("My lists"));
        Thread.sleep(3);
        driver.findElement(AppiumBy.accessibilityId("History"));
        Thread.sleep(3);
        driver.findElement(AppiumBy.accessibilityId("Nearby"));
        Thread.sleep(3);
        driver.findElement(AppiumBy.accessibilityId("Explore")).click();

    }


}
