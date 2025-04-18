package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		Select dropdown1=new Select(industryElement);
		dropdown1.selectByValue("IND_SOFTWARE");
		WebElement ownerElement = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2=new Select(ownerElement);
		dropdown2.selectByVisibleText("S-Corporation");
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select dropdown3=new Select(sourceElement);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketElement = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4=new Select(marketElement);
		dropdown4.selectByIndex(6);
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5=new Select(stateElement);
		dropdown5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.quit();
	}

}
