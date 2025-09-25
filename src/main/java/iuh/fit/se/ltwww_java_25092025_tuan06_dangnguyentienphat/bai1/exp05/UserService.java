package iuh.fit.se.ltwww_java_25092025_tuan06_dangnguyentienphat.bai1.exp05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {
    @Bean
    public Group groupService() {
        return new Group(1, "Admin Group");
    }

    @Bean
    public User userSevice() {
        return new User(1, "User 01", "123456", groupService());
    }
}
