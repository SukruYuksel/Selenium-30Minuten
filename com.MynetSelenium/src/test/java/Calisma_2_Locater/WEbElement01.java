package Calisma_2_Locater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WEbElement01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://facebook.com/");
        driver.findElement(By.xpath("//button[@title='Alle Cookies erlauben']")).click();

        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("fjfdjfkjgfdkdf");

        WebElement passwort = driver.findElement(By.xpath("//input[@id='pass']"));
        passwort.sendKeys("1235544855");

        driver.findElement(By.xpath("//button[@name='login']")).click();

        //Sonuc girilemedigini girmemiz lazim

        WebElement sonucElement = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedResult = "Die eingegebene E-Mail-Adresse oder Handynummer ist mit keinem Konto verknüpft. Konto finden und anmelden";
        String actualResult = "Die eingegebene E-Mail-Adresse oder Handynummer ist mit keinem Konto verknüpft. Konto finden und anmelden";

        if (expectedResult.equals(actualResult)) {
            System.out.println("Girlemedi Testi passed");
        } else System.out.println("Girilemedi Testi Failur");

        driver.quit();
    }


}
