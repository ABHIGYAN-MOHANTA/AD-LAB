
public class Question3 {

	public static void swap(int arr[], int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
		
	}
	
	public static void main(String[] args) {
		int [] arr = { 10, 3, -3, 23, 42, 2, 4,23};
		for(int i = 0; i<arr.length; i++) {
			int min = arr[i];
			int min_idx = i;
			int j;
			for(j = i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					min_idx = j;
				}
			}
			if(arr[i]>min) {
				swap(arr, i, min_idx);
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
