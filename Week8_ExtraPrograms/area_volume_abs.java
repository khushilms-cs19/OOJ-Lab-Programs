import java.util.Scanner;
import java.lang.Math;

abstract class Solid
{
    int side1,side2;
    abstract void area();
    abstract void volume();
}

class cylinder extends Solid
{
    cylinder(int h, int r)
    {
        side1=h;
        side2=r;
        area();
        volume();
    }

    void area()
    {
        double Area;
        Area=2*3.14*side2*(side2+side1);
        System.out.println("The Area of the cylinder is: "+Area);
    }

    void volume()
    {
        double Volume;
        Volume=3.14*side2*side2*side1;
        System.out.println("The Volume of the cylinder is: "+Volume);
    }
}

class cone extends Solid
{
    cone(int h, int r)
    {
        side1=h;
        side2=r;
        area();
        volume();
    }

    void area()
    {
        double Area;
        Area=3.14*side2*(side2+Math.sqrt(side1*side1+side2*side2));
        System.out.println("The Area of the code is: "+Area);
    }

    void volume()
    {
        double Volume;
        Volume=(3.14*side2*side2*side1)/3;
        System.out.println("The Volume of the cone is: "+Volume);
    }
}
class sphere extends Solid
{
    sphere(int r)
    {
        side1=r;
        area();
        volume();
    }

    void area()
    {
        double Area;
        Area=4*3.14*side1*side1;
        System.out.println("The Area of the sphere is: "+Area);
    }

    void volume()
    {
        double Volume;
        Volume=(4*3.14*side1*side1*side1)/3;
        System.out.println("The Volume of the sphere is: "+Volume);
    }
}

class FigureMain
{
    public static void main(String args[])
    {
        cylinder cl=new cylinder(10,15);
        cone cn=new cone(10,20);
        sphere sp=new sphere(10);
    }
}