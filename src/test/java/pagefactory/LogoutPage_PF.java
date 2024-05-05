package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_PF {



	@FindBy(className="bm-burger-button")
	WebElement MenuButton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement LogoutLink;
	
	WebDriver driver;
	
	public LogoutPage_PF(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

	public void clickOnMenuButton()
	{
		MenuButton.click();
	}
	
	public void clickLogoutLink() 
	{
		LogoutLink.click();
	}



}
