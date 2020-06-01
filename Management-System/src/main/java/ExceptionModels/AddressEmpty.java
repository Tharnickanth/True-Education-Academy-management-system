
package ExceptionModels;

public class AddressEmpty extends NullPointerException{

    @Override
    public String getMessage() {
        return "Enter the Address";
    }
    
}
