import java.util.*;
public class CheckReverse {

	public static void main(String[] args) {
		int a[] = {1,2,10,5,4,3};
		int b[] = Arrays.copyOfRange(a, 0, a.length);
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		int start = 0;
		int end = 0;
		
		for(int i=0; i<b.length;i++) {
			if(a[i] != b[i]) {
				start = i;
//				System.out.println(start);
				break;
			}
		}
		
		for(int i = a.length-1; i> start; i--) {
			if(a[i] != b[i]) {
				end = i+1;
//				System.out.println(end);
				break;
			}
		}
		
		int ogSubArray[] = Arrays.copyOfRange(b, start, end);
		int newSubArray[] = Arrays.copyOfRange(a, start, end);
//		System.out.println(Arrays.toString(ogSubArray));
//		System.out.println(Arrays.toString(newSubArray));
		int flag = 0;
		for(int i = 0, j = ogSubArray.length-1; i < ogSubArray.length; i++, j--) {
			if(ogSubArray[i] != newSubArray[j]) {
				System.out.println("No Subarray exists");
				flag =1;
				break;
			}
		}
		
		if(flag != 1) {
			System.out.println(Arrays.toString(ogSubArray));
		}

	}

}
