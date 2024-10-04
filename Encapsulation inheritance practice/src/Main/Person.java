
package Main;

public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    boolean isMale;
    
    public Person (String FN, String LN, int A, boolean M){
        this.FirstName = FN;
        this.LastName = LN;
        this.Age = A;
        this.isMale = M;
    }
    
    public String getFirstName(){
        return this.FirstName;
    }
    
    public String getLastName(){
        return this.LastName;
    }
    
    public int getAge(){
        return this.Age;
    }
    
    //returns true if male, otherwise false
    public boolean getGender(){
        return isMale;
    }
    
    public void setFirstName(String fn){
        this.FirstName = fn;
    }
    
    public void setLastName(String ln){
        this.LastName = ln;
    }
    
    public void setAge(int A){
        this.Age = A;
    }
    
    //if true, sets gender to male
    public void setGender(boolean m){
        this.isMale = m;
    }
    
}
