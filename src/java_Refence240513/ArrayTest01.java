package java_Refence240513;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayInt = {1,2,3,4,5};
		double[] arrayDouble = {1.1,2.2};
		String[] arrayStr = {"korea","japan","usa"};
		
		// int[] arrayTest = null;
		
		
		int[] arrayTest2 = new int[5];  //5칸이 메모리에 만들어지고 각칸에 0이 초기값으로자동충전됨
		
		for (int i=0;i<5;i++) {			
			System.out.println(arrayTest2[i]);
		}

		for (int i=0;i<arrayTest2.length;i++) {			
			System.out.println(arrayTest2[i]);
		}
		
		
		
		
		
		

	}

}
