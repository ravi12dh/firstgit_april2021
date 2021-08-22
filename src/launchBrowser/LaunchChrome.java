package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scar = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratb\\Apr2021_Selenium\\First_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		driver.close();
	}

	
}
