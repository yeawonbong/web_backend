package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam04 { //Spring Bean DI

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig2.class); //이 부분만 바
		
//		Car car = (Car)ac.getBean("car"); // Application Config에 선언된 변수 이름으 지
		Car car = (Car)ac.getBean(Car.class); // 클래스.class -> 타입 자체로 클래스 인스턴스를 받아온다.
		car.run();
		
		System.out.println();
		((ConfigurableApplicationContext)ac).close();
	}
	
}
