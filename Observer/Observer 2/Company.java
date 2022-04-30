/**
 * Concrete Subject
 */

import java.time.LocalDateTime;

public class Company implements JobProvider {
    private LocalDateTime aInterviewSchedule;

    /**
     * Notify the Job Seeker that their application has been accepted
     */
    @Override
    public void acceptApplication(JobSeeker pJobSeeker) {
        assert pJobSeeker != null; 
        scheduleInterview();
        pJobSeeker.receiveInterviewOffer(); // callback method
    }

    /**
     * Set up interview date for three days from today
     */
    private void scheduleInterview() {
        aInterviewSchedule = LocalDateTime.now().plusDays(3);
    }

    /**
     * Allows the Job Seeker to view their interview time
     */
    public LocalDateTime getInterviewSchedule() {
        return aInterviewSchedule;
    }

    /**
     * Notify the Job Seeker that the company has sent them an offer
     */
    @Override
    public void sendOffer(JobSeeker pJobSeeker) {
        assert pJobSeeker != null; 
        pJobSeeker.receiveJobOffer(); // callback method
    }
}
