class ExampleClass1 {
	public static void main(String args[])
	{
		Box b = new Box(); // Object creation


		// Print Width
		System.out.println("Width : " + b.width);

		// Print Height
		System.out.println("Height : " + b.height);

		// Print Depth
		System.out.println("Depth : " + b.depth);
	}
}

// Class Box
class Box {
	double width=10.0;
	double height=20.0;
	double depth=30.5;
}