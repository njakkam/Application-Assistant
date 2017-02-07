package my.applicationassistant;

import java.util.Date;


public class University {
    
    private String universityName;
    private String program;
    private String programType;
    private String applicationID;
    private String term;
    private Date deadline;
    private String documentsRequired;
    private boolean isDocumentsSubmitted;
    
    public void setUniversityName(String value)
    {
        universityName=value;
    }
    public String getUniversityName()
    {
        return universityName;
    }
    public void setProgram(String value)
    {
        program=value;
    }
    public String getProgram()
    {
        return program;
    }
    public void setProgramType(String value)
    {
        programType=value;
    }
    public String getProgramType()
    {
        return programType;
    }
    public void setApplicationID(String value)
    {
        applicationID=value;
    }
    public String getApplicationID()
    {
        return applicationID;
    }
    public void setTerm(String value)
    {
        term=value;
    }
    public String getTerm()
    {
        return term;
    }
    public void setDeadline(Date value)
    {
        deadline=value;
    }
    public Date getDeadline()
    {
        return deadline;
    }
    public void setDocumentsRequired(String value)
    {
        documentsRequired=value;
    }
    public String getDocumentsRequired()
    {
        return documentsRequired;
    }
    public void setIsDocumentsSubmitted(boolean value)
    {
        isDocumentsSubmitted=value;
    }
    public boolean getIsDocumentsSubmitted()
    {
        return isDocumentsSubmitted;
    }

}
