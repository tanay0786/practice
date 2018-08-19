import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablepractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tanay Chawla\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		String str = driver.findElement(By.xpath("//div[@id='crayon-5b2aa0f0f24f7543186250']/following::table[1]/tbody/tr[1]/td[1]")).getText();
		System.out.println(str);
		

	}
}
