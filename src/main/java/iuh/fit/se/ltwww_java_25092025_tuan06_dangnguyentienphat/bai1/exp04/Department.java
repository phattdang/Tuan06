package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp04;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Department {
    String id;
    String name;
    Faculty faculty;
}
