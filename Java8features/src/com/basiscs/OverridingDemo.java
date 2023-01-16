package com.basiscs;

public class OverridingDemo {
	
	public  void m1() {
		System.out.println("m1 method of parent");
		
	}

}

class Runner extends OverridingDemo {
	public  void m1() {
		
		System.out.println("m1 method of child 1111");
		
	}
	public void m2() {
		System.out.println("m1 method of child");
	}
	public void m2(String s) {
		System.out.println("m1 method of child contains string "+s);
	}
}

class MainRunner{
	public static void main(String[] args) {
	
		OverridingDemo r1=new Runner();
		r1.m1();

		//		OverridingDemo p=new Runner();
//		p.m1();
//		
//		Runner r1=new Runner();
//		r1.m2("Gauri");
		
//		OverridingDemo p=new OverridingDemo();
//		p.m1();
		
//		OverridingDemo p=new Runner();
//		p.m1();
//		OverridingDemo r=new Runner();
//		r.m1();
	}
	
	
	
}
