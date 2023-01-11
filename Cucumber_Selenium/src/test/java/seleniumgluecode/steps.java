package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class steps {
	WebDriver d;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
	    
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admin");
		
		d.findElement(By.id("Button3")).click();
		
	   
	}

	@Then("success Login and Home Page display")
	public void success_login_and_home_page_display() {
	   System.out.println("Login Success");
	   d.close();
	}



}
