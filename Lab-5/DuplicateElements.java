
public class DuplicateElements {

	public static void main(String[] args) {
		int a[] = {2,6,2,5,77,84,44,23,44};
		
		for(int i =0; i< a.length - 1; i++) {
			for(int j =0; j< a.length -i-1;j++ ) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		int n = a[0] -1;
		
		for(int i =0; i< a.length -1; i++) {
			if(a[i] == a[i+1]) {
				if(n != a[i]) {
					System.out.println(a[i]);
					n = a[i];
				}
			}
		}

	}

}
