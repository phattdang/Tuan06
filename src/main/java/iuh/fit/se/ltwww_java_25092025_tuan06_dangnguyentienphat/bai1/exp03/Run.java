package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp03;

import iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp02.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person p1 = context.getBean("person", Person.class);
        System.out.println(p1);
    }
}
