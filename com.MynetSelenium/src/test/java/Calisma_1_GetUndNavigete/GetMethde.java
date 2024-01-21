package Calisma_1_GetUndNavigete;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethde {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1- driver.getUrl--> Yazdigimiz url'e gider
        driver.get("https://amazon.com");
        Thread.sleep(2000);

        //2- driver.getTitle--> icinde oldugu sayfanin basligini döndürür
        System.out.println("Sayfa Title   '" + driver.getTitle() + " '");//Ya bir String Variable atammiz yada yazdirmamiz lazim
        System.out.println("=====================================================");
        //3- driver.getCurrentUrl()--> Url  döndürür
        String url = driver.getCurrentUrl();//burda bir Variable atama yaptik daha sonra asagida yazdirdik
        System.out.println(url);
        System.out.println("=====================================================");
        //4- driver.getPageSource()--> arka planda calisan sayfa kodlarini yazdirir--sayfa üzerinde iken Strg U yaparak sayfanin kaynak kodalarini görebiliriz.
        //  System.out.println("driver.getPageSource() = " + driver.getPageSource());


        //5- driver.getWindowHandle()--> acilan pencerinin hashCode sini yazdirir. Her acildiginda yenilenir.
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//A280DF74BB79D5EC96816EEF1CFAB3F6


    }
}
