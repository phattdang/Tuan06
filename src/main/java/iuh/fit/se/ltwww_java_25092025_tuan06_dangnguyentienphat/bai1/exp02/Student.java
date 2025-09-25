package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp02;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

public class Student {
    String id;
    String name;
    Class_ class_;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
