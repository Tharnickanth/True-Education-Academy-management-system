
package ExceptionModels;


public class EventNameEmpty extends NullPointerException{

    @Override
    public String getMessage() {
        return "Enter the Event Name";
    }
    
    
}
