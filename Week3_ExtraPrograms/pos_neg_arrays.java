import java.util.Scanner;
class pos_neg_array{
    public static void main(String args[])
    {
        int nums[];
        int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the value of n= ");
        n=ss.nextInt();
        nums=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("nums[%d] = ",i);
            nums[i]=ss.nextInt();
        }
        int count_pos=0,count_neg=0,count_zero=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
                count_pos+=1;
            else if(nums[i]<0)
                count_neg+=1;
            else 
                count_zero+=1;        
        }
        System.out.println("The number of positive numbers= "+count_pos);
        System.out.println("The number of negative numbers= "+count_neg);
        System.out.println("The number of zeros= "+count_zero);
    }
}