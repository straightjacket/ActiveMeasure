package rest.activemeasure.org.activemeasure;

/**
 * Created by nevelex on 6/12/17.
 */

public class QResultClass
{
    private String ID;

    private String EMAIL_ADDRESS;

    private String USER;

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getEMAIL_ADDRESS ()
    {
        return EMAIL_ADDRESS;
    }

    public void setEMAIL_ADDRESS (String EMAIL_ADDRESS)
    {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    public String getUSER ()
    {
        return USER;
    }

    public void setUSER (String USER)
    {
        this.USER = USER;
    }

    @Override
    public String toString()
    {
        return "ClassQResult [ID = "+ID+", EMAIL_ADDRESS = "+EMAIL_ADDRESS+", USER = "+USER+"]";
    }
}