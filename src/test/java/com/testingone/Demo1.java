package com.testingone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	WebDriver driver;

@Test
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver133.exe");
		
		driver = new ChromeDriver();
		driver.get("https://scopex.money/Login");
		driver.manage().window().maximize();
		driver.findElement(By.id(":r3:-form-item")).sendKeys("sanjaykmahanta28@gmail.com");
		driver.findElement(By.id(":r4:-form-item")).sendKeys("Sanjay@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Recipients']")).click();
		driver.findElement(By.xpath("((//button[@type='button'])[3]//following::li//a)[2]")).click();
	}
	
}
	
