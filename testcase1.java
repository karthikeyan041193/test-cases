package icici;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class testcase1 {
	
	

	private static final By By = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.manage().deleteAllCookies();

		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		driver.get("https://www.online.citibank.co.in/portal/newgen/cards/tab/apply-now.htm?category=shopping&site=PORTAL&creative=XER&section=INCCCCTWAFCTRCAN&agencyCode=&campaignCode=&productCode=&eOfferCode=INSIDEBANNER&cardName=rewardscard");

	
		
	}

}
