package Student;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Form 
{
	public WebDriver driver;
	public void openurl() 
	{
		driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	public void StudentRegistrationForm() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("naresh");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("punna");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("punnan@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("9912345678");
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("June");
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1997");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys("English");
		Thread.sleep(1000);	
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		Thread.sleep(1000);
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\PUNNA\\Pictures\\Screenshots\\Screenshot (12).png");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("4-123,Vidya Nagar Colony,Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("NCR");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("Delhi");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
	}
public static void main(String[] args) throws Exception
{
	Form f=new Form();
	f.openurl();
	f.StudentRegistrationForm();
}
}
