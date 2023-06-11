// Java program to convert Hexadecimal to Binary

import java.util.HashMap;

public class HtoB {

	// declaring the method to convert
	// Hexadecimal to Binary
	String hexToBinary(String hex)
	{

		// variable to store the converted
		// Binary Sequence
		String binary = "";

		// converting the accepted Hexadecimal
		// string to upper case
		hex = hex.toUpperCase();

		// initializing the HashMap class
		HashMap<Character, String> hashMap
			= new HashMap<Character, String>();

		// storing the key value pairs
		hashMap.put('0', "0000");
		hashMap.put('1', "0001");
		hashMap.put('2', "0010");
		hashMap.put('3', "0011");
		hashMap.put('4', "0100");
		hashMap.put('5', "0101");
		hashMap.put('6', "0110");
		hashMap.put('7', "0111");
		hashMap.put('8', "1000");
		hashMap.put('9', "1001");
		hashMap.put('A', "1010");
		hashMap.put('B', "1011");
		hashMap.put('C', "1100");
		hashMap.put('D', "1101");
		hashMap.put('E', "1110");
		hashMap.put('F', "1111");

		int i;
		char ch;

		// loop to iterate through the length
		// of the Hexadecimal String
		for (i = 0; i < hex.length(); i++) {
			// extracting each character
			ch = hex.charAt(i);

			// checking if the character is
			// present in the keys
			if (hashMap.containsKey(ch))

				// adding to the Binary Sequence
				// the corresponding value of
				// the key
				binary += hashMap.get(ch);

			// returning Invalid Hexadecimal
			// String if the character is
			// not present in the keys
			else {
				binary = "Invalid Hexadecimal String";
				return binary;
			}
		}

		// returning the converted Binary
		return binary;
	}

	// Driver Code
	public static void main(String[] args)
	{

		// instantiating the class
		GFG ob = new GFG();
	
		String hex = "deafa";
	
		System.out.println(hex.toUpperCase());
	
		// printing and calling the
		// hexToBinary() function
		System.out.println(ob.hexToBinary(hex));
	}
}
