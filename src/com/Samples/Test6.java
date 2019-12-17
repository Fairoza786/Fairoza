package com.Samples;

public class Test6 {
	int i;
	static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test6 t = new Test6();
		t.i = 200;
		t.non_static();
		j = 300;
		t.j = 390;
		t.static_meth();
		static_meth();

	}
	
	public void non_static()
	{
		System.out.println("Pass1");
	}
	public static void static_meth()
	{
		System.out.println("pass2");
	}

}
