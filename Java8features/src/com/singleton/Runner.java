package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Runner {
	public static void main(String[] args) throws ReflectiveOperationException, FileNotFoundException, IOException {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
	
		
		System.out.println("First instatnce : -> "+s1.hashCode());
		System.out.println("Second instatnce : -> "+s2.hashCode());
		
		System.out.println("Using Reflection we can break Singleton design pattern.......");
		
		Class<?>singleton=Class.forName("com.singleton.Singleton");
		Constructor<Singleton>constructor=(Constructor<Singleton>) singleton.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		Singleton s3=constructor.newInstance();
		
		
		System.out.println("Third instatnce : -> "+s2.hashCode());
		System.out.println("Fourth instatnce : -> "+s3.hashCode());
		
		System.out.println("we can break singleton design pattern by using Serialization concept....");
		//serialization
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream("D:\\seri.ser")); 
		objectoutputstream.writeObject(s1);
		objectoutputstream.close();
		//De-Serialization
		
		ObjectInputStream inputobjectstream= new ObjectInputStream(new FileInputStream("D:\\seri.ser"));
		Singleton s5 = (Singleton) inputobjectstream.readObject();
		System.out.println("Third instatnce : -> "+s2.hashCode());
		System.out.println("Fifth instatnce : -> "+s5.hashCode());
		inputobjectstream.close();
		
		System.out.println("we can break singleton design pattern by using clonning concept....");
		
//		Singleton s8=Singleton.getInstance();
//		Singleton instance=(Singleton) s.clone();
		
		
		
	}

}
