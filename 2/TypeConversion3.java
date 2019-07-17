// Automatic & Explicit conversion
class TypeConversion2 {
	public static void main(String args[]) {
		byte b = 50;
		b = b * 2; // This will give an error
		// b = (byte) b * 2; // This will give an error
 		// b = (byte) (b*2);
		System.out.println(b);
	}
}