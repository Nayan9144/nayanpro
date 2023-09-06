package genaricpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class worklib extends BeseTest {

	private static final WebElement WebElement = null;

	// Accept alert popup
	public void acceptAlertPopup() {
		driver.switchTo().alert().accept();
	}

	public void dissmissPopup() {
		driver.switchTo().alert().dismiss();
	}

	// Accept confirmation POpup
	public void acceptConfirmatinPopup() {
		driver.switchTo().alert().accept();
	}

	public void dissmissConfirmationPopup() {
		driver.switchTo().alert().dismiss();
	}

	public void gettextConfirmationPopup() {
		driver.switchTo().alert().getText();
	}

	public void sendkeyConfirmationPopup(String Key) {
		driver.switchTo().alert().sendKeys(Key);
	}

	// Action class methd
	public void rightClick(WebElement target) {
		Actions act = new Actions(driver);
		act.contextClick(target).perform();

	}

	public void doubleClick(WebElement terget) {
		Actions act = new Actions(driver);
		act.doubleClick(terget).perform();
	}

	public void mouseHover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	public void dragAndDrop(WebElement terget1, WebElement terget2) {
		Actions act = new Actions(driver);
		act.dragAndDrop(terget1, terget2).perform();
	}

	// Fream Handelling

	public void fremHandleByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void fremHandleByNameORId(String NameORId) {
		driver.switchTo().frame(NameORId);
	}

	public void handleFrameByFrameElement(WebElement frame) {
		driver.switchTo().frame(frame);
	}

	// HandelDropDowen
	public void dropdownHandelByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void dropdownHandelByVisibleText(WebElement Element, String Text) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(Text);
	}

	public void dropdownHandelDeselectbyIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void dropdownHandelDeselectByVisibleText(WebElement Element, String Text) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(Text);
	}

	public void dropdownHandelDeselectAll(WebElement Element) {
		Select sel = new Select(Element);
		sel.deselectAll();
	}

	// Robot class
	public void robotTabButton() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
	}

	public void robotEnterButton() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robotctrlButton() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void robotPButton() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_P);
	}
	public void robotCButton() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_C);
		r1.keyRelease(KeyEvent.VK_C);
	}
}
