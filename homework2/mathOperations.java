import java.util.*;
class mathOperation
{
    int x,y;
    double  R ;

    void init()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the First value");
        x=input.nextInt();
        System.out.println("Enter the Second  value");
        y=input.nextInt();
    }
    void add()
    {
        int R=x+y;
        System.out.println(" Addition Value = "+R);
    }
    void multiplay()
    {
        int R=x*y;
        System.out.println(" Multiplication Value ="+R);

    }
    void power()
    {
        double R=Math.pow(x,y);
        System.out.println(" Power of "+ x + " and" + y + " = "+R);

    }
}
class mathOperations
{
    public static void main(String[] args)
    {
        mathOperation op= new mathOperation();
        op.init();
        op.add();
        op.multiplay();
        op.power();
    }
}