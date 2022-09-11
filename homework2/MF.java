class MathFunction
{
    static int multiply(int x,int y)
    {
        return x*y;
    } 
    static double multiply(double x,double y)
    {
        return x*y;
    }
    static double multiply(double x,int y)
    {
        return x*y;
    }
}
class MF
{
    public static void main(String args[])
    {
        MathFunction m1 = new MathFunction();
        System.out.println(m1.multiply(4,3));
        System.out.println(m1.multiply(4.2,3.4));
        System.out.println(m1.multiply(4.2,6));
    }
}