import java.util.Scanner;
import java.util.Arrays;

class ArrayMain
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        double arr[]=new double[args.length];
        int len=args.length;
        System.out.println("The Commandline Arguments are:");
        for(int i=0;i<len;i++)
        {
            System.out.printf(" %d ",args[i]);
            arr[i]=Double.parseDouble(args[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<len;i++)
        {
            System.out.printf(" %d ",arr[i]);
        }
    }
}