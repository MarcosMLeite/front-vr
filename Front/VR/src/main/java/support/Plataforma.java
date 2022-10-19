package support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Plataforma extends Commons {
	public static WebDriver inicializarDriver() throws IOException {

		Properties prop = getProp();
		String browser = prop.getProperty("properties.plataform");

		switch (browser) {

		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference(FirefoxDriver.MARIONETTE, true);
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			break;

		case "CHROME":
            WebDriverManager.chromedriver().setup();
            ChromeOptions handlingSSL = new ChromeOptions();
            handlingSSL.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "disable-popup-blocking", "disable-notifications", "no-sandbox"));
            //handlingSSL.addArguments("--incognito");
            driver = new ChromeDriver(handlingSSL);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            break;




			

		default:
			System.out.println("deve definir navegador no properties");

			break;
		}
		return driver;
	}

	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"src" + File.separator + "test" + File.separator + "java" + File.separator +"Jornada" + File.separator +"setup.properties");
		props.load(file);
		return props;

	}
}
