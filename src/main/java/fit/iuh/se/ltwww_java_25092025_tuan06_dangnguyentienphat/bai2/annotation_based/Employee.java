package fit.iuh.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.annotation_based;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Component

public class Employee {
    int id = 1;
    String name = "Tien Phat";
    @Autowired
    Address address;
}
