package bitbit;

public class Ex0619 {
	// [6-19] 다음 코드의 실행 결과를 예측하여 적으시오.

	public static void change(String str) {
		// 3-1
		str += "456";
		
		// 3-2
		System.out.println("change str: " + str);
	}
	public static void main(String[] args) {
		String str = "ABC123"; // 1
		
		
		System.out.println(str); // ABC123         //2  
		change(str); //3
			
		// 4 
		System.out.println("After change:" + str);  // ABC123 
													
	}
}



