
public class Question1 {
	public static void swap(int arr[], int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
		
	}
	public static void main(String[] args) {
		int [] arr = { 10, 3, -3, 23, 42, 2, 4,23};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
