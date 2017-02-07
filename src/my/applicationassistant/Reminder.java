package my.applicationassistant;

import java.util.Date;


public class Reminder {
    private String applicationID;
    private String reminderTitle;
    private Date dateAndTime;
    private String companyName;
    private String reminderStatus;
    
    public void setReminderTitle(String value)
    {
        reminderTitle=value;
    }
    public String getReminderTitle()
    {
        return reminderTitle;
    }
    public void setDateAndTime(Date value)
    {
        dateAndTime=value;
    }
    public Date getDateAndTime()
    {
        return dateAndTime;
    }
    public void setCompanyName(String value)
    {
        companyName=value;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public void setApplicationID(String value)
    {
        applicationID=value;
    }
    public String getApplicationID()
    {
        return applicationID;
    }
    public void setReminderStatus(String value)
    {
        reminderStatus=value;
    }
    public String getReminderStatus()
    {
        return reminderStatus;
    }

}
