package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserService.class);

        User user = context.getBean(User.class);
        System.out.println(user);

        Group group = context.getBean(Group.class);
        System.out.println(group);
    }
}
