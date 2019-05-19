package bitbit;

public class Ex0618 {
//	[6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
//	이유를 설명하시오.

//	class MemberCall {
//		int iv = 10;
//		static int cv = 20;
//		int iv2 = cv;
//		static int cv2 = iv; // 라인 A static 변수안에 인스턴스변수 사용 x
//
//		static void staticMethod1() { //static 메소드 안에 인스턴스변수 사용 x
//			System.out.println(cv);
//			System.out.println(iv); // 라인 B
//		}
//
//		void instanceMethod1() {
//			System.out.println(cv);
//			System.out.println(iv); // 라인 C
//		}
//
//		static void staticMethod2() { //static 메소드 안에 인스턴스메소드 사용 x
//			staticMethod1();
//			instanceMethod1(); // 라인 D
//		}
//
//		void instanceMethod2() {
//			staticMethod1(); // 라인 E
//			instanceMethod1();
//		}
//	}
//
//}
