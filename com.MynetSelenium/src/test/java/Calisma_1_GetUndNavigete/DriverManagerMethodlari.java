package Calisma_1_GetUndNavigete;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManagerMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bundan Sonraki bütün Testlerimizde problemle karsilasmamiz
        // icin bu iki alani 17 ve 18 kullanmaliyiz.


        //1- dirveer.manage().window() methodlari
        //1 A driver.manage().window().getSize();--> icinde oldugu sayfanin pixel olarak olculeini döndürür.
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());//(1051, 798) pixel
        System.out.println(driver.manage().window().getSize().height);//1051
        System.out.println(driver.manage().window().getSize().width);//798
        Thread.sleep(2000);

        //1 B  driver.manage().window().getPosition();--> icinde oldugu sayfanin pixel konumunu döndürür
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());//(9, 9)
        Thread.sleep(2000);

        //1 C  driver.manage().window().setPosition(new Point(15,15));;-->
        //icinde oldugu sayfanin sol alt kösesini bizim yazacagimiz pixel noktasina tasir.
        driver.manage().window().setPosition(new Point(30,48));
        Thread.sleep(2000);

        //1 D  driver.manage().window().setSize(new Dimension(900,600));-->
        //icinde oldugu sayfanin sol alt kösesini bizim yazacagimiz pixel olculere getirir.
        driver.manage().window().setSize(new Dimension(900,600));
        Thread.sleep(2000);

        //konumu ve boyutu yeniledikten sonra tekrar yazdirisak
        System.out.println("Yeni pencere ölcüleri"+driver.manage().window().getSize());
        System.out.println("Yeni pencere ölcüleri"+driver.manage().window().getPosition());
        Thread.sleep(2000);

        //1 E driver.manage().window().maximize();-->Icinde oldugu sayfayi maximize yapar.
        //1 F driver.manage().window().fullscreen();--> Icinde oldugu sayfayi fullscreen yapar.
        //icinde oldugu sayfanin sol alt kösesini bizim yazacagimiz pixel noktasina tasir.
        driver.manage().window().maximize();
        System.out.println("maximize konum "+driver.manage().window().getPosition());//(-8, -8)
        System.out.println("maximize boyut "+driver.manage().window().getSize());//(1552, 832)

        driver.manage().window().fullscreen();
        System.out.println("maximize konum "+driver.manage().window().getPosition());//(0, 0)
        System.out.println("maximize boyut "+driver.manage().window().getSize());//(1536, 864)

        //1 G driver.manage().window().minimize();--> Sayfayi simgedurumunda kücültür
        driver.manage().window().minimize();


        //2- driver.manage().timeouts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class icin yapmamiz gereken bir ayar oldugu icin burada kisaca deginelim
                implicitlyWait : driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
                                 bekleyecegi maximum sureyi belirtir.
                                 driver bu sure icerisinde sayfa yuklenir/web element bulunursa
                                 beklemeden calismaya devam eder.
                                 bu sure bittigi halde sayfa yuklenememis/webElement bulunamamissa
                                 exception vererek calismayi durdurur

                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir
                                         Yani driver'a ne kadar bekleyecegini soyler
                                         Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /* NOT :    Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                    driver.manage() method'larindan
                    maximize() ve implicitlyWait() method'larinin her test'te kullanilmasi
                    FAYDALI OLACAKTIR

         */

        driver.close();
    }
}
