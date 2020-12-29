import java.util.Scanner;
class even_odd_array{
    public static void main(String args[])
    {
        int n,e=0,o=0,A[],B[],C[];
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n=ss.nextInt();
        A=new int[n];
        B=new int[n];
        C=new int[n];
        System.out.println("Enter the values of array A: \n");
        for(int i=0;i<n;i++)
        {
            System.out.printf("A[%d] = ",i+1);
            A[i]=ss.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(A[i]%2==0)
                C[e++]=A[i];
            else
                B[o++]=A[i];
        }
        System.out.println("\nThe elements of array B:");
        for(int i=0;i<o;i++)
            System.out.printf("\nB[%d] = %d",i+1,B[i]);
        System.out.println("\nThe elements of array C:");
        for(int i=0;i<e;i++)
            System.out.printf("\nC[%d] = %d",i+1,C[i]);
        int sum=0,avg,max=C[0],min=C[0];  
        for(int i=0;i<e;i++)
        {
            sum+=C[i];
            if(C[i]>max)
                max=C[i];
            if(C[i]<min)
                min=C[i];    
        }
        avg=sum/e;
        System.out.println("\nThe sum of elements in C: "+sum);
        System.out.println("\nThe average of elements in C: "+avg);
        System.out.println("\nThe maximum in array C: "+max);
        System.out.println("\nThe minimum in array C: "+min);
    }
}