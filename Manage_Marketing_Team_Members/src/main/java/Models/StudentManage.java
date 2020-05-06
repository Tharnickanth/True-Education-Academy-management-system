/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
package Models;

public class StudentManage {

    public String FirstName;
    public String LastName;
    public String Address;
    public String District;
    public String NIC;
    public String DOB;
    public String Email;
    public String TelephoneNo;

    public StudentManage(String fName, String lName, String Address, String District, String NIC, String DOB, String Email, String tNo) {
        this.FirstName = fName;
        this.LastName = lName;
        this.Address = Address;
        this.District = District;
        this.NIC = NIC;
        this.DOB = DOB;
        this.Email = Email;
        this.TelephoneNo = tNo;
    }

}
