import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumtest {

    WebDriver Driver = new ChromeDriver();

    @BeforeClass
    public void setup(){
        Driver.get("https://www.letskodeit.com/login");
        Driver.manage().window().maximize();

    }

    @Test
    public void testlogin() throws InterruptedException {
        Driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Driver.findElement(By.id("login-password")).sendKeys("abcabc");
        Driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
    }
    @Test
    public void test2(){
        System.out.println("I am from test2 Method");
    }

    @Test
    public void test3(){
        System.out.println("I am from test3 Method");
    }
    @AfterTest
    public void teardown(){
        System.out .println("I am from After test");

    }
}
