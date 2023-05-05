package lec4_qualifiers.coaches;

import lec4_qualifiers.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}
