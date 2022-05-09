import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		String[] arr = new String[]{
			"Hello", "My", "Name", "Is", "Aadi", "Jha"
		};
		for(int i = arr.length-1, j = 0; i >= arr.length/2; i--){
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
