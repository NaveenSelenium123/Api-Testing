package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium jar march2022--for git project\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	System.out.println(title);
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("selenium");
		Actions a =new Actions(driver);
		a.doubleClick(txtEmail).perform();
		a.contextClick(txtEmail).perform();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
}
}
