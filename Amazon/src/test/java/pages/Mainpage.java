package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainpage {
	WebDriver driver;
	
	//constructor to initialize webdriver
	public Mainpage(WebDriver drv) {
		this.driver=drv;
	}
	
	//check the title displayed properly
	@SuppressWarnings("finally")
	public boolean  isDisplayed() {
		try {
			WebElement  title=driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and @aria-label='Amazon']"));
			return title.isDisplayed();
		}finally{
			return false;
		}
	
	}
	
	//search an item
	public  void search() {
		WebElement srch=driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']"));
		srch.sendKeys("s23 ultra");
		WebElement button=driver.findElement(By.xpath("//input[@type='submit' and @id='nav-search-submit-button']"));
		button.click();
	}
	
	//see buying option for the item searched 
	public void see_options() {
		WebElement seeopt=driver.findElement(By.xpath("//a[text()='See options' and @id='a-autoid-1-announce']"));
		seeopt.click();
	}
	
	//select the colour 
	public void colour() {
		WebElement colour=driver.findElement(By.xpath("(//input[@name='2' and @class='a-button-input'])[1]"));
		colour.click();
	}
	
	//try purchase
	public void buy() {
		WebElement buy=driver.findElement(By.xpath("//a[text()=' See All Buying Options ']"));
		buy.click();
	}
	
	//item add to cart
	public void addtoCart() {
		WebElement cart=driver.findElement(By.xpath("//input[@name= 'submit.addToCart']"));
		cart.click();
	}
	
	//item tab close
	public void tab_close() {
		WebElement close=driver.findElement(By.xpath("//i[@class='a-icon aod-close-button']"));
		close.click();
	}
	
}
