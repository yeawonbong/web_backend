package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam03 { //Spring Bean DI

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); //이 부분만 바
		
		Car car = (Car)ac.getBean("car");
		car.run();
		
		System.out.println();
		((ConfigurableApplicationContext)ac).close();
	}
	
}
