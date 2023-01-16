package string;

import java.util.HashSet;
import java.util.Set;

public class StringDemo {

	public static void main(String[] args) {

		String str = "abccfgfv";

		Set<Character> set = new HashSet<>();
		String longesttillnow = "";
		String longestoverall = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (set.contains(c)) {
				longesttillnow = "";
				set.clear();
			}
			set.add(c);
			longesttillnow += c;

			if (longesttillnow.length() > longestoverall.length()) {
				longestoverall = longesttillnow;
			}
		}
		System.out.println("LongestOverall :"+longestoverall);

	}

}
