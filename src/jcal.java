import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jcal {
    private JPanel jcal;
    private JTextField textdisplay;
    private JButton aCButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;


    double a,b,result;
    String op;

    public jcal() {
        aCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText()+a00Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textdisplay.getText().contains("."))
                {
                    double pm=Double.parseDouble(textdisplay.getText());
                    pm=pm*-1;
                    textdisplay.setText(String.valueOf(pm));
                }else
                {
                    long PM= Long.parseLong(textdisplay.getText());
                    PM=PM*1;
                    textdisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textdisplay.getText().contains("."));
                {
                    textdisplay.setText(textdisplay.getText() + button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            a=Double.parseDouble(textdisplay.getText());
            op="+";
            textdisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textdisplay.getText());
                op="-";
                textdisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textdisplay.getText());
                op="*";
                textdisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textdisplay.getText());
                op="/";
                textdisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;

                if(textdisplay.getText().length() >0)
                {
                    StringBuilder strB=new StringBuilder(textdisplay.getText());
                    strB.deleteCharAt(textdisplay.getText().length()-1);
                    backspace=String.valueOf(strB);
                    textdisplay.setText(backspace);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(textdisplay.getText());

                if(op=="+")
                {
                    result= a+b;
                    textdisplay.setText(String.valueOf(result));
                }else if (op=="-")
                {
                    result=a-b;
                    textdisplay.setText(String.valueOf(result));
                }else if (op=="*")
                {
                    result=a*b;
                    textdisplay.setText(String.valueOf(result));
                }else if (op=="/")
                {
                    result=a/b;
                    textdisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("jcal");
        frame.setContentPane(new jcal().jcal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
