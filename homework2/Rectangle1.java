class Rectangle
{
    int length;
    int breadth;
    Rectangle()
    {
        int length=1;
        int breadth=1;

    }
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int getArea()
    {
        return length*breadth;
    }
    int getPerimeter()
    {
        return 2*(length+breadth);
    }


}
class Rectangle1
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(6,7);
        System.out.println("area of rectangle" + r2.getArea());
        System.out.println("area of rectangle" + r2.getPerimeter());
    }
}