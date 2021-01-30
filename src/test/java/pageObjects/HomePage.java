package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	By search = By.xpath("//header/div[1]/div[2]/form[1]/input[1]");
	By increment = By.cssSelector("a.increment");
	By addtoCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By item = By.xpath("//header/div[1]/div[3]/a[4]/img[1]");
	By proceedtocheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

	public WebElement getSearch() {

		return driver.findElement(search);
	}

	public WebElement getIncrement() {

		return driver.findElement(increment);
	}

	public WebElement viewTheItem() {

		return driver.findElement(item);
	}

	public WebElement addToCart() {

		return driver.findElement(addtoCart);
	}

	public WebElement proceedToCheckout() {
		return driver.findElement(proceedtocheckout);
	}

}
