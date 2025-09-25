package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai2.annotation_based;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Component
public class Address {
    String city = "HCM";
    String state = "Nothing there!";
    String country = "Viet Nam";
}
