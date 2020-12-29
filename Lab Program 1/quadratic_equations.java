import java.util.Scanner;
import java.lang.Math; 
class quadratic {
    public static void main(String ss[])
    {
        int a,b,c;
        double d,root1,root2;
        Scanner sss= new Scanner(System.in);
        System.out.println("Enter the values of 'a','b' and 'c' of the quadratic equation:");
        a=sss.nextInt();
        b=sss.nextInt();
        c=sss.nextInt();
        System.out.println("The quadratic equation is: "+a+"x2+"+b+"x+"+c);
        d=b*b-(4*a*c);
        if(d>0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots of the quadratic equation are real.");
            System.out.printf("Root 1 = %.4f\n",root1);
            System.out.printf("Root 2 = %.4f",root2);
        }
        else if(d==0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots of the quadratic equation are real and equal.");
            System.out.printf("Root 1 = %.4f\n",root1);
            System.out.printf("Root 2 = %.4f",root2);
        }
        else
        {
            System.out.println("The roots of the quadratic equation are not real.");
        }
    }
}