package com.designPattern;

class Runner{
	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Instance 1 :->"+instance1.hashCode());
		System.out.println("Instance 2 :->"+instance2.hashCode());
		
		
	}
}

public class Singleton {
	
	
	//Lezy loading
	private static Singleton Instance=new Singleton();
	
	private Singleton() {
		
	}
	//for thraed safe we have to use double check
	public static Singleton getInstance() {
//		if(Instance==null) {
//			synchronized(Singleton.class) {
//				if(Instance==null) {
//					Instance=new Singleton();
//				}
//			}
//			
//			
//		}
		return Instance;
	}
	

}
