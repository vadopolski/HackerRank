package datastructure;

public class MyPositive {
	public static void main(String[] args) {
		Integer [] a = {-4,3,-9,0,4,1};
		int li_n = a.length;
		float res_1 = 0;
		float res_2 = 0;
		float res_3 = 0;
		for (int i = 0; i < li_n; i++){
			if (a[i] > 0) {
				res_1 += 1;
			}
			else if (a[i]<0) {
				res_2 += 1; 
			} 
			else {
				res_3 += 1;						
			}
		}
		System.out.println(res_1/li_n);
		System.out.println(res_2/li_n);
		System.out.println(res_3/li_n);
	}
}
