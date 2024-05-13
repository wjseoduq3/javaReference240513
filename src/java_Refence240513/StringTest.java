package java_Refence240513;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if (str1 == str2) {
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
		
		String strObject1 = new String("홍길동");
		String strObject2 = new String("홍길동");
		
		if (strObject1 == strObject2) {
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
		
		if (strObject1.equals(strObject2)) {
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
		
		
		
	}

}
