public class BinarySearchWithoutRecursion {

	public static void main(String[] args) {
		int a[] = {1,5,7,8,9};
		int n = 1;
		int s = 0;
		int e = a.length -1;
		int mid;
		while(s<e) {
			mid = (s+e)/2;
			if(a[mid] == n) {
				System.out.println("Element found at: "+mid);
				break;
			}
			if(a[mid] > n) {
				e = mid;
			}
			
			if(a[mid] < n) {
				s = mid+1;
			}
		}

	}

}
