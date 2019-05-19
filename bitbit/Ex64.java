package bitbit;

class TvTest4 {
	public static void main(String args[]) {
		Tv4[] tvArr = new Tv4[3]; //클래스이름과 동일한 객체이름
		//Tv4에 3개의 배열생성.
		
		for(int i =0; i < tvArr.length; i++) {
			tvArr[i] = new Tv4(); //[i]의 값 선언과 동시에 값지정
			tvArr[i].channel = i +10; //tvArr[i]의 channel에 i+10
			                          //을 저장
		}

		for(int i=0; i <tvArr.length;i++) {
			tvArr[i].channelUp(); //tvArr[i]의 메서드 호출. 채널이 1증가.
			System.out.printf("tvArrp[%d].channel = %d%n",i,
					tvArr[i].channel);
		}
	}
}
class Tv4 {
	String color;
	boolean power;
	int channel;
	
	void power () {power = !power;}
	void channelUp() {++channel; } //이 메서드를 불러오면 채널이 1증가.
	void channelDown() {--channel;}//이 메서드를 불러오면 채널이 1감소.
}