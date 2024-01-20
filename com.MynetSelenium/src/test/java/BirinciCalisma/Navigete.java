package BirinciCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigete {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //1-  driver.get()--> isrenilen url e gider.
        //1-  driver.navigate().to() ---> ayni islemi yapar.
        driver.get("https://www.amazon.com");//Ayni islemi yaparlar.
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        //2- driver.navigate().back()--> bir önceki sayfaya dönüs yapar.
        driver.navigate().back();
        Thread.sleep(2000);
        //3-  driver.navigate().forward()--> back ile geldigi sayfaya yeniden gider.
        driver.navigate().forward();
        Thread.sleep(2000);
        //4-  driver.navigate().refresh()--> icinde oldugu sayfayi yeniler
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();//Acik olan sayfa kapanir
      //  driver.quit();//burda acik olan bütün sayfalar kapanir
    }
}
