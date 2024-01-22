package Calisma_2_Locater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.amazon.de/");
        WebElement arKutu=driver.findElement(By.id("twotabsearchtextbox"));

        arKutu.sendKeys("Nutella");
        arKutu.submit();

        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='sg-col-inner'"));

        System.out.println(sonucYaziElementi.getText());
driver.quit();

    }
}
