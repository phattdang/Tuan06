package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Run {
    public static void main(String[] args) {
        // annotation based
        ApplicationContext context = new AnnotationConfigApplicationContext(Run.class);

        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
    }
}
