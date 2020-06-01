package Models;

public class Event {

    public String ename;
    public String eID;
    public String Description; 
    public String Message;
    public String Eventdate;
    public String StartTime;
    public String EndTime;  
    public String Venue;
    

     public Event(String ename,String eID,String Description,String Message,String date,String StartTime,String EndTime,String Venue)
    {
       this.ename=ename;
       this.eID=eID;
       this.Description=Description;
       this.Message=Message;
       this.Eventdate=date;
       this.StartTime=StartTime;
       this.EndTime=EndTime;
       this.Venue=Venue;
    }
}
