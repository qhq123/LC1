import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LugWindow extends JFrame {
    JLabel Length; //长
    JLabel Wide;   //宽
    JLabel High;   //高
    JLabel Weight; //质量

    JTextField Len;
    JTextField Wi;
    JTextField Hi;
    JTextField We;

    JButton OK;     //确定
    JButton cancel; //取消

    public static double L;
    public static double W;
    public static double H;
    public static double Wei;

    public LugWindow(){
        setTitle("普通行李");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,260,280,300);

        Length =new JLabel("长(cm)");
        Length.setFont(new Font("楷体",Font.BOLD,16));
        Length.setBounds(16,10,70,35);
        add(Length);

        Len =new JTextField();
        Len.setBounds(90,19,130,20);
        add(Len);

        Wide =new JLabel("宽(cm)");
        Wide.setFont(new Font("楷体",Font.BOLD,16));
        Wide.setBounds(16,50,60,35);
        add(Wide);

        Wi =new JTextField();
        Wi.setBounds(90,59,130,20);
        add(Wi);

        High =new JLabel("高(cm)");
        High.setFont(new Font("楷体",Font.BOLD,16));
        High.setBounds(16,90,60,35);
        add(High);

        Hi =new JTextField();
        Hi.setBounds(90,99,130,20);
        add(Hi);

        Weight =new JLabel("质量(kg)");
        Weight.setFont(new Font("楷体",Font.BOLD,16));
        Weight.setBounds(10,130,70,35);
        add(Weight);

        We =new JTextField();
        We.setBounds(90,139,130,20);
        add(We);

        OK =new JButton("确定");
        OK.setFont(new Font("楷体",Font.BOLD,16));
        OK.setBounds(40,180,70,20);
        OK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Len.getText().equals("")||Wi.getText().equals("")||Hi.getText().equals("")||We.getText().equals("")){
                    //JOptionPane.showMessageDialog(null, "请输入完整信息", "WARNING",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if(isNumeric(Len.getText()) && isNumeric(Wi.getText()) && isNumeric(Hi.getText()) && isNumeric(We.getText())){
                        L = Double.valueOf(Len.getText());
                        W = Double.valueOf(Wi.getText());
                        H = Double.valueOf(Hi.getText());
                        Wei = Double.valueOf(We.getText());
                        if(L<=0||W<=0||H<=0||Wei<=0){
                            //JOptionPane.showMessageDialog(null, "输入不可小于或等于零", "WARNING",JOptionPane.WARNING_MESSAGE);
                        }
                        else {
                            dispose();
                        }
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "输入错误", "WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        add(OK);

        cancel =new JButton("取消");
        cancel.setFont(new Font("楷体",Font.BOLD,16));
        cancel.setBounds(140,180,70,20);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Len.setText("");
                Wi.setText("");
                Hi.setText("");
                We.setText("");
            }
        });
        add(cancel);

        setLayout(new BorderLayout());
    }

    //判断输入
    public static boolean isNumeric(String s) {
        Boolean strResult = s.matches("-?[0-9]+.?[0-9]*");
        if(strResult)
            return true;
        else
            return false;
    }

    public static double RL(){
        return L;
    }

    public static double RW(){
        return W;
    }

    public static double RH(){
        return H;
    }

    public static double RWE(){
        return Wei;
    }

    public static void main(String[] args) {
        LugWindow frame = new LugWindow();
        frame.setVisible(true);
    }
}
