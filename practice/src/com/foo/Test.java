package com.foo;

public class Test {

	public boolean compare(int a, int b) {
		if (a == b) {
			return true;
		}
		return false;
	}

	public boolean compare(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] != b[i]) {
				return false;
			}

		}
		return true;

	}

	public boolean compare(String a, String b) {
		if (a.equals(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Test t = new Test();
		// System.out.println(t.compare(2, 2));
		int[]a= {1,8,9,2};
		int[]b= {1,8,9,3};
		System.out.println(t.compare(a, b));
//		String a = "Hello";
//		String b = "Hello";
//		System.out.println(t.compare(a, b));
	}

}
