public class Example2{
	public static void main(String args[])
	{
		Example2 ex = new Example2();
		ex.printText();

		// Object FirstClass
		FirstClass fc = new FirstClass();
		fc.printText();

		// Object SecondClass
		SecondClass sc = new SecondClass();
		sc.printText();
	}

	public void printText()
	{
		System.out.println("This is Method from Main Class");
	}
}

class FirstClass
{
	public void printText()
	{
		System.out.println("This is Method from Class FirstClass");
	}
}

class SecondClass
{
        public void printText()
        {
                System.out.println("This is Method from Class SecondClass");
        }
}

