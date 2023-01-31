import javax.swing.JWindow;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTest extends BaseTest {
@Test
	public void logIn() throws InterruptedException {
	HomePage hp = new HomePage(driver);//nevigate homepage
	hp.VerifyHomepageLogo(); //verify logo
	hp.HoverOverOnMenMenu();
	/*NewArrivalPage np = hp.clickOnNewArrival();
	ProductDetailPage pdp = np.clickOnMenShirt();
	pdp.selectSize();
	pdp.selectColore();
	pdp.addToCartButton();*/
	}
@Test
    public void logOut() {
	HomePage hp = new HomePage(driver);
	hp.HoverOverOnWoMenMenu();
	jeweleyPage jp = hp.clickOnJeweley();
	jp.clickOnTypeFilter();
	}
}
