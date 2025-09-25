package fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.java_based;

import fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        // java based

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e1 = context.getBean(Employee.class);
        System.out.println(e1);
    }
}
