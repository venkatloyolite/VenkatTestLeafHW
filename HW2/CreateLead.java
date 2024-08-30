package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		WebElement CreateLeads = driver.findElement(By.linkText("Create Lead"));
		CreateLeads.click();
		Thread.sleep(100);
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("Test");
		WebElement FirstName= driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Try");
		WebElement LastName= driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Hard");
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDD = new Select(Source);
		SourceDD.selectByIndex(3);
		WebElement MarketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketingCampDD = new Select(MarketingCamp);
		MarketingCampDD.selectByVisibleText("Automobile");
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipDD = new Select(Ownership);
		OwnershipDD.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Title is" +title);
		//driver.close();

	}

}
