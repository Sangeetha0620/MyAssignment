package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sangeetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Govindaraj");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sangee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("LLAMA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Java Project");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("s@gmail.com");
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown=new Select(province);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Sample Lead");
		driver.findElement(By.name("submitButton")).click();
		String titleOfPage = driver.getTitle();
		driver.quit();
	}

}
