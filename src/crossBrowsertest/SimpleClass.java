package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleClass {
  @Test
  public void myMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAFUL\\Desktop\\selenium\\chromedriver_103\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
  }
}
