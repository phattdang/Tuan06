package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyFormatService {
    @Autowired
    private MyFormatter formatter;

    public void printFormat() {
        System.out.println(formatter.format("Example data"));
    }
}
