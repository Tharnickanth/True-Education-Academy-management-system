package Models;

public class NewStudent {

    public String FirstName;
    public String LastName;
    public String Address;
    public String District;
    public String NIC;
    public String DOB;
    public String Email;
    public String TelephoneNo;

    public NewStudent(String fName, String lName, String Address, String District, String NIC, String DOB, String Email, String tNo) {
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
