import java.awt.*;
import java.awt.event.*;

class NumException extends Exception{
    public String toString()
    {
        return "There is an Arithmetic Exception.";
    }
}
class FormatException extends Exception{
    public String toString()
    {
        return "There is an Format Exception.";
    }
}

public class dividenums extends Frame implements ActionListener{
    TextField num1,num2;
    Button div;
    double result;
    String msg="The result is: 0.0";
    public dividenums()
    {
        setLayout(new FlowLayout());

        Label num1n= new Label("Numerator: ",Label.RIGHT);
        Label num2n= new Label("Denominator: ",Label.RIGHT);
        Button div= new Button("Divide");
        num1=new TextField(5);
        num2=new TextField(5);

        add(num1n);
        add(num1);
        add(num2n);
        add(num2);
        add(div);

        num1.addActionListener(this);
        num2.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public boolean isDouble(double num)
    {
        double dec;
        dec=num-(int)num;
        if(dec==0.0)
            return false;
        else
            return true;
    }
    public double divide(double a, double b) throws NumException, FormatException
    {
        if(b==0.0)
        {
            throw new NumException();
        }
        else if(isDouble(a) || isDouble(b))
        {
            throw new FormatException();
        }
        return (double) a/b;
    }
    public void actionPerformed(ActionEvent ae)
    {
        double a,b;
        a=Double.parseDouble(num1.getText());
        b=Double.parseDouble(num2.getText());
        try{
        result=divide(a,b);
        msg=("The result is: "+result);
        }
        catch(NumException ne)
        {
            msg=ne.toString();
        }
        catch(FormatException fe)
        {
            msg=fe.toString();
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        ResultDialog d=new ResultDialog(this, "Result");
        d.setVisible(true);
    }
    public static void main(String args[])
    {
        dividenums appwin= new dividenums();
    
        appwin.setSize(new Dimension(350,300));
        appwin.setTitle("Divide Two Numbers");
        appwin.setVisible(true);
    }
}
class ResultDialog extends Dialog implements ActionListener{
    dividenums pt;
    ResultDialog(Frame parent,String title)
    {
        super(parent,title,false);
        pt=(dividenums)parent;
        setLayout(new FlowLayout());
        setSize(250,100);
        Button b=new Button("OK");
        add(new Label(pt.msg));
        b.addActionListener(this);
        add(b);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        dispose();
    }
}