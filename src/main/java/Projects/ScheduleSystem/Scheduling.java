package Projects.ScheduleSystem;

public class Scheduling {
    private User user;
    private Service service;
    private int hour;

    public Scheduling(User user, Service service, int hour){
        this.user = user;
        this.service = service;
        this.hour = hour;
    }
    public int getHour(){return hour;}
    public User getUser(){return user;}
    public Service getService(){return service;}
}
