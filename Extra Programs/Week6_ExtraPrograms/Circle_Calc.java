import java.util.Scanner;

class CircleDemo
{
    private double radius;
    private double area;
    private double perimeter;

    Scanner ss=new Scanner(System.in);

    void accept()
    {
        System.out.println("Enter the Radius of the circle: ");
        radius=ss.nextDouble();
        this.Calculate();
    }

    void Calculate()
    {
        area=3.14*radius*radius;
        perimeter=2*3.14*radius;
    }

    void display()
    {
        System.out.printf("The Area of the Circle is: %.2f",area);
        System.out.printf("\nThe perimeter of the Circle is: %.2f",perimeter);
    }
}

class CircleMain
{
    public static void main(String args[])
    {
        CircleDemo c1=new CircleDemo();
        c1.accept();
        c1.display();
    }

}