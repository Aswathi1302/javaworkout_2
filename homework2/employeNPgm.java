public class employeNPgm { 
    public static void main(String[] args){ 
        employee s1 = new employee(); 
        System.out.println("Employee Name = " + s1.name);
        System.out.println("Employee Id = " +s1.id);
        employee s2 = new employee(89,90,93); 
        s2.add();
        s2.check(); 
        
     } 
}
class employee{ 

    int id; 
    String name; 
    int ass1; 
    int ass2; 
    int ass3;
    int sum;
    double percentage; 

    employee()
    {
        name = "Aswathi";
        id = 23456;
    }
    public employee(int x, int y, int z) { 
        ass1 = x; 
        ass2 = y; 
        ass3 = z; 
    }
    void add()
    { 
        int sum=ass1+ass2+ass3;
        System.out.println("Total=" + sum); 
        percentage = (sum*100)/3; 
        System.out.println("Percentag=" + percentage); 
         
    } 
    void check()
    {     
        if(ass1>=75 || ass2>=75 || ass3>=75)
            System.out.println("Promoted");
        else 
            System.out.println("Demoted");  
    }        
} 

