
package ExceptionModels;


public class DateOfBirthEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Date of Birth not selected";
    }
    
    
    
}
