package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled=true)
	public  void login() {
		System.out.println("Login the app");
	}
	
	@Test(dependsOnMethods="login")
	public void searchProduct() {
		System.out.println("Search the Product");
	}
	
	@Test(dependsOnMethods="searchProduct")
	public void addToCart() {
		System.out.println("Add to cart");
	}

}
