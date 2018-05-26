/*
 * Mjolinir
 * CSC 225
 * Lab 9 Server Class
 * 
 */
public class Comics
{
    //Instance variables
    private String name;
    private String publisher;
    private int issue;
    private int year;
    
    //Constructor Methods
    public Comics()
    {
        name = " ";
        publisher = " ";
        issue = 0;
        year = 0;
    }
    
    public Comics(String n, String p, int i, int y)
    {
        name = n;
        publisher = p;
        issue = i;
        year = y;
    }
    
    //Mutator methods
    public void setName (String n)
    {
        name = n;
    }
    
    public void setPublisher (String p)
    {
        publisher = p;
    }
    
    public void setIssue (int i)
    {
        issue = i;
    }
    
    public void setYear (int y)
    {
        year = y;
    }
    
    //Accessor methods
    public String getName()
    {
        return name;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public int getIssue()
    {
        return issue;
    }
    
    public int getYear()
    {
        return year;
    }
    
    //Other methods
    public String toString()
    {
        String str;
        str = "Name ..............:     " + name + "\n" +
              "Publisher .........:     " + publisher + "\n" +
              "Issue .............:     " + issue + "\n" +
              "Year ..............:     " + year + "\n";
        return str;
    }
}
