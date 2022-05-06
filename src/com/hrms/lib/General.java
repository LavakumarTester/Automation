package com.hrms.lib; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global {
// std rule ;To provide all re-usable functions/methods 
	// related to whole application 
	public void openApplication() {  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
	}
		public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		
	}	
		public void enterFrame () {
	driver.switchTo().frame(frame);		
	System.out.println("Entered into frame");
			}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from menu");
	}

public void addNewEmp() {
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
	driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
	driver.findElement(By.id(btn_Save)).click();
	System.out.println("New Employee Added");

}
public void EditEMP() {
	driver.findElement(By.name(btn_Edit)).click();
	System.out.println("Emp details cleared");
	driver.findElement(By.name(txt_EFN)).clear();
	driver.findElement(By.name(txt_EFN)).sendKeys(EFN1);
	driver.findElement(By.name(txt_ELN)).clear();
	driver.findElement(By.name(txt_ELN)).sendKeys(ELN1);
	driver.findElement(By.id(btn_Sve)).click();
	System.out.println("Employee details Changed");
}

public void DeleteEMP () {
	
	driver.findElement(By.xpath(chkbx_Employeeid)).click();
	driver.findElement(By.xpath(btn_Delete)).click();
}

}
