package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "G:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("hello selenium");
		element.submit();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The page title is:"+driver.getTitle());
		driver.quit();
		
		
	}

}
