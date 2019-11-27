import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test

    public void validRegisterTest(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();

        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();


        driver.findElement(By.cssSelector("#firstname")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
        driver.findElement(By.cssSelector("#middlename")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
        driver.findElement(By.cssSelector("#lastname")).sendKeys(RandomStringUtils.randomAlphanumeric(5));
        driver.findElement(By.cssSelector("#email_address")).sendKeys(RandomStringUtils.randomAlphanumeric(7)+"@testFasttrackIt.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345Wer");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345Wer");
        driver.findElement(By.cssSelector(".buttons-set .button")).click();

        WebElement welcomeMessageElement = driver.findElement(By.cssSelector(".dashboard h1"));
        Assert.assertEquals(welcomeMessageElement.getText(), "MY DASHBOARD");

    }
    @After
    public void closeDriver() {
        driver.quit();
    }

}

