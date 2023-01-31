import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jeweleyPage {
	ChromeDriver driver;
	@FindBy(xpath="xpath of selectFilter") WebElement typeFilterOption;
	
	
	public jeweleyPage(ChromeDriver x) {
			
			driver = x;
			PageFactory.initElements(driver, this);
	}
	public void clickOnTypeFilter() {
		Helper.click(typeFilterOption);
	}
}
