package ImageUploadingValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
		//To get the current title
		System.out.println("The page title is :"+driver.getTitle());
		//Clicking on arrow
		WebElement clickImage=driver.findElement(By.xpath("//*[@id=\"enterimg\"]"));
		
		if(clickImage.isEnabled()) {
			System.out.println("Register button is enabled");
			clickImage.click();
		}
		else {
			System.out.println("Register button is not working");
		}
		
		System.out.println("The page title is :"+driver.getTitle());
		
		if(driver.getTitle().equals("Register")) {
			System.out.println("Successfully Click on Register");
			
		}
		else {
			System.out.println("You are not in Register page");
		}
		//To click on the image
		
		WebElement clickImage2=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/a/img"));
		
		 if(clickImage2.isDisplayed()) {
			 System.out.println("Image successfully Displayed");
			 System.out.println("The Style of image is "+clickImage2.getAttribute("style"));
			 System.out.println("The alt of image is "+clickImage2.getAttribute("alt"));
			 System.out.println("The src of image is "+clickImage2.getAttribute("src"));
		 }
		 else {
			 System.out.println("Image not displayed");
		 }
		 clickImage2.click();
		//System.out.println("The page title is :"+driver.getTitle());
		if(driver.getTitle().equals("Home-Selenium Webdriver Appium Complete Tutorial")) {
			System.out.println("You are on the Home page.");
		}
		else {
			System.out.println("Sorry you are not in the home page.");
		}
		driver.navigate().back();
		if(driver.getTitle().equals("Register")) {
			System.out.println("You are again  on Register page");
			
		}
		else {
			System.out.println("You are not in Register page");
		}
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstname.sendKeys("Sandushi");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lastname.sendKeys("Rathnayaka");
		
		WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("Udawela Gedara,Divithotawela,Welimada");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("sandushirathnayaka@gmail.com");
		
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.sendKeys("0774145512");
		
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		gender.click();
		
		WebElement hobby1=driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		hobby1.click();
		
		WebElement hobby2=driver.findElement(By.xpath("//*[@id=\"checkbox3\"]"));
		hobby2.click();
		 
		WebElement language=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		language.click();
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[35]/a")).click();
		
		driver.findElement(By.xpath("/html/body")).click();
		//language.sendKeys(Keys.ESCAPE);
		WebElement skills=driver.findElement(By.id("Skills"));
		skills.click();
		skills.sendKeys("Java");
		skills.sendKeys(Keys.ESCAPE);
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		country.click();
		WebElement search=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		search.sendKeys("Japan");
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		year.sendKeys("1997");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		month.sendKeys("Auguest");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		day.sendKeys("27");
		
		String password="Rathnayaka1@";
		String confirmpassword="Rathnayaka1@";
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(confirmpassword);
		
		if(firstname.getAttribute("value").isEmpty()) {
			System.out.println("Firstname is Empty.");
		}
		else if(lastname.getAttribute("value").isEmpty()){
			System.out.println("Lastname is Empty.");
		}
		else if(address.getAttribute("value").isEmpty()){
			System.out.println("Address is Empty.");
		}
		else if(email.getAttribute("value").isEmpty()){
			System.out.println("Email is Empty.");
		}
		else if(phone.getAttribute("value").isEmpty()){
			System.out.println("Number is Empty.");
		}
		else if(gender.getAttribute("value").isEmpty()){
			System.out.println("Gender is Empty.");
		}
		else if(hobby1.getAttribute("value").isEmpty()){
			System.out.println("Hobby1 is Empty.");
		}
		else if(hobby2.getAttribute("value").isEmpty()){
			System.out.println("Hobby2 is Empty.");
		}
		
		else if(password==confirmpassword) {
			System.out.println("passwords are ok");
			
			
		}
		
		else {
			driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		}

	}

}
