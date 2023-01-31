import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {// can not create an object 
	//it will save some space in memory
	//can have implicit and non implicit body
	abstract void eat();
	

	static ChromeDriver driver = null;// static helps to save some memory 
	//when you use static in instant variable it become 
	//class variable it can be called by class name and it work with the change value
	//static method can be overload but not overriding.
	//top class can not be static but inner class can be is called nested class.
	//static variable can not be local 
	@BeforeClass
	public static void beforeClass() {
		System.out.println("it will run before class starts");
	}
	driver = new ChromeDriver();
	driver.get("http://www.express.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	@Before 
	public  void getDriver() {
		driver = new ChromeDriver();
		driver.get("http://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("it will run after class finish");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}
