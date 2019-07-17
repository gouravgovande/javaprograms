// Explicit conversion
class TypeConversion1 {
	public static void main(String args[]) {
		byte b;
		int i = 257;
		char c;
		double d = 323.142;

		System.out.println("\nConversion of int to byte.");
		// If the integer’s value is larger than the range of a byte, it will be reduced modulo
		b = (byte) i; 
		System.out.println("i and b " + i + " " + b);

		System.out.println("\nConversion of double to int.");
		// a floating-point value is assigned to an integer type: truncation
		i = (int) d;
		System.out.println("d and i " + d + " " + i);

		System.out.println("\nConversion of double to byte.");
		// When d is converted to a byte, its fractional component is lost, and the value is reduced modulo 256, which in this 
		// case is 67.
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

		System.out.println("\nConversion of int to char");
		c = (char) i;
		System.out.println("i and c " + i + " " + c);
	}
}