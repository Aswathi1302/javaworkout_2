class Swap
{
    int x;
    int y;
    Swap()
    {  
    }
    Swap(int a,int b)
    {
        int x=a;
        int y=b;
    }
    void swapbyval(int x,int y)
    {
        System.out.prinln("before swap x=" + x + "y =" +y);
        int temp =x;
        x=y;
        y=temp;
        System.out.prinln("after swap x=" + x + "y =" +y);
    }
    void swapbyref(Swap val)
    {
        System.out.prinln("before swap x=" + x + "y =" +y);
        int temp;
        temp=val.x;
        x=val.y;
        y=val.temp;
        System.out.prinln("After  swap x=" + val.x + "y =" +val.y); 
    }
    public static void main(String args[])
    {
        Swap sw1=new Swap();
        sw1.swapbyval(56,81);
        Swap sw2=new Swap(56,81);
        sw2.swapbyref(sw2);

    }
}
