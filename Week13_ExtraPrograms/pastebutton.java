import java.awt.*;
import java.awt.event.*;

public class pastebutton extends Frame implements ActionListener{
    TextField txt1,txt2;
    Button paste;
    String copy;
    public pastebutton()
    {
        setLayout(new FlowLayout());

        txt1=new TextField(10);
        txt2=new TextField(10);
        paste= new Button("Paste");
        add(txt1);
        add(txt2);
        add(paste);

        txt1.addActionListener(this);
        paste.addActionListener(this);

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
        copy=txt1.getText();
        txt2.setText(copy);
    }

    public static void main(String args[])
    {
        pastebutton appwin= new pastebutton();
        appwin.setSize(new Dimension(350,300));
        appwin.setTitle("CopyPasta");
        appwin.setVisible(true);
    }
}

