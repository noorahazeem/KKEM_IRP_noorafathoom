package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Cart;
import pages.Mainpage;
import utils.AnnotationContants;

public class MainTest extends Basetest {
	
		Mainpage obj;
		Cart cart;
		
		@BeforeTest
		public void object() throws IOException {
			obj=new Mainpage(driver);
			cart=new Cart(driver);
		
			setup();
		}
		@Test(priority=1)
		public void try_purchase() {
			obj.isDisplayed();
			System.out.println("Page Loaded properly");
			obj.search();
			System.out.println("Item searched");
			obj.see_options();
			obj.colour();
			System.out.println("Colour selected");
			obj.buy();
			System.out.println("See all buying options clicked");
			obj.addtoCart();
			System.out.println("Added to cart");
			obj.tab_close();
		}
		
		@Test(priority=2)
		public void cart_options() {
			
			
			cart.isDisplayed();
			System.out.println("Cart icon displayed");
			cart.itemDisplayed();;
			System.out.println("Item added in the cart displayed ");
//			cart.item_Delete();
//			System.out.println("Item deleted");
			cart.homeNavigate();
			System.out.println("Navigated to home page ");
		}
	
}

