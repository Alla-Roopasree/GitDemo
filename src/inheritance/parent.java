package inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parent {

public void method1() {
	System.out.println("hello");
	System.out.println("Byejj");
	}
@BeforeMethod
public void method2()
{
	System.out.println("Before");
}
@AfterMethod
public void method3()
{
	System.out.println("After");
}

}
