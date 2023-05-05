package lec5_primary.coaches;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spending 30 minutes in batting practice";
    }
}
