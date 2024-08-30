package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestAccount");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Teste");
		//No.Of Employee
		driver.findElement(By.id("numberEmployees")).sendKeys("30");
		//Site Name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String Title= driver.getTitle();
		System.out.println("Title is"+Title);
		
	
	}

}
