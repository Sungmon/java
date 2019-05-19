package bitbit;

class Exercise6_2 {
//	[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
//	결과와 같은 결과를 얻도록 하시오.
//		 [실행결과]
//			31
//			K
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

public class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this.num = 1;
		this.isKwang = true;

	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}