
package ExceptionModels;


public class FirstNameEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the First Name";
    }
    
}
