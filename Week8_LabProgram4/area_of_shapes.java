abstract class Shape
{
    int side1,side2;
    double area;
    abstract void printArea();
}

class Rectangle extends Shape
{
    Rectangle(int l, int b)
    {
        side1=l;
        side2=b;
    }
    void printArea()
    {
        area=side1*side2;
        System.out.println("The area of the Rectagle is: "+area);
    }
}

class Triangle extends Shape
{
    Triangle(int h, int b)
    {
        side1=h;
        side2=b;
    }
    void printArea()
    {
        area=0.5*side1*side2;
        System.out.println("The Area of the triangle is: "+area);
    }
}

class Circle extends Shape
{
    Circle(int r)
    {
        side1=r;
    }
    void printArea()
    {
        area=3.14*side1*side1;
        System.out.println("The Area of the Circle is: "+area);
    }
}


class ShapeMain
{
    public static void main(String args[])
    {
        Rectangle rect=new Rectangle(5,6);
        rect.printArea();
        Triangle tri=new Triangle(5, 8);
        tri.printArea();
        Circle cir=new Circle(10);
        cir.printArea();
    }
}

