package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pagefactory.LogoutPage_PF;
//import pages.loginPage;

public class LoginSteps_PF {

	WebDriver driver = null;	
	LoginPage_PF login;
	HomePage_PF home;
	LogoutPage_PF logout;
	
	@Given("browser is open")
	public void browser_is_open()
	{
		System.out.println("===Inside Page Factory====");
		System.out.println("Inside Step - browser is open");
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("Inside Step - user is on login page");
		driver.navigate().to("https://www.saucedemo.com/v1/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) 
	{
		System.out.println("Inside Step - user enters username and password");
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		//driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
	 
	}

	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
		System.out.println("Inside Step - clicks on login button");
		login.clickOnLogin();
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page()
	{
		System.out.println("Inside Step - user is navigated to the home page");
		home = new HomePage_PF(driver);
		home.checkHomePageIsDisplayed();
		
		//driver.findElement(By.className("app_logo")).isDisplayed();
	
			}
	
	@Then("user clicks logout")
	public void user_clicks_logout() throws InterruptedException
	{
		System.out.println("Inside Step - user clicks logout");
		logout = new LogoutPage_PF(driver);
		logout.clickOnMenuButton();
		Thread.sleep(1000);
		logout.clickLogoutLink();
		
		//driver.findElement(By.className("app_logo")).isDisplayed();
	 Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
}
