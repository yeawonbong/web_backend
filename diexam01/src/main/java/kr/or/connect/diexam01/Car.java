package kr.or.connect.diexam01;

public class Car {
	
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
	
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec(); 
	}
	
//	public static void main(String[] args) {
//		Engine e = new Engine();
//		Car car = new Car();
//		car.setEngline(e);
//		car.run();
//	}
//	
	//이러한 객체 생성의 과정을 이제 Spring의 IoC컨테이너가 만들어 것이다.
	//그러려면 설정파일에 Bean들을 등록해줘야한다. (ApplicationContext.xml)

}
