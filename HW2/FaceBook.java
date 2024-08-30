package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//- Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("FB");
		driver.findElement(By.name("reg_email__")).sendKeys("Venkat@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("PassWord@123");
		Thread.sleep(100);
		WebElement Date = driver.findElement(By.name("birthday_day"));
		Select DateDD = new Select(Date);
		DateDD.selectByIndex(15);
		WebElement Month  = driver.findElement(By.id("month"));
		Select MonthDD = new Select(Month);
		MonthDD.selectByValue("10");
		WebElement Year  = driver.findElement(By.id("year"));
		Select YearDD = new Select(Year);
		YearDD.selectByVisibleText("1989");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(200);
		
	}

}
