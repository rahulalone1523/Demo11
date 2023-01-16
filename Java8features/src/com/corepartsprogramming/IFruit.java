package com.corepartsprogramming;

public interface IFruit {
	
	public String TYPE="Apple";

}

class Fruit implements IFruit{
	
	
}
class test{
	public static void main(String[] args) {
		System.out.println(Fruit.TYPE);
	}
}