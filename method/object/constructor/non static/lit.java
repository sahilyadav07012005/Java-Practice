class lit 
{
    String faculty_name = " Chandra_sir ";
    
    private lit() 
    {
        System.out.println("lit() constructor ...");
    }
}

class CVRaman 
{
    public static void main (String [] args) 
    {
        lit college = new lit();
        System.out.println("Faculty Name is:"+college.faculty_name);
    }
}