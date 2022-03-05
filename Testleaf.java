package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testleaf {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("the title is : " +driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
	}

}
