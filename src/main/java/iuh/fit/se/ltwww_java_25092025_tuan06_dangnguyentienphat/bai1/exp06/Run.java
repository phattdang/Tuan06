package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp06;

import iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.java_based.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyFormatService service = context.getBean(MyFormatService.class);
        service.printFormat();
    }
}
