package bitbit;

class Data {int x;}

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data(); //객체생성
		d.x = 10; 
		System.out.println("main()  x=" + d.x);
		
		change(d.x); //change 메소드 호출.
		System.out.println("After change(d.x)");
		System.out.println("main()  x = " + d.x );
	}
	
	static void change(int x) { //기본형 매개변수.-변수의값을 읽기만한다.
		x= 1000;
		System.out.println("change() : x= " + x);
	}
}