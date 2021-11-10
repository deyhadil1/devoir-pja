import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class classe1 {
    public static void main(String[] args) {
       Scanner nbr = new Scanner(System.in);
       try
       {
           System.out.print("indiauer le nombre d'objets à sérialiser");
           int nbre = nbr.nextInt();
           Employee [] e = new Employee[nbre];
           for(int i=0; i<nbre; i++){
                System.out.printf("employee %d:\n",i+1);
                System.out.println("enter le nom:");
                String name =nbr.next();
                System.out.println("enter l'address:");
                String address = nbr.next();
                System.out.println("enter le SSN:");
                int SSN =nbr.nextInt();
                System.out.println("enter le numero:");
                int number =nbr.nextInt();
                e[i]= new Employee(name,address,SSN,number);
                FileOutputStream fileOut = new FileOutputStream("emp.dat");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                fileOut.close();
                out.writeObject(e);
                out.close();
                
           }
           System.out.printf("donnees serialisees sauvegardees dans emp.dat");
       }
       catch(IOException ix)
       {
           ix.printStackTrace();
       }
    }
}