import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/**
 * Created by user on 2017/6/29.
 */

public class SeleniumChromeTest {
    public static WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("before Method");
    }

    @Test
    public void f() {

        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        //System.setProperty("webdriver.chrome.driver","D:\\tools\\browers-drivers\\chromedriver.exe");

        //定义驱动对象为 FirefoxDriver 对象
        // WebDriver driver = new ChromeDriver();
        //driver = new ChromeDriver();


        //驱动的网址
        driver.get("http://www.baidu.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //浏览器窗口变大
        driver.manage().window().maximize();

        //定位输入框元素
        WebElement txtbox = driver.findElement(By.name("wd"));

        //在输入框输入文本
        txtbox.sendKeys("HelloWorld");

        //定位按钮元素
        WebElement btn = driver.findElement(By.id("su"));

        //点击按钮
        btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //关闭驱动
        // driver.close();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Page title is:" + driver.getTitle());
        driver.quit();
    }
}


