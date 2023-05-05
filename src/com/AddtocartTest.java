package com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddtocartTest {
	  //public Webdriver driver;
	  public Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before 
	  public void setUp() {
	    Webdriver driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() throws InterruptedException {
	    ((Object) driver).wait();
	  }
	  @Test
	  public void addtocart() {
	    ((WebDriver) driver).get("https://www.amazon.in/");
	    driver.manage().window().setSize(new Dimension(1376, 744));
	    js.executeScript("window.scrollTo(0,0)");
	    {
	      WebElement element = driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner"));
	      Actions builder = new Actions((WebDriver) driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector("#nav-signin-tooltip .nav-action-inner")).click();
	    driver.findElement(By.id("ap_email")).sendKeys("sweetshweta.7july@gmail.com");
	    driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("Amit@2807");
	    driver.findElement(By.id("signInSubmit")).click();
	    js.executeScript("window.scrollTo(0,0)");
	    driver.findElement(By.id("twotabsearchtextbox")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("flowers");
	    driver.findElement(By.cssSelector("div:nth-child(2) > .s-suggestion-container .s-heavy")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("#p_90\\/6741118031 .a-icon"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector("#p_90\\/6741118031 .a-icon")).click();
	  }
	

