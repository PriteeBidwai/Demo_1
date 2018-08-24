package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
		driver.findElement(By.id("u_0_j")).sendKeys("Akash");
		
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lalwani");

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akashlalwani@gmail.com");

driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("akashlalwani@gmail.com");

driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("akash123");

WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

Select s = new Select(day);

s.selectByIndex(22);

Thread.sleep(5000);

WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

Select s2= new Select(month);
s2.selectByValue("9");
Thread.sleep(5000);

WebElement year= driver.findElement(By.xpath("//select[@title='Year']"));
 Select s3= new Select(year);
 s3.selectByVisibleText("2018");
 
 driver.findElement(By.xpath("//input[@type='radio']")).click();
 
// driver.findElement(By.xpath("//button[@name='websubmit']")).click();





	}

}
