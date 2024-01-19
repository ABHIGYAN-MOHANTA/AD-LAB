import java.util.*;
public class MergeTwoSorted {

	public static void main(String[] args) {
		int a[] = {1,5,9,10,15,20};
		int b[] = {2,3,8,13};
		for(int i = 0, j =0; i< a.length;i++) {
			if(a[i] > b[j]) {
				int t = a[i];
				a[i] = b[j];
				b[j] = t;
				for(int k = 0; k<b.length; k++) {
					for(int l = k+1; l < b.length; l++) {
						if(b[l] < b[k]) {
							int temp = b[l];
							b[l] = b[k];
							b[k] = temp;
						}
					}
				}
			} 
				
	
		}
	
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
