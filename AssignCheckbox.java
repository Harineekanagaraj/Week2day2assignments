package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignCheckbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		WebElement elementChecked=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
if(elementChecked.isSelected()) {
	System.out.println("Selenium is checked");
	
}else {
	System.out.println("Selenium is not checked");
}
WebElement element1=driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
if(element1.isSelected()) {
        element1.click();
        
}
WebElement element2=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));

if(element2.isSelected()) {
    element2.click();
}
WebElement MultipleSelection=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
MultipleSelection.click();
}
	}
