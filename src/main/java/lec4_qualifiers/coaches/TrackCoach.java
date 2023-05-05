package lec4_qualifiers.coaches;

import lec4_qualifiers.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 10k";
    }
}
