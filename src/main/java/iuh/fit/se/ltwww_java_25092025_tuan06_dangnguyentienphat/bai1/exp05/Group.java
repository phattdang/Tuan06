package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp05;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Group {
    int id;
    String groupName;
}
