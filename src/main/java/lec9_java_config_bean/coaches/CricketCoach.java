package lec9_java_config_bean.coaches;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 1 hour";
    }

//    // define init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
//    }
//
//    // define destory method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
//    }

    // For "prototype" scoped beans, Spring does not call the destroy method.
    // Prototype beans are lazy by default.
}
