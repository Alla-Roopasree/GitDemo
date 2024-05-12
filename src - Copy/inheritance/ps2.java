package inheritance;

public class ps2 extends ps3 {
int a;
	public ps2(int a) {
		// TODO Auto-generated constructor stub
		super(a);//super kwyword used to invoking the parent constructor
	this.a=a;
	}
	

	public int increment() {
		// TODO Auto-generated method stub
		a=a+1;
		return a;
	}

	public int decrement() {
		// TODO Auto-generated method stub
		a=a-1;
		return a;
	}



}
