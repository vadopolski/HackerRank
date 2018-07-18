package datastructure;

public class MyMatrix {
	
	public static void main(String[] args) {
		Integer a [][] = {{11,2,4},{4,5,6}, {10,8,-12}};
		int n = a.length;
		int sum_1 = 0;
		int sum_2 = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			sum_1 += a[a_i][a_i];
			sum_2 += a[a_i][n - a_i - 1];
		}
		int result = Math.abs(sum_1 - sum_2);
		System.out.println(result);
	}
}
