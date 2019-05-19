package bitbit;

class Ex0605 {
	// [6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
	// [실행결과]
	// 홍길동,1,1,100,60,76,236,78.7

	public static void main(String args[]) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
	}
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
	return name
			+","+ban
			+","+no
			+","+kor
			+","+eng
			+","+math
			+","+getTotal()
			+","+getAverage();
}
}