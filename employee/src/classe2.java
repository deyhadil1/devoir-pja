
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
public class classe2{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Employee[] e = null;
        try{
             FileInputStream fileIn = new FileInputStream("emp.dat");
             ObjectInputStream in = new ObjectInputStream(fileIn);
             e = (Employee[]) in.readObject();
             in.close();
             fileIn.close();
        }catch(IOException is){
            is.printStackTrace();
            return;
        }  
        catch(ClassNotFoundException c){
            System.out.println("classe Employee non trouvee");
            c.printStackTrace();
            return;
        }
        System.out.println("Employee deserialise...");
        for (i=0;i<e.length;i++) {
            System.out.println("Nom: " + e[i].name);
            System.out.println("address: " + e[i].address);
            System.out.println("SSN: " + e[i].SSN);
            System.out.println("number: " + e[i].number);
        }
        RandomAccessFile ran = new RandomAccessFile("empdirect.dat", "rw");
        for (int i=0; i<e.length; i++) {
            ran.writeBytes(e[i].name + " " + e[i].address + " " + e[i].SSN + " " + e[i].number + " ");
        }
        
    }
}