package lec9_java_config_bean.rest;

import lec9_java_config_bean.coaches.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    // define a private field for the dependency
    private Coach myCoach;

    /* Spring Injection Types:
        * Constructor Injection
        *   -- use it for required dependencies
        * Setter Injection
        *   -- use it for optional dependencies
     */

    // define a constructor for dependency injection
    @Autowired
    public CoachController(@Qualifier("acquatic") Coach c) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = c;
    }

    // Setter Injection
//    @Autowired
//    public void setCoach(Coach c) {
//        myCoach = c;
//    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
