package lec7_bean_scopes.rest;

import lec7_bean_scopes.coaches.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    /* Spring Injection Types:
        * Constructor Injection
        *   -- use it for required dependencies
        * Setter Injection
        *   -- use it for optional dependencies
     */

    // define a constructor for dependency injection
    @Autowired
    public CoachController(
            @Qualifier("cricketCoach") Coach c,
            @Qualifier("cricketCoach") Coach a
            // Default scope is Singleton
            // ==> All dependency injections for the bean will reference the SAME bean
    ) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = c;
        anotherCoach = a;
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

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
        // Singleton: true;
        // Prototype: false;
    }


}
