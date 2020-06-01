
package ExceptionModels;

public class StudentIDEmpty extends NullPointerException {

    @Override
    public String getMessage() {
        return "Enter the Student ID";
    }
    
}
