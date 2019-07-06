package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "G:\\Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\Selenium\\geckodriver.exe");
		
		//newһ�����������
		WebDriver dr = new FirefoxDriver();
		
		//get��ȡ���ʵ�ַ
		dr.get("https://passport.csdn.net/login");
		
		WebElement elem = dr.findElement(By.linkText("�˺ŵ�¼"));
		elem.click();
		
		//ͨ��id��ȡ�û������Ԫ��
		elem = dr.findElement(By.id("all"));
		
		//����sendKeys ����
		elem.sendKeys("*******");
		
		//ͨ��id��ȡ�����Ԫ��
		elem = dr.findElement(By.id("password-number"));
		elem.sendKeys("*******");
		
		elem = dr.findElement(By.className("btn-primary"));
		elem.click();
		
		System.out.println("The title is:"+dr.getTitle());
		
	}

}

