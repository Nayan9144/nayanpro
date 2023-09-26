package testpackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genaricpackage.BeseTest;
import genaricpackage.CustomListener;
import genaricpackage.Flib;
import pagepackage.Loginpage;

@Listeners(CustomListener.class)

public class Validlogin extends BeseTest {
	@Test

	public void validTestCase() throws IOException {
		Flib flib = new Flib();
		Loginpage lp = new Loginpage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));

	}
}
