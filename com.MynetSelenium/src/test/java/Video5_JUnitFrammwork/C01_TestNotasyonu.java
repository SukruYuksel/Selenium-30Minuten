package Video5_JUnitFrammwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    //@Test notasyonu olmayan methodlar bügüne  kadar yaptigimiz gibi sadece cagrildiklarinda gleiyorlardi
    //Ancak @Test ekledigimizde bagimsiz bir sekilde calisabilir hale geliyor.

    @Test
    public void test01() {
        //Ayarlari yapalim
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https:www.amazon.com sayfasina gidin
        driver.get("https://www.amazon.com/");

        //Arama Kutusuna Nutella yazin
        WebElement aramKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramKutusu.sendKeys("Nutella");
        //Nutella yazildiktan sonra Entera basarak arama islemini yapin
        WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
        submit.click();

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(sonucYaziElementi.getText());
        driver.close();
    }
}
