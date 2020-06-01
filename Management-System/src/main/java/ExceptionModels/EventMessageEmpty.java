
package ExceptionModels;


public class EventMessageEmpty extends NullPointerException{

    @Override
    public String getMessage() {
        return "Enter the Message";
    }
    
}
