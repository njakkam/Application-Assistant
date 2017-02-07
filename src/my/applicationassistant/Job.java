package my.applicationassistant;


public class Job {

    private String companyName;
    private String position;
    private String positionType;
    private String jobID;
    private String source;
    private String contactName;
    private String contactLinkedIn;
    
    public void setCompanyName(String value)
    {
        companyName=value;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public void setPosition(String value)
    {
        position=value;
    }
    public String getPosition()
    {
        return position;
    }
    public void setPositionType(String value)
    {
        positionType=value;
    }
    public String getPositionType()
    {
        return positionType;
    }
    public void setJobID(String value)
    {
        jobID=value;
    }
    public String getJobID()
    {
        return jobID;
    }
    public void setSource(String value)
    {
        source=value;
    }
    public String getSource()
    {
        return source;
    }
    public void setContactName(String value)
    {
        contactName=value;
    }
    public String getContactName()
    {
        return contactName;
    }
    public void setContactLinkedIn(String value)
    {
        contactLinkedIn=value;
    }
    public String getContactLinkedIn()
    {
        return contactLinkedIn;
    }
}
