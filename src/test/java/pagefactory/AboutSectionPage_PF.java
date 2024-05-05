package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutSectionPage_PF {

	
	@FindBy(id="about_sidebar_link")
	WebElement AboutSection;
	
	
	WebDriver driver;
	
	public AboutSectionPage_PF(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

	public void clickOnAboutSection()
	{
		AboutSection.click();
	}
	
	
	
}
