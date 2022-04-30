/**
 * Subject Interface
 */
import java.time.LocalDateTime;

public interface JobProvider {
    public void acceptApplication(JobSeeker pJobSeeker); 
    public void sendOffer(JobSeeker pJobSeeker);
    public LocalDateTime getInterviewSchedule();
}
