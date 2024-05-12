package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {
	//enabled is used when there is some error in the test skip the test using enabled=false
@Test(enabled=false)	
public void weblogincarloan()
{
	System.out.println("weblogincarloan");
}
@Test(timeOut=4000)
public void mobilelogincarloan(){
	System.out.println("mobilelogincarloan");
	

}
//depends on method is used to execute particular method before current method
@Test(dependsOnMethods={"mobilelogincarloan"})
public void apilogincarloan(){
	System.out.println("apilogincarloan");
	

	}
@Test(dataProvider= "getData")
public void apiloginbikeloan(String username,String password){
	System.out.println(username);
	System.out.println(password);
}
@DataProvider
public Object getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="firstname";
	data[0][1]="password";
	data[1][0]="user";
	data[1][1]="passcode";
	data[2][0]="username";
	data[2][1]="pin";
	return data;
}
}