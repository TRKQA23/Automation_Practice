package JavaforQAArray;

public class ForLoopforArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 8, 9, 1 ,6,6}, { 1,3,4, 6, 7 } };

		// System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
