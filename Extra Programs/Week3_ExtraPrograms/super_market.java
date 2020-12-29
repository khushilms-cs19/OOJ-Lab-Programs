import java.util.Scanner;
class super_market{
    public static void main(String args[])
    {
        double item_price[];
        int item_quantity[];
        int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        n=ss.nextInt();
        item_price=new double[n];
        item_quantity=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the price of item %d : ",i+1);
            item_price[i]=ss.nextDouble();
            System.out.printf("Enter the quantity of item %d : ",i+1);
            item_quantity[i]=ss.nextInt();
        }
        double total=0,discount=0;
        for(int i=0;i<n;i++)
            total+=item_price[i]*item_quantity[i];
        if(total>=10000.0)
        {
            discount=total*0.05;
            System.out.println("Congratulations!! You have received a discount of 5% ");
        }
        else if(total>=7500)
        {
            discount=total*0.03;
            System.out.println("Congratulations!! You have received a discount of 3% ");
        }
        else if(total>=5000)
        {
            discount=total*0.02;
            System.out.println("Congratulations!! You have received a discount of 3% ");
        }
        double after_discount;
        after_discount=total-discount;
        if(discount>0)
            System.out.println("The total amount before discount: "+total);
        System.out.println("The total amount to be paid is: "+after_discount);
    }
}