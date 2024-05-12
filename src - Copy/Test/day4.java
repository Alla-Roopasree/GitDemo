package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void webloginhomeloan()
	{
		System.out.println("webloginhomeloan");
	}
	@AfterClass
	public void mobileloginhomeloan(){
		System.out.println("mobileloginhomeloan");
		

	}
	@BeforeClass
	public void apiloginhomeloan(){
		System.out.println("apiloginhomeloan");
		

		}
}
