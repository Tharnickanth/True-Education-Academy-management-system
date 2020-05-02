
package Models;


public class eventList extends event {
    
    public String Description;
    public String StartTime;
    public String EndTime;
    public String Message;
    public String Venue;
    
    public eventList(String Description,String StartTime,String EndTime,String Message,String Venue,String ename, String date)
    {
        super(ename,date);
        this.Description=Description;
        this.Venue=Venue;
        this.StartTime=StartTime;
        this.EndTime=EndTime;
        this.Message=Message;
    }
    
    public eventList(String Description,String Message,String ename, String date)
    {
        super(ename,date);
        this.Description=Description;
        this.Message=Message;
    }
    
    public void updateEvent(String Description,String StartTime,String EndTime,String Message,String Venue,String ename, String date)
    {
        super.ename=ename;
        super.date=date;
        this.Description=Description;
        this.Venue=Venue;
        this.StartTime=StartTime;
        this.EndTime=EndTime;
        this.Message=Message;
    }  
    public void updateEvent(String Description,String Message,String ename, String date)
    {
        super.ename=ename;
        super.date=date;
        this.Description=Description;
        this.Message=Message;
    }
    
    
    
    
    
}
