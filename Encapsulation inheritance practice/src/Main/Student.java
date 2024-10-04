package Main;

public class Student extends Person {
    private int StudentNumber;
    private float GPA;
    private String Section;
    
    public Student (String FN, String LN, int A, boolean M){
        super(FN, LN, A, M);
        
    }
    
    public Student (String FN, String LN, int A, boolean M, int SN){
        super(FN, LN, A, M);
        this.StudentNumber = SN;
    }
    
    public int getStudentNumber(){
        return this.StudentNumber;
    }
    
    public float getGPA(){
        return this.GPA;
    }
    
    public String getSection(){
        return this.Section;
    }
    
}
