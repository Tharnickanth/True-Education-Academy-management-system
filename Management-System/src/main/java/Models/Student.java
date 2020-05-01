package Models;

public class Student extends NewStudent {

    public String SID;
    public String CourseName;
    public String code;
    public String Batch;
    public String DegreeName;


    public Student(String SID, String CourseName, String code, String Batch, String fName, String lName, String Address, String District, String NIC, String DOB, String Email, String tNo) {

        super(fName, lName, Address, District, NIC, DOB, Email, tNo);
        this.SID = SID;
        this.CourseName = CourseName;
        this.code = code;
        this.Batch = Batch;

    }

   
}
