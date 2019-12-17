package com.Samples;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A22 a  = new A22();
		B22 b  = new B22();
		
		a.parentMeth();
		a.childMeth();
		b.childMeth();
		a.parentMeth();
		
		
		

	}

}
class A22{
	public void parentMeth()
	{}
}
class B22 extends A22{
	public void childMeth()
	{}
}
