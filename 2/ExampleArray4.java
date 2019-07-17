// Demonstrate a two-dimensional array.
class ExampleArray4{
	public static void main(String args[]) {
		int twoD[][]= new int[4][5];
		int i, j, k = 0;
		for(i=0; i<4; i++)
			for(j=0; j<5; j++) {
				twoD[i][j] = k;
				k++;
			}

		for(i=0; i<4; i++) {
			for(j=0; j<5; j++)
			System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
	}
}

// Alternative Array Declaration Syntax
// There is a second form that may be used to declare an array:
// type[ ] var-name;

// Here, the square brackets follow the type specifier, and not the name of the array variable.
// For example, the following two declarations are equivalent:
// int al[] = new int[3];
// int[] a2 = new int[3];

// The following declarations are also equivalent:
// char twod1[][] = new char[3][4];
// char[][] twod2 = new char[3][4];

// This alternative declaration form offers convenience when declaring several arrays at the
// same time. For example,
// int[] nums, nums2, nums3; // create three arrays

// creates three array variables of type int. It is the same as writing
// int nums[], nums2[], nums3[]; // create three arrays
