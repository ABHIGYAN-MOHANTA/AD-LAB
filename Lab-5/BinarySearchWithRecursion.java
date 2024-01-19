
public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		int a[] = {1,5,7,8,9};
		int n = 1;
		int s = 0;
		int e = a.length -1;
		
		System.out.println("Element found at:" + binarySearch(a, n,s,e));

	}
	
	public static int binarySearch(int a[], int n, int s, int e) {
		if(s>e) {
			return -1;
		}
		int mid = (s+e)/2;
		if(a[mid] == n) {
			return mid;			
		}
		if(a[mid] > n) {
			return binarySearch(a, n, s, mid);
		}
		
		if(a[mid] < n) {
			return binarySearch(a, n, mid +1, e);	
		}
		
		return -1;
		
		}
	}
