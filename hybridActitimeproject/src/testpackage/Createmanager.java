package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genaricpackage.BeseTest;
import genaricpackage.Flib;
import pagepackage.Homepage;
import pagepackage.Loginpage;
import pagepackage.Userpage;

public class Createmanager {
  @Test
  public class UserTestCase extends BeseTest {
	
	@Test
	  public void createUserMethod() throws IOException, EncryptedDocumentException, InterruptedException {
		  
		  // to perform login call the methods from LoginPage pom class
		Loginpage lp = new Loginpage(driver);
		 Flib flib = new Flib();
		  lp.validLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
	     // to click on user module call the method from HomePage pom class
		  Homepage hp = new Homepage(driver);
		   hp.getUsersModule();
		 // to create the user call the methods From usersPage pom class
		Userpage up = new Userpage(driver);
		   up.createManager(flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME,1, 0),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1,1),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME,1,2),flib.readExcelData(EXCEL_PATH, MANAGERSHEET_NAME, 1,3));
	  // delete the user
		  // up.deleteManager();
		   
		   hp.getLogoutLink();
		  
	  }
}
  }