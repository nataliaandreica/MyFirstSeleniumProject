import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test

    public void loginTest() {

        driver.get("http://testfasttrackit.info/selenium-test/");

        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();


        driver.findElement(By.cssSelector("#email")).sendKeys("nataliaandreica@yahoo.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("Windows123");

        driver.findElement(By.cssSelector("#send2")).click();
        WebElement welcomeMessageElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        Assert.assertEquals(welcomeMessageElement.getText(), "Hello, Natalia Andreica!");
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}