package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.java_based;

import iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {
        // java based

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e1 = context.getBean(Employee.class);
        System.out.println(e1);
    }
}
