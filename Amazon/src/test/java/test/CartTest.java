package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Cart;
import pages.Mainpage;

public class CartTest extends Basetest {
	Cart obj;
	Mainpage main;
	
	@BeforeTest
	public void object() throws IOException {
		obj=new Cart(driver);
		main=new Mainpage(driver);
		setup();
	}
	@Test(priority=1)
	public void cart_optons() {
		
		
		obj.isDisplayed();
		System.out.println("Cart icon displayed");
		obj.itemDisplayed();;
		System.out.println("Item added in the cart displayed ");
		obj.item_Delete();
		System.out.println("Item deleted");
		obj.homeNavigate();
		System.out.println("Navigated to home page ");
		
	}
}
