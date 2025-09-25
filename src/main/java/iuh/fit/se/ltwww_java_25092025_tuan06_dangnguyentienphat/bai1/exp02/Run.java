package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);

        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);

        Student student3 = context.getBean("student3", Student.class);
        System.out.println(student3);
    }
}
