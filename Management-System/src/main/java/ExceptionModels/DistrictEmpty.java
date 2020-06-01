
package ExceptionModels;


public class DistrictEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the District";
    }
    
    
    
}
