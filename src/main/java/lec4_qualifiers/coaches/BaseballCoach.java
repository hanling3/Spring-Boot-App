package lec4_qualifiers.coaches;

import lec4_qualifiers.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spending 30 minutes in batting practice";
    }
}
