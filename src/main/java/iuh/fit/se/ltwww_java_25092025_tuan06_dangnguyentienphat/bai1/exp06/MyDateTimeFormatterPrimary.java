package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp06;

import org.springframework.stereotype.Component;

@Component("myDateTimeFormatter")
public class MyDateTimeFormatterPrimary implements MyFormatter {
    @Override
    public String format(String data) {
        return "MyDateTimeFormatter";
    }
}
