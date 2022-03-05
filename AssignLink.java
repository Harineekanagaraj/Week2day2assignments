package week2.day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignLink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
		driver.navigate().back();
		String attribute=driver.findElement(By.partialLinkText("without clicking me?")).getAttribute("href");
		System.out.println("find without clicking:" + attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("404"))
		{
			System.out.println("link is going to 404 page" +title);
		}else {
			System.out.println("link is not going to 404 page" );
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		WebElement linkCounts=driver.findElement(By.tagName("a"));
		Dimension size=linkCounts.getSize();
		System.out.println("links are available in this Page are:" + size);
		
}
}