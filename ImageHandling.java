package ImageUploadingValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/login/identify/?ctx=recover";
		//Chrome driver path setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandu\\eclipse-workspace\\ImageUploadingVAlidation\\chromedriver.exe");
		//Launch Url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Maximize the window
		driver.manage().window().maximize();
		
		//WebElement login=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]"));
		//login.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/a"));
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals("Forgotten Password | Can't Log In | Facebook")) 

		{

		            System.out.println("Please login to Facebook");

		        } 
		else {

		            System.out.println("You are already logged to Facebook");

		        }
		
		
			
		
	}

}
