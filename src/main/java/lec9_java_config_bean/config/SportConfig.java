package lec9_java_config_bean.config;

import lec9_java_config_bean.coaches.Coach;
import lec9_java_config_bean.coaches.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("acquatic")
    public Coach swimCoach() {
        return new SwimCoach();
        // The bean id defaults to the method name
    }

    // @Bean use case:
    // Take existing 3rd party class and expose as a Spring bean
}
