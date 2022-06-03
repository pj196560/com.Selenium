package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");  
		driver.manage().window().maximize();
		WebElement day1 = driver.findElement(By.id("day"));
		Select oselect = new Select(day1);
		Thread.sleep(3000);
		oselect.selectByIndex(19);
		
		WebElement month1 = driver.findElement(By.id("month"));
		Select dismiss = new Select(month1);
		Thread.sleep(3000);
		dismiss.deselectByVisibleText("Des");
		

		WebElement year1 = driver.findElement(By.id("year"));
		Select year_1 = new Select(year1);
		Thread.sleep(3000);
		year_1.selectByValue("1975");
		
		

	}

}
