import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)", "");

        WebElement eButton=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
        eButton.click();


        Thread.sleep(2000);

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,350)", "");


        WebElement wtButton=driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-3'] span[class='text']"));
        wtButton.click();

        WebElement addButton=driver.findElement(By.id("addNewRecordButton"));
        addButton.click();


        WebElement firstName=driver.findElement(By.cssSelector("#firstName"));
        firstName.click();
        firstName.sendKeys("Ebru");


        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Beskaya");

        WebElement eMail=driver.findElement(By.cssSelector("#userEmail"));
        eMail.click();
        eMail.sendKeys("ebru555@example.in");

        WebElement age=driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("26");

        WebElement salary=driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("10000");

        WebElement department=driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys("Information Technology");

        WebElement submitButton=driver.findElement(By.cssSelector("#submit"));
        submitButton.click();


        driver.quit();




    }  
}
