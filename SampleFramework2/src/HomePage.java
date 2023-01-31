import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class HomePage {
//opposite of 
	//final class can not be inheritance but can inheritaed, if method is final it can not be override.
	// if variable is final its called constant variable with can not be changed.

	ChromeDriver driver;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/a/img") WebElement homePageLogo;
@FindBy(xpath="//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[2]/a") WebElement menMenuCatagory;
@FindBy(xpath="xpath of womenMenu") WebElement womenMenuCatagory;
    public HomePage(ChromeDriver x) {
		
		driver = x;
		PageFactory.initElements(driver, this);
	}

    public void VerifyHomepageLogo() throws InterruptedException {
    	System.out.println("logo");
    	Thread.sleep(3000);
    boolean result = Helper.VerifyElement(homePageLogo);
    
    }
    
    public void HoverOverOnMenMenu() throws InterruptedException {
    	System.out.println("hoverOver");
    	Thread.sleep(3000); 
	Helper.hoverOverOnElement(driver, menMenuCatagory);
	Thread.sleep(3000);
    }
    
    public NewArrivalPage clickOnNewArrival() {
	Helper.click(driver.findElement(By.xpath("xpathOfNewArrrival")));
	return new NewArrivalPage(driver);
    }
    
    public void HoverOverOnWoMenMenu() {
	Helper.hoverOverOnElement(driver, womenMenuCatagory);
    }
    
    public jeweleyPage clickOnJeweley() {
	Helper.click(driver.findElement(By.xpath("xpathOfNewArrrival")));
	return new jeweleyPage(driver);
    }

    //abstract void eat(); normal class can only have implemented
    abstract int a = 9;// abstract variable is not possible
}
