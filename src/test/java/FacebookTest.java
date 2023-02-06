import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FacebookRegistrationPage;

//        ./gradlew test --tests FacebookTest

public class FacebookTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void myTest() throws InterruptedException {
        FacebookRegistrationPage page = new FacebookRegistrationPage(driver);
        page.regButton.click();
        Thread.sleep(3000);
        page.firstName.sendKeys("Serega");
        page.lastName.sendKeys("Automashevkiy");
        page.email.sendKeys("380957778899");
        page.password.sendKeys("Privet@123");
        page.mount.sendKeys("Sep");
        page.day.sendKeys("15");
        page.year.sendKeys("1992");
        page.gendor.click();
        page.submit.submit();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
