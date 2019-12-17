package com.Samples;

public class Main2 {
	int var;
	static int stc = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 obj1 = new Main2();
		obj1.var = 100;
		System.out.println("Var"+obj1);
		
		Main2 obj2 = new Main2();
		obj2.var = 600;
		System.out.println(obj2);
		
		obj1.var = obj1.var+100;
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
