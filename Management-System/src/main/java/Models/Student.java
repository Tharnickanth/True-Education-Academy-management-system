package Models;



public class Student {

    public String FirstName;
    public String LastName;
    public String Address;
    public String District;
    public String DOB;
    public String NIC;
    public String Gender;
    public String Email;
    public String TelephoneNo;
    public String StudentID;


    public Student(String FirstName,String LastName,String Address,String District,String DOB,String NIC,String Gender,String Email,String TelephoneNo,String StudentID) {
    
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.District=District;
        this.DOB=DOB;
        this.NIC=NIC;
        this.Gender=Gender;
        this.Email=Email;
        this.TelephoneNo=TelephoneNo;
        this.StudentID=StudentID;
    }

}

