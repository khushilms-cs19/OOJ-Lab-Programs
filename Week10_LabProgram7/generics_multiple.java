import java.util.Scanner; 

class Famous<T,S>
{
    T mem1;
    S mem2;

    Famous(T ob1,S ob2)
    {
        this.mem1=ob1;
        this.mem2=ob2;
    }
    public void displayitems()
    {
        System.out.println("The Value of "+this.mem1+" is: "+this.mem2);
    }
}

class FamousMain
{
    public static void main(String args[])
    {
        Famous <String, String> std1=new Famous<String, String>("Name","Elon Musk");
        Famous <String, Double> std2=new Famous<String, Double>("Net Worth in Billions",127.9);
        Famous <String, Integer> std3=new Famous<String, Integer>("Age",49);
        std1.displayitems();
        std2.displayitems();
        std3.displayitems();
    }
}