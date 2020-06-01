
package ExceptionModels;


public class EventIDEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the Event ID";
    }
    
    
}
