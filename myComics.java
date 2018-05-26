/*
 * Mjolinir
 * CSC 225
 * Lab 9 Client Class
 * 
 */
public class myComics
{
    public static void main(String[] args)
    {
        String str;
        int i;
        
        Comics cb1 = new Comics();
        
        cb1.setName("Batman");
        cb1.setPublisher("DC");
        cb1.setIssue(154);
        cb1.setYear(1983);
        
        System.out.println("Name: " + cb1.getName() + "\n" +
                           "Publisher: " + cb1.getPublisher() + "\n" +
                           "Issue: " + cb1.getIssue() + "\n" +
                           "Year: " + cb1.getYear() + "\n");
                           
        Comics cb2 = new Comics("Thor", "Marvel", 348, 1971);
        
        System.out.println(cb2.toString());
       
    }
}

