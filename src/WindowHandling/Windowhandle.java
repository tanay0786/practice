package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String parent = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL +"t"));
		System.out.println("Here");
		
		
		
		
		

	}

}
