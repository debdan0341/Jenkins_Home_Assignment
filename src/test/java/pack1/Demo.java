package pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Demo {
	
	@Test
	
public void Test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\debdanbanerjee\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		driver.close();
		
		
	}
	
	
	@Test
	public void Test2() {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 
		 
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 String source=driver.getPageSource();
		 //System.out.println(source);
		 
		 String handle=driver.getWindowHandle();
		 
		 System.err.println(handle);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 driver.findElement(By.xpath("//a[@ href='http://www.orangehrm.com\'] ")).click();
		 
		 driver.quit();
		

}
	

	
	
}
