package java_Refence240513;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[2][3];
		
		int[][] array1 = {
							{10,20,30},
							{40,50,60},
							{70,80,90}
						 };
		
		//--------------------------------------------
//		int[] arr1 = {10,20,30,40,50};
//		
//		int sum = 0;
//		for (int i=0;i<arr1.length;i++) {
//			sum += arr1[i];	
//		}
//		System.out.println(sum);
		
		// 향상된 for문
		int[] arr1 = {10,20,30,40,50};
		
		int sum = 0;
		for (int i : arr1) {
			sum += i;
		}
		System.out.println(sum);
			
			
			
	}
}
