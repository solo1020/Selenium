package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "G:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\Selenium\\geckodriver.exe");
		
		//new一个浏览器驱动
		WebDriver dr = new FirefoxDriver();
		
		//get获取访问地址
		dr.get("https://passport.csdn.net/login");
		
		WebElement elem = dr.findElement(By.linkText("账号登录"));
		elem.click();
		
		//通过id获取用户输入框元素
		elem = dr.findElement(By.id("all"));
		
		//调用sendKeys 方法
		elem.sendKeys("*******");
		
		//通过id获取密码框元素
		elem = dr.findElement(By.id("password-number"));
		elem.sendKeys("*******");
		
		elem = dr.findElement(By.className("btn-primary"));
		elem.click();
		
		System.out.println("The title is:"+dr.getTitle());
		
	}

}

