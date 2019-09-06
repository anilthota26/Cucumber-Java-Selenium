package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public static int IMPLISIT_WAIT=20;
	public static int PAGELOAD_TIME=40;
	public Properties prop;
	
	public void init() throws IOException {
		FileInputStream fis =new FileInputStream("Y:\\New Work Space\\CRMWebsite\\resources\\config.properties");
		prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","Y:\\Selenium Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","Y:\\Selenium Softwares\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","Y:\\Selenium Softwares\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLISIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	public void getScreenShot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		FileUtils.copyFile(src, dest);
		
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
