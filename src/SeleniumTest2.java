import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/lizabogatyrev/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.actitime.com");
        WebElement trybutton = driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]/div/a"));
        trybutton.click();
        driver.findElement(By.id("first-name")).sendKeys("Liza");
        driver.findElement(By.id("last-name")).sendKeys("Bogatyrev");
        driver.findElement(By.id("email")).sendKeys("example@example.com");
        driver.findElement(By.id("company")).sendKeys("LTU");


    }
}
