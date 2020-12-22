import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener
{
    TextField num1,num2,op,res;
    Button calc;
    double result=0;
    String resString;
    public calculator()
    {
        setLayout(new FlowLayout());
        Label num1l=new Label("Num1: ",Label.RIGHT);
        Label num2l=new Label("Num2: ",Label.RIGHT);
        Label opl=new Label("Operator: ",Label.RIGHT);

        num1=new TextField(10);
        num2=new TextField(10);
        op=new TextField(3);
        res=new TextField(10);
        calc=new Button("Calculate");

        add(num1l);
        add(num1);
        add(num2l);
        add(num2);
        add(opl);
        add(op);
        add(calc);
        add(res);

        num1.addActionListener(this);
        num2.addActionListener(this);
        op.addActionListener(this);
        calc.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        String oper;
        int n1=0,n2=0;
        try{
            n1=Integer.parseInt(num1.getText());
            n2=Integer.parseInt(num2.getText());
            oper=op.getText();
            switch(oper)
            {
                case "+": result=n1+n2;
                            resString=String.valueOf(result);
                break;
                case "-": result=n1-n2;
                            resString=String.valueOf(result);
                break;
                case "/": result=(double)n1/n2;
                            resString=String.valueOf(result);
                break;
                case "*": result=n1*n2;
                            resString=String.valueOf(result);
                break;
                case "%": result=n1%n2;
                            resString=String.valueOf(result);
                break;
                default: resString="Enter a valid Operator.";
                break;
            }
        }
        catch(ArithmeticException ex)
        {
            resString="Arithmetic Exception.";
        }
        catch(NumberFormatException fe)
        {
            resString="Format Exception.";
        }
        res.setText(resString);
    }

    public static void main(String args[])
    {
        calculator appwin= new calculator();
        appwin.setSize(new Dimension(370,300));
        appwin.setTitle("Calculator");
        appwin.setVisible(true);
    }
}