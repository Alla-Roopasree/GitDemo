package inheritance;

import java.io.PrintStream;

import org.testng.annotations.Test;

public class child extends parent{
@Test
//constructor is used to send values parameters

	public void childMethod()
	{
	
    ps2 p=new ps2(3);
    int a=3;
	method1();
	//PrintStream printStream = new PrintStream(null);
	System.out.println(p.increment());
	System.out.println(p.decrement());
	System.out.println(p.multiply());
	}
public void print1()
{
	System.ot.println("hello");
}
}
