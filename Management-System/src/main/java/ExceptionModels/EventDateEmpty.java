/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionModels;

/**
 *
 * @author Tharnickanth
 */
public class EventDateEmpty extends NullPointerException{

    @Override
    public String getMessage() {
        return "Date not selected";
    }
    
}
