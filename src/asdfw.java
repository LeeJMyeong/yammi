
public class asdfw {

	public static void main(String[] args) {
//		159263
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
//		arr[0][0] arr[1][1] arr[2][2]
//		arr[0][1] arr[1][2]
//		arr[0][2]
		// i 0, 1, 2
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j < arr[i].length - i; j++) {
				System.out.print(arr[j][j + i]);
			}
		}
	}
}