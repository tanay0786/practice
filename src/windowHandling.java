import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot rbt=new Robot();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		if(driver.findElements(By.xpath("/html/body/div[2]/div/div/button")).size()>0){
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		}
		
		driver.findElement(By.className("LM6RPg")).sendKeys("iphone x");
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String test=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[2]/div[1]/div/div[1]")).getText();
		String test1=test.substring(1);
		String[] test3=test1.split(",");
		String price=test3[0]+test3[1];
		int flipkartPrice=Integer.parseInt(price);
		System.out.println(flipkartPrice);
		
		
		
		String flipkart=driver.getWindowHandle();
		
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_T);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_T);
		Set<String> tabs=driver.getWindowHandles();
		for(String a:tabs){
			if(!flipkart.equalsIgnoreCase(a)){
				driver.switchTo().window(a);
				
			}
		}
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='s-result-info-bar-content']/div[2]/div/div/span[2]/a/div")).click();
		Thread.sleep(5000);
		String test2=driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[2]/a/span")).getText();
//		System.out.println(test2);
		String test4=test2.substring(2);
//		System.out.println(test4);
		String[] test5=test4.split(",");
		String price2=test5[0]+test5[1];
		int amazonPrice=Integer.parseInt(price2);
		System.out.println(amazonPrice);
		if(flipkartPrice>amazonPrice){
			driver.close();
			driver.switchTo().window(flipkart);
			System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
		
		
	
		

	}

}
