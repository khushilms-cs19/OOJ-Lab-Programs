import java.util.Scanner;

class Matrix
{
    private int i,j,m,n;

    int matr[][]=new int[10][10];
    int matr_tr[][]=new int[10][10];

    Scanner ss=new Scanner(System.in);

    void Accept()
    {
        System.out.println("Enter the Details of the Matrix: ");
        System.out.println("Enter the number of rows: ");
        m=ss.nextInt();
        System.out.println("Enter the number of columns: ");
        n=ss.nextInt();
        for(i=0;i<m;i++)
        {
            System.out.println("Enter the elements of row "+i+": ");
            for(j=0;j<n;j++)
                matr[i][j]=ss.nextInt();
        }
    }

    void Transpose()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                matr_tr[i][j]=matr[j][i];
        }
        System.out.println("***********************************************");
        System.out.println("The Transpose of Matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                System.out.printf(" "+matr_tr[i][j]+" ");
            System.out.printf("\n");    
        }
    }
    void Display()
    {
        System.out.println("***********************************************");
        System.out.println("The Matrix is:");
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                System.out.printf(" "+matr[i][j]+" ");
            System.out.printf("\n");    
        }

    }
}

class MatrixMain
{
    public static void main(String args[])
    {
        Matrix m1=new Matrix();
        m1.Accept();
        m1.Display();
        m1.Transpose();
    }
}