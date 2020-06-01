
package ExceptionModels;


public class NICNumberEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the NIC Number";
    }
    
}
