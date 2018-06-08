package com.cg.webdriverdemo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\Test\\webdriverdemo2\\src\\main\\webpages\\CheckboxTest.html");

	
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		
		Thread.sleep(2000);
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Value of checkBox :- "+checkbox.getAttribute("value") );
		}
	}	

}
