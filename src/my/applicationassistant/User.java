package my.applicationassistant;


public class User implements java.io.Serializable{
    private String email;
    private String password;
    
    public User(String email, String password)
    {
        this.email=email;
        this.password=password;
    }
    
    public User(){}
    
    public void setEmail(String value)
    {
        email=value;
    }
    public String getEmail()
    {
        return email;
    }
    public void setPassword(String value)
    {
        password=value;
    }
    public String getPassword()
    {
        return password;
    }

}
