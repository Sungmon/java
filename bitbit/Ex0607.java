package bitbit;

public class Ex0607 {
//	[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
//	드로 정의하시오.

	class MyPoint {
		int x;
		int y;

		MyPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}

		double getDistance(int x1, int y1) {
			return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
		}
	}

	class Exercise6_7 {
		public void main(String args[]) {
			MyPoint p = new MyPoint(1, 1);

			// p와 (2,2)의 거리를 구한다.
			System.out.println(p.getDistance(2, 2));
		}
	}
}