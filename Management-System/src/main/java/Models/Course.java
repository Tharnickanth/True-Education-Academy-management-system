/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author SM Tharshan
 */
public class Course {
    private String CCode;
    private String CName;
    private float CFee;
    private int CDuration;
    private String Lecturer;
    
    public Course(String CCode,String CName,float CFee,int CDuration,String Lecturer){
        this.CCode=CCode;
        this.CName=CName;
        this.CFee=CFee;
        this.CDuration=CDuration;
        this.Lecturer=Lecturer;
    }
    public String GetCCode(){
        return CCode;
    }
    public String GetCName(){
        return CName;
    }
    public float GetCFee(){
        return CFee;
    }
    public int GetCDuration(){
        return CDuration;
    }
    public String GetLecturer(){
        return Lecturer;
    }
    
    
    
}
