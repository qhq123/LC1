import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeWindow extends JFrame {
    JLabel type;   //种类
    JLabel Length; //长
    JLabel Wide;   //宽
    JLabel High;   //高
    JLabel Weight; //质量

    JComboBox T;  //种类选择

    JTextField Len;
    JTextField Wi;
    JTextField Hi;
    JTextField We;

    JButton OK;     //确定
    JButton cancel; //取消

    public static double L;  //长
    public static double W;  //宽
    public static double H;  //高
    public static double Wei;//质量
    public static String Ty; //种类
    public static int _price; //价钱

    public SpeWindow(){
        setTitle("特殊行李");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,260,280,300);

        type =new JLabel("种类");
        type.setFont(new Font("楷体",Font.BOLD,16));
        type.setBounds(16,10,70,35);
        add(type);

        T = new JComboBox();
        T.addItem("--请选择--");
        T.addItem("免费");
        T.addItem("运动器械");
        T.addItem("其他");
        T.setFont(new Font("楷体",Font.BOLD,15));
        T.setBounds(90,16,130,20);
        T.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ty = (String) T.getSelectedItem();
                System.out.println(Ty);
            }
        });
        add(T);

        Length =new JLabel("长(cm)");
        Length.setFont(new Font("楷体",Font.BOLD,16));
        Length.setBounds(16,50,70,35);
        add(Length);

        Len =new JTextField();
        Len.setBounds(90,59,130,20);
        add(Len);

        Wide =new JLabel("宽(cm)");
        Wide.setFont(new Font("楷体",Font.BOLD,16));
        Wide.setBounds(16,90,60,35);
        add(Wide);

        Wi =new JTextField();
        Wi.setBounds(90,99,130,20);
        add(Wi);

        High =new JLabel("高(cm)");
        High.setFont(new Font("楷体",Font.BOLD,16));
        High.setBounds(16,130,60,35);
        add(High);

        Hi =new JTextField();
        Hi.setBounds(90,139,130,20);
        add(Hi);

        Weight =new JLabel("质量(kg)");
        Weight.setFont(new Font("楷体",Font.BOLD,16));
        Weight.setBounds(10,170,70,35);
        add(Weight);

        We =new JTextField();
        We.setBounds(90,179,130,20);
        add(We);

        OK =new JButton("确定");
        OK.setFont(new Font("楷体",Font.BOLD,16));
        OK.setBounds(40,220,70,20);
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
                            int temp = cal(Ty,Wei);
                            if(temp != -1){
                                _price = temp;
                            }
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
        cancel.setBounds(140,220,70,20);
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

    //特殊行李计算
    public static int cal(String T,double K){
        int price = 0;
        if(T.equals("免费")){
            price = 0;
        }
        else if(T.equals("运动器械")){
            if(K>=2 && K<=23){
                price = 2600;
            }
            else if(K>23 && K<=32){
                price = 3900;
            }
            else if(K>32 && K<=45){
                price = 5200;
            }
            else {
                //JOptionPane.showMessageDialog(null, "不符合托运尺寸", "WARNING",JOptionPane.WARNING_MESSAGE);
                price = -1;
            }
        }
        else if(T.equals("其他")){
            if(K>=2 && K<=23){
                price = 200;
            }
            else if(K>23 && K<=32){
                price = 400;
            }
            else {
                //JOptionPane.showMessageDialog(null, "不符合托运尺寸", "WARNING",JOptionPane.WARNING_MESSAGE);
                price = -1;
            }
        }
        else {
            //JOptionPane.showMessageDialog(null, "请选择类型", "WARNING",JOptionPane.WARNING_MESSAGE);
            price = -1;
        }
        //System.out.println("价钱为:"+price);
        return price;
    }

    public static String getSizes(){
        String size = "长:"+L+" 宽:"+W+" 高:"+H+" 质量:"+Wei+" 价格:"+_price+"\n";
        return size;
    }

    public static int getPrice(){
        return _price;
    }

    public static void main(String[] args) {
        SpeWindow frame = new SpeWindow();
        frame.setVisible(true);
    }
}
