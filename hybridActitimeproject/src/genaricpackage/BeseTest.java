
package genaricpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BeseTest extends Flib implements Iautoconstunt {

	// it is use to open & close the browser
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();

		}

		else if (browserValue.equalsIgnoreCase("Firefox")) {

			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();

		} else if (browserValue.equalsIgnoreCase("Edge")) {

			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();

		} else {
			Reporter.log("Browser value is not valid ", true);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}

	public void failedmethod(String faildemethod) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sorce = ts.getScreenshotAs(OutputType.FILE);
			File stor = new File("./screenshort/"+faildemethod+".png\"");
			Files.copy(sorce, stor);

		} catch (Exception e) {

		}

	}

	@AfterMethod
	public void terDown() {
		driver.quit();
	}

}
