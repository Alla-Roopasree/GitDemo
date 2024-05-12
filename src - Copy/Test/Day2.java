package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class Day2 {
	//willexecute before every method in test
	@BeforeMethod	
public void demo2()
{
	System.out.println("demo2");
}
	@Test(groups="smoke")
	public void demo3()
	{
		System.out.println("demo3");
	}
	@Parameters({"url","apikey"})
	@Test
	public void demo4(String urlname,String apikey)
	{
		System.out.println("demo4");
		System.out.println(urlname);
		System.out.println(apikey);
	}
}
