package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // xml based
        Address a1 = (Address) context.getBean("addressBean");
        Employee e1 = (Employee) context.getBean("employeeBean");

        System.out.println(a1);
        System.out.println(e1);
    }
}
