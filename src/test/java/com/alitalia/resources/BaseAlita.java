package com.alitalia.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseAlita {
 protected static WebDriver driver;
 public void   getDriver() {
	System.setProperty("Webdriver.Chrome.driver", "D:\\software\\eclipse\\sudharsan\\Alitalia\\src\\test\\resources\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
public  void geturl (String url) {
	driver.get(url);
	
	
}
public  void click (WebElement btn) {
	btn.click();
	
}
public  void enter(WebElement element,String val) {
	element.sendKeys(val);
}
	
	
	
}

