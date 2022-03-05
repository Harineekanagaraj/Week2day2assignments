package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement Index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	    Select dd=new Select(Index);
	    dd.selectByIndex(1);
		WebElement Text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
        Select dd1=new Select(Text);
        dd1.selectByVisibleText("Appium");
        WebElement Value = driver.findElement(By.xpath("//select[@id='dropdown3']"));
	    Select dd2=new Select(Value);
	    dd2.selectByValue("3");
	    WebElement Options = driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select dd3=new Select(Options);
	    dd3.getOptions();
	    Dimension size=Options.getSize();
		System.out.println("number of dropdown are:" + size);
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("UFT/QTP");
		WebElement MultipleSelection=driver.findElement(By.xpath("(//div[@class='example']/select)[6]"));
		Select dd4=new Select(MultipleSelection);
		dd4.selectByValue("1");
		dd4.selectByValue("2");
		dd4.selectByValue("3");
		dd4.selectByValue("4");
}
}