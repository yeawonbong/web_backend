package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired //알아서 이 객체를 찾아서 주입하라는 뜻, setter가 필요없다.
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성자");
	}
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
//ComponentScan 한다면 이 메소드는 없어도 됨.
	
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
