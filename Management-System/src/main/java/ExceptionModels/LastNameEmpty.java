
package ExceptionModels;


public class LastNameEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the Last Name";
    }
    
    
}
