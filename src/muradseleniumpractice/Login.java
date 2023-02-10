package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public final static String url1 = "http://sis.neotechacademy.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url1);
		// send username and password and click on sumbit
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");
		driver.findElement(By.id("bLogin")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("Students")).click();
		driver.quit();

	}
}
