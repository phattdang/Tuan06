package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.xml_based;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Employee {
    int id;
    String name;
    Address address;
}
