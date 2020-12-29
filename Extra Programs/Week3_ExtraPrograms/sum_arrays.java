import java.util.Scanner;
class sum_arrays {
    public static void main(String args[]){
    int n;
    int nums[];
    Scanner ss=new Scanner(System.in);
    System.out.println("Enter the value of n= ");
    n=ss.nextInt();
    nums=new int[n];
    int sum_even=0,sum_odd=0;
    for(int i=0;i<n;i++)
    {
        System.out.printf("nums[%d] = ",i);
        nums[i]=ss.nextInt();
    }
    for(int i=0;i<n;)
    {
        sum_even=sum_even+nums[i];
        i+=2;
    }
    for(int i=1;i<n;)
    {
        sum_odd=sum_odd+nums[i];
        i+=2;
    }
    System.out.println("The sum of numbers of even indices: "+sum_even);
    System.out.println("The sum of numbers of odd indices: "+sum_odd);
}
}
