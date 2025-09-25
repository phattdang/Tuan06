package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("--- Testing Autowire byName ---");
        Department dept1 = (Department) context.getBean("dept1");
        System.out.println(dept1);

        System.out.println("\n--- Testing Autowire byType ---");
        Department dept3 = (Department) context.getBean("dept3");
        System.out.println(dept3);

        System.out.println("\n--- Testing Autowire by Constructor ---");
        Department dept4 = (Department) context.getBean("dept4");
        System.out.println(dept4);
    }
}
