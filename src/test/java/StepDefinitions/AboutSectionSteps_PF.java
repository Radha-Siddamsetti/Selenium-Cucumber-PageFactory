package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefactory.AboutSectionPage_PF;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pagefactory.LogoutPage_PF;

public class AboutSectionSteps_PF {

	
	WebDriver driver = null;	
	LoginPage_PF login;
	HomePage_PF home;
	LogoutPage_PF logout;
	AboutSectionPage_PF abt;
	
	@Given("User open the url")
	public void User_open_the_url()
	{
		System.out.println("===Inside Page Factory====");
		System.out.println("Inside Step - User open the url");
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com/v1/");
	}
	
	@And("User login into page")
	public void User_login_into_page() 
	{
		System.out.println("Inside Step - User login into page");
		login = new LoginPage_PF(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickOnLogin();
	}
	
	@Then("user clicks on the About section")
	public void user_clicks_on_the_About_section() throws InterruptedException
	{
		System.out.println("Inside Step - user clicks on the About section");
		logout = new LogoutPage_PF(driver);
		abt = new AboutSectionPage_PF(driver);
	     logout.clickOnMenuButton();
	     Thread.sleep(1000);
	     abt.clickOnAboutSection();
	     Thread.sleep(1000);
	     driver.close();
	     driver.quit();
			}
	
	
	
}
