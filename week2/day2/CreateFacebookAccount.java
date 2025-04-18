package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Sangeetha");
        driver.findElement(By.name("lastname")).sendKeys("Munirathinam");
        WebElement dayElement = driver.findElement(By.id("day"));
        Select dropdown1 = new Select(dayElement);
        dropdown1.selectByValue("20");
        WebElement dateElement = driver.findElement(By.id("month"));
        Select dropdown2 = new Select(dateElement);
        dropdown2.selectByValue("6");
        WebElement yearElement = driver.findElement(By.id("year"));
        Select dropdown3 = new Select(yearElement);
        dropdown3.selectByValue("1995");
        driver.findElement(By.xpath(("//label[text()='Female']/input"))).click();
        driver.findElement(By.name("reg_email__")).sendKeys("sangeetha@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Sangee");
        }

}
