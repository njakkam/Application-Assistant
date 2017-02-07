package my.applicationassistant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import sun.security.util.Password;


public class ApplicationSystem {
    
    LinkedList<User> users=new LinkedList<User>();
    
    public boolean addNewUser(String email, String password) throws Exception
    {
        
        if(ifUserExists(email))
            return false;
        try {
         FileOutputStream fileOut = new FileOutputStream("/tmp/users.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         
         out.writeObject(new User(email,password));
         out.close();
         fileOut.close();
        }
        catch(IOException i) {
         i.printStackTrace();
      }
        return true;
    }
    
    public boolean ifUserExists(String email) throws IOException
    {
        try{
        User u=null;
        FileInputStream fileIn = new FileInputStream("/tmp/users.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        while(true)
        {
            u=(User)in.readObject();
            
            if(u.toString().contains(email))
            {
                in.close();
                fileIn.close();
                return true;
            }
            
        }
        
        }
        catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
        }
        return false;
    }
    
    
    public boolean isValidUser(String email, String password) throws IOException
    {
        
        try{
        User u=null;
        FileInputStream fileIn = new FileInputStream("/tmp/users.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        while(true)
        {
            u=(User)in.readObject();
            
            if(u.toString().contains(email)&&u.toString().contains(password))
            {
                in.close();
                fileIn.close();
                return true;
            }
            
        }
        
        }
        catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
        }
        return false;
    }
   
    

}
