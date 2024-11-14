package SoarAppium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task3Test extends Base {

    @Test
    public void Task3() throws InterruptedException {
        driver.findElement(By.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(By.id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//android.widget.Switch[@resource-id='org.wikipedia.alpha:id/switchWidget']"));

        for(WebElement element: elements)
        {
            element.click();
        }

        Thread.sleep(3);

        driver.findElement(AppiumBy.accessibilityId("Navigate up"));
    }
}
