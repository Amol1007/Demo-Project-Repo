package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.masterthought.cucumber.json.Output;

public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\My coading workspace\\MyCucumberTestProject\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        takeScreenshot("Amazon Login Page");
        close();
	}
	
	public static void takeScreenshot(String fileName) throws IOException 
	{

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\My coading workspace\\MyCucumberTestProject\\ScreenShots\\"+fileName+".jpg"));
		
	
		
	}
	
	public static void close() 
	{
		driver.close();
		
	}

}
