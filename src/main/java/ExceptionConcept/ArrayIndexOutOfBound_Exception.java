package ExceptionConcept;

public class ArrayIndexOutOfBound_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayIndexOutOfBounds Exception : It is thrown to indicate that an array has been accessed with an illegal index. 
		The index is either negative or greater than or equal to the size of the array.*/
		
		try {
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}

		

	}

}
