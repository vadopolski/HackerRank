package datastructure;

public class MyFloat {
	public static void main(String[] args) {
		Integer [] a = {-4,3,-9,0,4,1};
		float n = a.length;
		float res_1;
		float res_2;
		if( n%2 == 0 ) {
			res_1 = 2/( n*n );
			res_2 = ( n/2-1 )/n;
		}
		else {
			res_1 = 2/( n*n );
			res_2 = 2/( n*n );
		}
		float res_3 = 1/n;		
		System.out.println(res_1);
		System.out.println(res_2);
		System.out.println(res_3);
	}
}
