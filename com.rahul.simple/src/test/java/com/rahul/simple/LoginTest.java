package com.rahul.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	
@Test
	public void testLogin()
	{
		login();
		
		WebElement x1 = driver.findElement(By.id("draga"));
		WebElement x2 = driver.findElement(By.id("dragb"));
		Actions act=new Actions(driver);
		
		act.dragAndDrop(x1,x2).release();
		
	}

}
