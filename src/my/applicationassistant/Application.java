package my.applicationassistant;

import java.util.Date;


public class Application {
    
    protected String applicationID;
    protected String organizationName;
    protected Date dateOfApplication;
    protected String emailUsed;
    protected String passwordUsed;
    protected String applicationStatus;
    protected String organizationAddress;
    protected String contactEmail;
    protected String contactPhone;
    protected String referralName;
    protected String referralEmail;
    protected String referralPhone;
    protected String comments;
    
    //Should we have just set methods or constructor also? because there are many variables and we would have to take a lot of arguments.
    //If user keeps non mandatory fields empty, we will have to make a set of passed arguments in the contructors which will be stupid.
    
    public void setApplicationID(String value)
    {
        applicationID=value;
    }
    public String getApplicationID()
    {
        return applicationID;
    }
    
    public void setOrganizationName(String value)
    {
        organizationName=value;
    }
    public String getOrganizationName()
    {
        return organizationName;
    }
    
    public void setDateOfApplication(Date value)
    {
        dateOfApplication=value;
    }
    public Date getDateOfApplication()
    {
        return dateOfApplication;
    }
    
    public void setEmailUsed(String value)
    {
        emailUsed=value;
    }
    public String getEmailUsed()
    {
        return emailUsed;
    }

    public void setPasswordUsed(String value)
    {
        passwordUsed=value;
    }
    public String getPasswordUsed()
    {
        return passwordUsed;
    }
    
    public void setApplicationStatus(String value)
    {
        applicationStatus=value;
    }
    public String getApplicationStatus()
    {
        return applicationStatus;
    }
    
    public void setOrganizationAddress(String value)
    {
        organizationAddress=value;
    }
    public String getOrganizationAddress()
    {
        return organizationAddress;
    }
    
    public void setContactEmail(String value)
    {
        contactEmail=value;
    }
    public String getContactEmail()
    {
        return contactEmail;
    }
    
    public void setContactPhone(String value)
    {
        contactPhone=value;
    }
    public String getContactPhone()
    {
        return contactPhone;
    }
    
    public void setReferralName(String value)
    {
        referralName=value;
    }
    public String getReferralName()
    {
        return referralName;
    }
    
    public void setReferralEmail(String value)
    {
        referralEmail=value;
    }
    public String getReferralEmail()
    {
        return referralEmail;
    }
    
    public void setReferralPhone(String value)
    {
        referralPhone=value;
    }
    public String getReferralPhone()
    {
        return referralPhone;
    }
    
    public void setComments(String value)
    {
        comments=value;
    }
    public String getComments()
    {
        return comments;
    }
}
