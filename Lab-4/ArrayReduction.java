import java.util.*;
public class ArrayReduction {

	public static void main(String[] args) {
		int a[] = {5,1,1,1,2,3,5};
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		int max = a[a.length-1];
		int sum =0, count =0;
		for(int i =0; i<a.length; i++) {
			sum +=a[i];
			count++;
			if(sum >= max) {
				break;
			}
		}
		
		System.out.println("No. steps is : "+count);
	}

}
