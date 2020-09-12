package testNG;

import org.testng.annotations.Test;

public class GroupingExaample {
	
	//choose Apple and Nokia Group from these
	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Choose Apple");
	}
	
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Choose Apple");
	}
	
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Choose Moto");
	}
	
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("Choose Moto");
	}
	
	@Test(groups= {"Redmi"})
	public void redmi1() {
		System.out.println("Choose Redmi");
	}
	
	@Test(groups= {"Redmi"})
	public void redmi2() {
		System.out.println("Choose Redmi");
	}
	
	@Test(groups= {"Nokia"})
	public void nokia1() {
		System.out.println("Choose Nokia");
	}
	
	@Test(groups= {"Nokia"})
	public void nokia2() {
		System.out.println("Choose Nokia");
	}

}
