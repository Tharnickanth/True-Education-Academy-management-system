
package Models;


public class CertificateStudent extends Student {
    public String Program;
    
    public CertificateStudent(String FirstName,String LastName,String Address,String District,String DOB,String NIC,String Gender,String Email,String TelephoneNo,String StudentID,String Program) {
        super(FirstName,LastName,Address,District,DOB,NIC,Gender,Email,TelephoneNo,StudentID);
        this.Program=Program;
        
    }

   
    public String getFirstName()
    {
        return super.FirstName;
    }
    public String getLastName()
    {
        return super.LastName;
    }
    public String getDistrict()
    {
        return super.District;
    }
    public String getDOB()
    {
        return super.DOB;
    }
    public String getNIC()
    {
        return super.NIC;
    }
    public String getGender()
    {
        return super.Gender;
    }
    public String getEmail()
    {
        return super.Email;
    }
    public String getTelephone()
    {
        return super.TelephoneNo;
    }
    public String getStudentID()
    {
        return super.StudentID;
    }
    public String getProgram()
    {
        return this.FirstName;
    }
    
}
