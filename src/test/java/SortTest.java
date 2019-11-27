import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void validSortTest(){
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > ul > li:nth-child(2) > a > img")).click();
      //  Select sortByElement = new Select(driver.findElement(By.cssSelector(".category-products > .toolbar [title='Sort By']")));
      //  sortByElement.selectByIndex(2);


    }
}
