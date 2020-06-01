
package ExceptionModels;


public class GenderEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Gender not selected";
    }
    
}
