package lec8_bean_lifecycle_methods.coaches;

import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Primary // @Qualifier has a higher priority than @Primary
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 10k";
    }
}
