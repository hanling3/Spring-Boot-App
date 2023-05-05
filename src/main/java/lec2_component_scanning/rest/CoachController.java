package lec2_component_scanning.rest;

import lec2_component_scanning.Coach;
import org.springframework.beans.factory.annotation.Autowired;
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
//    @Autowired
//    public CoachController(Coach c) {
//        myCoach = c;
//    }

    // Setter Injection
    @Autowired
    public void setCoach(Coach c) {
        myCoach = c;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
