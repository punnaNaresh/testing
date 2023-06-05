package my student;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Student
{
	public WebDriver driver;
  @Test
  public void CreateAccount()
  {
	  driver.findElement(By.id("firstName")).sendKeys("punna");
	  driver.findElement(By.id("lastName")).sendKeys("naresh");
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  diver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() 
  {
	  
	  
  }
  public static void main(String[] args) 
  {
	Student s=new Student();
	s.CreateAccount();
	s.beforeTest();
	  s.afterTest();
}

}
