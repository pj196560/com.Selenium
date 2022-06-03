package com.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
         
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");  
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("pratik");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.name("lastname")).sendKeys(" Nandkishor jadhav");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_email__")).sendKeys("pj196560@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pj196560@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pratik@123");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement day1 = driver.findElement(By.id("day"));
		Select oselect = new Select(day1);
		Thread.sleep(3000);
		oselect.selectByValue("17");
		
		
		  WebElement month = driver.findElement(By.id("month"));
		  Select dismiss = new Select(month);
		  Thread.sleep(3000);
		  dismiss.selectByVisibleText("Jun");
		 

		WebElement year1 = driver.findElement(By.id("year"));
		Select year_1 = new Select(year1);
		Thread.sleep(3000);
		year_1.selectByValue("1996");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("websubmit")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

}
