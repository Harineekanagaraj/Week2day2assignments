package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignImage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.navigate().back();
		WebElement elementBrokenImage =driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[2]"));
        if(elementBrokenImage.equals("0")) {
        	System.out.println("image is broken");
        }else {
        	System.out.println("image is not broken");
        }
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]")).click();
		

}
}