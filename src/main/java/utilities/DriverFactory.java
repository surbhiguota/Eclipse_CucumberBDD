package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	public static WebDriver open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbhi.gupta\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		return new ChromeDriver();
}
}
