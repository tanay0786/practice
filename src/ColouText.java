import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColouText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		System.out.println(driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getCssValue("color").format("#%02x%02x%02x", 255,255,255));
		
		System.out.println(driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getCssValue("background-color").format("#%02x%02x%02x", 190,75,73));
		System.out.println(s);
		driver.close();
		
		

	}

}
