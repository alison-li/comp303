/**
 * Concrete Observer
 */

import java.time.LocalDateTime;

public class UndergradStudent implements JobSeeker {
    private int aSkillLevel = 5;
    private LocalDateTime aInterviewDate;
    private JobProvider aJobProvider;

    public void applyToCompany(JobProvider pJobProvider) {
        aJobProvider = pJobProvider;
    }

    @Override
    public void receiveInterviewOffer() {
        practiceLeetcode();
        aInterviewDate = aJobProvider.getInterviewSchedule(); // pull model
        System.out.println("My interview date is " + aInterviewDate);
    }

    @Override
    public void receiveJobOffer() {
        System.out.println("I have received a job offer!");
    }

    public void practiceLeetcode() {
        aSkillLevel++;
        System.out.println("My skill level has increased to " + aSkillLevel);
    }
}
