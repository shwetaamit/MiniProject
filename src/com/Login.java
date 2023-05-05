package com;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.TakesScreenshot;

public class Login {

	WebDriver driver;

	@BeforeMethod

	public void setUp() throws IOException  

	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\User\\Selenium Screensht\\screenshot1.png"));


	}

	@Test

	public void verifyTitle()

	{

		String actualTitle = driver.getTitle();

		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test

	public void verifyLogo() throws IOException

	{

		boolean flag = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();

		Assert.assertTrue(flag);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("C:\\Users\\User\\Selenium Screensht\\screenshot3.png"));


	}

	@Test
	public void searchItem() throws IOException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");

		driver.findElement(By.xpath("(//input[@id='nav-search-submit-button'])[1]")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("C:\\Users\\User\\Selenium Screensht\\screenshot2.png"));

		
	}

	@AfterMethod

	public void tearDown()

	{

		driver.quit();

	}

}
