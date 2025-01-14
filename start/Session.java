/**
 * Name class: Session
 * Date: 14 January 2025
 * Author: Taing Veng Chhay
 * Collarborators: Huoth Sitha
 * Modified: 14 January 2025
 * Description: A class that testing the Subject class
 * Functions:
 * - setDuration(int, int): void
 * Variables:
 * -= startTime: int
 * -= endTime: int
 */
public class Session {

    private String sessionName;
    private int startTime;
    private int endTime;

    public Session(String sessionName, int startTime, int endTime){
        this.sessionName = sessionName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getSessionName(){
        return sessionName;
    }

    public void setSessionName(String sessionName){
        this.sessionName = sessionName;
    }

    public int getStartTime(){
        return startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public void setDuration(int startTime, int endTime){
        if(startTime >= endTime){
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static void main(String[] args) {

    }
}
