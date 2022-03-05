package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext( 
				"classpath:applicationContext.xml"); // 인스턴스가 생성될 때 인자의 xml파일 내에 등록 Bean들에 연결된 객체을 모두 메모리에 올린다.  
//		System.out.println("초기화 완료.");
//		
//		UserBean userBean = (UserBean)ac.getBean("userBean");
//		userBean.setName("kim");
//		System.out.println(userBean.getName());
//		
//		UserBean userBean2 = (UserBean)ac.getBean("userBean");
//		if(userBean == userBean2) {
//			System.out.println("같은 인스턴스이다.");
//		}
		
	}
}