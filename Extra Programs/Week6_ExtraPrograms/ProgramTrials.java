/*class StaticDemo
{
   static int x; //class variable
   
   static void setd(int x1)
   { x=x1;}
   
   static
   {  x=10;
      System.out.println("Inside Static Block x="+x);
   }
    public static void main(String ss[])
    {
      System.out.println("Inside main Block");
	  setd(100);
	  System.out.println("Inside main method:"+x);
    }  
}*/

class StaticDemo
{
   static int x;
   int y=100;
   
   static
   {
      System.out.println("Hello Good Morning");
   }
   
   static void setd(int x1)
   { 
      x=x1; 
	  System.out.println("Inside setd x="+x);
	  //System.out.println("y="+y);
   }
   
   void nonstatic()
   {
	   System.out.println("Inside nonstatic x="+x);
	   System.out.println("Inside nonstatic y="+y);
   }
   
   static
   {
      System.out.println("Inside Static Block");
   }
}

class StaticDemo1
{
   static int m=0,n=0;
    public static void main(String ss[])
    {
        int m=10,x=20;
        {
           int n=30;
           System.out.println("m+n= "+(m+n));

        }
        x=m+n;
        System.out.println(n);
        System.out.println("x= "+x);


      /*System.out.println("Jai Shree Ram!!");
      System.out.println("Inside main Block");
	  StaticDemo.setd(100);
	  System.out.println("x:"+StaticDemo.x);
	  StaticDemo sd=new StaticDemo();
	  System.out.println("y:"+sd.y);
	  sd.nonstatic();*/
	}  
}