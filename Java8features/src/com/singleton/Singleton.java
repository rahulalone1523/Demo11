package com.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton singleton;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
