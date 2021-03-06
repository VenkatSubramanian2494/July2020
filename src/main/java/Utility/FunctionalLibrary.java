package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalLibrary {

	public static Properties prop;

	public static WebDriver driver;

	public FunctionalLibrary() {

		prop = new Properties();

		try {
			prop.load(new FileInputStream("./config/configuration.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void browserFactory() {

		String browser = prop.getProperty("browser");

		if (browser.toUpperCase().equals("CHROME")) {

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browser.toUpperCase().equals("IE")) {

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
		}

		else {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

	
	}
}
