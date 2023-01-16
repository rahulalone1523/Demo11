package com.exception;

public class InvalidAgeException extends RuntimeException {
	
	InvalidAgeException(){
		System.out.println("Your are under age");
	}
	
	InvalidAgeException(String msg){
		System.out.println(msg);
	}

}

class ExceptionDemoDriver{
	public static void main(String[] args) {
		try {
			//vote(17);
			int age=17;
			if(age<18) {
				throw new InvalidAgeException();
			}
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		
		
	}
	
//	static void vote(int age) throws InvalidAgeException {
//		if(age<18) {
//			throw new InvalidAgeException();
//		}
//		else {
//			System.out.println("You can vote!!");
//		}
//		
//	}
	
}
