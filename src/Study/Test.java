package Study;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");//chromedriver�����ַ
        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ��󣬵���new ����FirefoxDriver������
        driver.get("http://www.baidu.com");//��ָ������վ
        driver.findElement(By.id("kw")).sendKeys(new  String[] {"hello"});//�ҵ�kwԪ�ص�id��Ȼ������hello
        driver.findElement(By.id("su")).click(); //�����Ť
        try {
            /**
             * WebDriver�Դ���һ�����ܵȴ��ķ�����
            dr.manage().timeouts().implicitlyWait(arg0, arg1����
            Arg0���ȴ���ʱ�䳤�ȣ�int ���� ��
            Arg1���ȴ�ʱ��ĵ�λ TimeUnit.SECONDS һ��������Ϊ��λ��
             */
            driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);        
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * dr.quit()��dr.close()�������˳������,�򵥵�˵һ�����ߵ����𣺵�һ��close��
         * ������˶��ҳ���ǹز��ɾ��ģ���ֻ�رյ�ǰ��һ��ҳ�档�ڶ���quit��
         * ���˳�������Webdriver���еĴ��ڣ��˵ķǳ��ɾ��������Ƽ�ʹ��quit��Ϊһ��case�˳��ķ�����
         */
        driver.quit();//�˳������
    }
}