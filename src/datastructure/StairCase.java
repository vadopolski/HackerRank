package datastructure;

public class StairCase {

	public static void printStairCaseRow (int n, int m) {
		for (int i = 0; i < n; i++ ) {
			System.out.print(" ");
		}
		for (int i = 0; i < m; i++) {
			System.out.print("#");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int size = 6;
		int n = 1;
		while (n < size+1) {
			printStairCaseRow(size - n, n);
			n++;
		}	
	}
}
