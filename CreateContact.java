package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Hari");
	    driver.findElement(By.id("lastNameField")).sendKeys("Sen");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("TLF");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("TLL");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("xyz");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("harineekanagaraj@gmail.com");
	    WebElement select = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dd=new Select(select);
	    dd.selectByValue("NY");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("ABCD");
	    driver.findElement(By.name("submitButton")).click();
	}

}
