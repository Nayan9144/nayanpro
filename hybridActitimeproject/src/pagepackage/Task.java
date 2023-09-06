package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricpackage.worklib;



public class Task {

	
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Projects_CustomersLink;
	@FindBy(xpath = "//input[contains(@value,'Create New C')]") private WebElement createNewCustomerButton;
	@FindBy(xpath = "//input[contains(@value,'Create New Project')]") private WebElement createNewProjectButton;
	@FindBy(name = "name") private WebElement customerNameTextBox;
	@FindBy(name = "createCustomerSubmit") private WebElement createCustomerButton;
	@FindBy(name = "customerId") private WebElement customerDropDown;
	@FindBy(name = "name") private WebElement projectNameTextBox;
	@FindBy(name = "createProjectSubmit") private WebElement createProjectButton;
	
   public Task(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }

public WebElement getProjects_CustomersLink() {
	return Projects_CustomersLink;
}

public WebElement getCreateNewCustomerButton() {
	return createNewCustomerButton;
}

public WebElement getCreateNewProjectButton() {
	return createNewProjectButton;
}

public WebElement getCustomerNameTextBox() {
	return customerNameTextBox;
}

public WebElement getCreateCustomerBuElement() {
	return createCustomerButton;
}

public WebElement getCustomerDropDown() {
	return customerDropDown;
}

public WebElement getProjectNameTextBox() {
	return projectNameTextBox;
}

public WebElement getCreateProjectButton() {
	return createProjectButton;
}

public void createNewCustomerMethod(String customer_name)
{
	Projects_CustomersLink.click();
	createNewCustomerButton.click();
	customerNameTextBox.sendKeys(customer_name);
	createCustomerButton.click();
}

public void createNewProjectMethod(String text,String project_name)
{
	createNewProjectButton.click();
worklib wlb = new worklib();
	wlb.dropdownHandelByVisibleText(customerDropDown, text);
	projectNameTextBox.sendKeys(project_name);
	createProjectButton.click();
}
}