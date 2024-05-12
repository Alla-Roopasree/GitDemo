package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
@BeforeSuite
//will execute before test suite
public void personalloanweblogin()
{
	System.out.println("personalloanweblogin");
}
@AfterSuite
//will execute after test suite
public void pesonalloanmobilelogin(){
	System.out.println("pesonalloanmobilelogin");
}

}
