package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
@Test	
public void weblogincarloan()
{
	System.out.println("weblogincarloan");
}
@AfterTest
public void mobilelogincarloan(){
	System.out.println("mobilelogincarloan");
	

}
@BeforeTest
public void apilogincarloan(){
	System.out.println("apilogincarloan");
	

	}
}
