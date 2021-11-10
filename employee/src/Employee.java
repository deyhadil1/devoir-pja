
import java.io.*;
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number; 
public Employee(String name,String address, int SSN1, int number){
    
}
    public void mailCheck(){
        System.out.println("Mail de verification de "+ name + " " + address);
    }
}