package fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.java_based;

import fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based.Address;
import fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address(){
        return new Address("HCM", "Khu 04", "Viet Name");
    }

    @Bean
    public Employee employee(){
        return new Employee(1, "Phat Dang", address());
    }
}
