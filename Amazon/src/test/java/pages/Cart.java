package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

WebDriver driver;
	
	public Cart(WebDriver drv) {
		this.driver=drv;
	}
	
	//check the cart icon dsiplayed properly
	@SuppressWarnings("finally")
	public boolean isDisplayed() {
		try {
			WebElement icon=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
			return icon.isDisplayed();
		}finally{
			return false;
		}
	}
	
	//click the  cart icon
	public void navigatetoCart() {
		WebElement  cart=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		cart.click();
	}
	
	//check whether the item in the cart displayed or not 
	@SuppressWarnings("finally")
	public  boolean itemDisplayed() {
		try {
			WebElement item=driver.findElement(By.xpath("//span[contains(text(), 'A SLICE RED I23 Ultra Unlocked Cell Phone')][2]"));
			return item.isDisplayed();
		}finally{
			return false;
		}
	}
	
	//delete item in the cart
	public void item_Delete() {
		WebElement  dlt=driver.findElement(By.xpath("//button[@data-action='a-stepper-decrement']"));
		dlt.click();
	}
	
	//navigate to home page
	public void homeNavigate() {
		WebElement home=driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and @aria-label='Amazon']"));
		home.click();
		
	}
}
