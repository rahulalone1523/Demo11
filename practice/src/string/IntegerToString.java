package string;

public class IntegerToString {

	// There are 4 types of conversion will be done here
	public static void main(String[] args) {

		// First type
		String str = "1234";
		int integerValue = Integer.parseInt(str);
		System.out.println("Converted String To integer : " + integerValue);

		// Second type
		int intvalue = Integer.valueOf(str);
		System.out.println("Converted String To integer : " + intvalue);

		int number = new Integer(str).intValue();
		System.out.println("Converted String To integer : " + number);

	}

}
