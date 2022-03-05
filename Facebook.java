package week2.day2;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harinee");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Senthilkumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("harineekraj@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("harineekraj@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("senthil160517");
		WebElement select = driver.findElement(By.xpath("//select[@id='day']"));
	    Select day=new Select(select);
	    day.selectByValue("17");
	    WebElement select1=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(select1);
		month.selectByValue("4");
		WebElement select2=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(select2);
		year.selectByValue("1990");
		WebElement radio=driver.findElement(By.xpath("//label[contains (text(),'Female')]"));
		radio.click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		
		
	}

}

