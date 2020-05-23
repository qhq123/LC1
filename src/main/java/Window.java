import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    JLabel fight;  //航线类型
    JLabel cabin;  //舱型
    JLabel passengers; //旅客类型
    JLabel VIP;    //VIP类型
    JLabel start;  //起点
    JLabel end;    //终点
    JLabel area;   //途径区域
    JLabel price;  //价钱
    JLabel number;  //行李件数

    JComboBox F; //航线类型
    JComboBox C; //舱型
    JComboBox P; //旅客类型
    JComboBox V; //VIP类型
    JComboBox S; //起点
    JComboBox E; //终点
    JComboBox A; //途径区域

    JButton Luggage;  //普通行李
    JButton OK1;      //确认
    JButton special;  //特殊行李
    JButton OK2;      //确认
    JButton calculate; //计算
    JButton cancel1;   //取消
    JButton cancel2;   //取消

    JTextArea ja1;    //普通行李列表
    JTextArea ja2;    //特殊行李列表
    JTextField num;    //行李件数
    JTextArea allP;   //总价
    JTextField money; //价钱输入框

    LugWindow Lug;  //普通行李界面
    SpeWindow Spe;  //特殊行李界面

    public static double finalPrice;
    public static int isTag = 1;
    public static int count = 0;

    double L;  //普通行李的长
    double W;  //普通行李的宽
    double H;  //普通行李的高
    double K;  //普通行李的质量
    String Size = ""; //普通行李尺寸
    double tempPrice=0; //普通行李费用

    String speSize = ""; //特殊行李尺寸
    int spePrice = 0;   //特殊行李价格

    int countPrice; //件数价格

    String _Fight; //航班类型
    String _Cabin; //机舱类型
    String _Passengers; //乘客类型
    String _VIP;  //VIP类型
    String _area; //途径区域
    double _price; //机票价格

    public Window(){
        setTitle("中国航空");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600,200,700,400);

        fight =new JLabel("航班类型");
        fight.setFont(new Font("楷体",Font.BOLD,15));
        fight.setBounds(10,10,70,35);
        add(fight);

        F = new JComboBox();
        F.addItem("--请选择--");
        F.addItem("国内航班");
        F.addItem("国际航班");
        F.setFont(new Font("楷体",Font.BOLD,15));
        F.setBounds(90,16,130,20);
        F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(F.getSelectedItem());
                _Fight = (String) F.getSelectedItem();
            }
        });
        add(F);

        cabin =new JLabel("机舱类型");
        cabin.setFont(new Font("楷体",Font.BOLD,15));
        cabin.setBounds(10,50,70,35);
        add(cabin);

        C = new JComboBox();
        C.addItem("--请选择--");
        C.addItem("头等舱");
        C.addItem("公务舱");
        C.addItem("经济舱");
        C.addItem("悦享经济舱");
        C.setFont(new Font("楷体",Font.BOLD,15));
        C.setBounds(90,56,130,20);
        C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(C.getSelectedItem());
                _Cabin = (String) C.getSelectedItem();
            }
        });
        add(C);

        passengers =new JLabel("乘客类型");
        passengers.setFont(new Font("楷体",Font.BOLD,15));
        passengers.setBounds(10,90,70,35);
        add(passengers);

        P = new JComboBox();
        P.addItem("--请选择--");
        P.addItem("成人票");
        P.addItem("儿童票");
        P.addItem("婴儿票");
        P.setFont(new Font("楷体",Font.BOLD,15));
        P.setBounds(90,96,130,20);
        P.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(P.getSelectedItem());
                _Passengers = (String) P.getSelectedItem();
            }
        });
        add(P);

        VIP =new JLabel("VIP类型");
        VIP.setFont(new Font("楷体",Font.BOLD,15));
        VIP.setBounds(10,130,70,35);
        add(VIP);

        V = new JComboBox();
        V.addItem("--请选择--");
        V.addItem("无");
        V.addItem("凤凰知音终身白金卡、白金卡");
        V.addItem("凤凰知音金卡、银卡");
        V.addItem("星空联盟金卡");
        V.setFont(new Font("楷体",Font.BOLD,15));
        V.setBounds(90,136,130,20);
        V.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(V.getSelectedItem());
                _VIP = (String) V.getSelectedItem();
            }
        });
        add(V);

        start =new JLabel("起点");
        start.setFont(new Font("楷体",Font.BOLD,15));
        start.setBounds(25,170,70,35);
        add(start);

        S = new JComboBox();
        S.addItem("中国大陆");
        S.setFont(new Font("楷体",Font.BOLD,15));
        S.setBounds(90,176,130,20);
        S.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(S.getSelectedItem());

            }
        });
        add(S);

        end =new JLabel("终点");
        end.setFont(new Font("楷体",Font.BOLD,15));
        end.setBounds(25,210,70,35);
        add(end);

        E = new JComboBox();
        E.addItem("中国大陆");
        E.setFont(new Font("楷体",Font.BOLD,15));
        E.setBounds(90,216,130,20);
        E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(E.getSelectedItem());
            }
        });
        add(E);

        area =new JLabel("区域类型");
        area.setFont(new Font("楷体",Font.BOLD,15));
        area.setBounds(10,250,70,35);
        add(area);

        A = new JComboBox();
        A.addItem("--请选择--");
        A.addItem("区域一");
        A.addItem("区域二");
        A.addItem("区域三");
        A.addItem("区域四");
        A.addItem("区域五");
        A.setFont(new Font("楷体",Font.BOLD,15));
        A.setBounds(90,256,130,20);
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(A.getSelectedItem());
                _area = (String) A.getSelectedItem();
            }
        });
        add(A);

        price =new JLabel("价格(元)");
        price.setFont(new Font("楷体",Font.BOLD,15));
        price.setBounds(10,290,70,35);
        add(price);

        money =new JTextField();
        money.setBounds(90,296,130,20);
        add(money);

        number =new JLabel("行李件数");
        number.setFont(new Font("楷体",Font.BOLD,15));
        number.setBounds(10,320,70,35);
        add(number);

        num =new JTextField();
        num.setBounds(90,326,130,20);
        add(num);

        Luggage =new JButton("普通行李");
        Luggage.setFont(new Font("楷体",Font.BOLD,15));
        Luggage.setBounds(270,16,100,20);
        Luggage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Lug = new LugWindow();
                Lug.setVisible(true);
            }
        });
        add(Luggage);

        OK1 =new JButton("单价");
        OK1.setFont(new Font("楷体",Font.BOLD,15));
        OK1.setBounds(380,16,70,20);
        OK1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                L = Lug.RL();
                W = Lug.RW();
                H = Lug.RH();
                K = Lug.RWE();
                ja1.setText("长:"+L+" 宽:"+W+" 高:"+H+" 质量:"+K+"\n");
                double temp = 0;
                if(money.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "请输入机票价格", "WARNING",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if(isNumeric(money.getText())){
                        _price =Double.valueOf(money.getText());
                        if(F.getSelectedItem().equals("--请选择--")||C.getSelectedItem().equals("--请选择--")||P.getSelectedItem().equals("--请选择--")
                                ||V.getSelectedItem().equals("--请选择--")){
                            //JOptionPane.showMessageDialog(null, "请完善需选择的信息", "WARNING",JOptionPane.WARNING_MESSAGE);
                        }
                        else {
                            if(F.getSelectedItem().equals("国内航班")){
                                if(_price==0){
                                    //JOptionPane.showMessageDialog(null, "机票价格不能为0", "WARNING",JOptionPane.WARNING_MESSAGE);
                                }
                                else
                                    temp = Domestic(L,W,H,K,_price,(String) C.getSelectedItem(),(String) P.getSelectedItem(),(String) V.getSelectedItem());
                            }
                            else if(F.getSelectedItem().equals("国际航班")){
                                temp = International(L,W,H,K,(String) C.getSelectedItem(),(String) A.getSelectedItem());
                            }

                            if(isTag==1){
                                Size += "长:"+L+" 宽:"+W+" 高:"+H+" 质量:"+K+"价格:"+temp+"\n";
                                tempPrice +=temp;
                                ja1.setText(Size);
                            }
                            //System.out.println(L+W+H+K);
                        }
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "输入错误", "WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        add(OK1);

        ja1 =new JTextArea();
        ja1.setBounds(270,50,180,200);
        ja1.setBorder(BorderFactory.createLineBorder(Color.gray,3));
        add(ja1);

        special =new JButton("特殊行李");
        special.setFont(new Font("楷体",Font.BOLD,15));
        special.setBounds(490,16,100,20);
        special.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Spe = new SpeWindow();
                Spe.setVisible(true);
            }
        });
        add(special);

        OK2 =new JButton("确认");
        OK2.setFont(new Font("楷体",Font.BOLD,15));
        OK2.setBounds(600,16,70,20);
        OK2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                speSize += Spe.getSizes();
                spePrice += Spe.getPrice();
                ja2.setText(speSize);
                System.out.println(spePrice);
            }
        });
        add(OK2);

        ja2 =new JTextArea();
        ja2.setBounds(490,50,180,200);
        ja2.setBorder(BorderFactory.createLineBorder(Color.gray,3));
        add(ja2);

        cancel1 =new JButton("取消");
        cancel1.setFont(new Font("楷体",Font.BOLD,15));
        cancel1.setBounds(310,270,100,20);
        cancel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ja1.setText("");
                Size = "";
                tempPrice = 0;
                finalPrice = 0;
            }
        });
        add(cancel1);

        cancel2 =new JButton("取消");
        cancel2.setFont(new Font("楷体",Font.BOLD,15));
        cancel2.setBounds(530,270,100,20);
        cancel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ja2.setText("");
                speSize = "";
                spePrice = 0;
                finalPrice = 0;
            }
        });
        add(cancel2);

        calculate =new JButton("总价");
        calculate.setFont(new Font("楷体",Font.BOLD,15));
        calculate.setBounds(420,300,100,20);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(isTrue(num.getText())){
                    count = Integer.valueOf(num.getText()).intValue() ;
                    if(count<0){
                        //JOptionPane.showMessageDialog(null, "输入件数不可小于或等于零", "WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                    System.out.println(count);
                    countPrice = numberPrice((String) C.getSelectedItem(),(String) A.getSelectedItem(), count);
                    finalPrice = spePrice + tempPrice + countPrice;
                    allP.setText(String.valueOf(finalPrice));
                }
                else {
                    //JOptionPane.showMessageDialog(null, "输入错误", "WARNING",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        add(calculate);

        allP =new JTextArea();
        allP.setBounds(420,330,100,20);
        allP.setBorder(BorderFactory.createLineBorder(Color.gray,3));
        add(allP);

        setLayout(new BorderLayout());
    }

    //判断输入
    public static boolean isNumeric(String s) {
        Boolean strResult = s.matches("[0-9]+.?[0-9]*");
        if(strResult)
            return true;
        else
            return false;
    }

    //判断输入为正整数
    public static boolean isTrue(String s) {
        Boolean strResult = s.matches("0?[1-9]*");
        if(strResult)
            return true;
        else
            return false;
    }

    public static int numberPrice(String cabin,String area,int count){
        int res = 0;
        if(area.equals("区域一")){
            if(count<=2){
                res = 0;
            }
            else if((count - 2) == 1){
                res = 1400;
            }
            else if((count - 2) == 2){
                res = 1400+2000;
            }
            else if((count - 2) >= 3){
                res = 1400+2000+(count - 4)*3000;
            }
        }
        else if(area.equals("区域二")){
            if(count<=2){
                res = 0;
            }
            else if((count - 2) == 1){
                res = 1100;
            }
            else if((count - 2) == 2){
                res = 1100+1100;
            }
            else if((count - 2) >= 3){
                res = 1100+1100+(count - 4)*1590;
            }
        }
        else if(area.equals("区域三")){
            if(count<=2){
                res = 0;
            }
            else if((count - 2) == 1){
                res = 1170;
            }
            else if((count - 2) == 2){
                res = 1170+1170;
            }
            else if((count - 2) >= 3){
                res = 1170+1170+(count - 4)*1590;
            }
        }
        else if(area.equals("区域四")){
            if(cabin.equals("经济舱")){
                if(count<=1){
                    res = 0;
                }
                else if((count - 1) == 1){
                    res = 1380;
                }
                else if((count - 1) == 2){
                    res = 1380+1380;
                }
                else if((count - 1) >= 3){
                    res = 1380+1380+(count - 3)*1590;
                }
            }
            else {
                if(count<=2){
                    res = 0;
                }
                else if((count - 2) == 1){
                    res = 1380;
                }
                else if((count - 2) == 2){
                    res = 1380+1380;
                }
                else if((count - 2) >= 3){
                    res = 1380+1380+(count - 4)*1590;
                }
            }
        }
        else if(area.equals("区域五")){
            if(cabin.equals("经济舱")){
                if(count<=1){
                    res = 0;
                }
                else if((count - 1) == 1){
                    res = 830;
                }
                else if((count - 1) == 2){
                    res = 830+1100;
                }
                else if((count - 1) >= 3){
                    res = 830+1100+(count - 3)*1590;
                }
            }
            else {
                if(count<=2){
                    res = 0;
                }
                else if((count - 2) == 1){
                    res = 830;
                }
                else if((count - 2) == 2){
                    res = 830+1100;
                }
                else if((count - 2) >= 3){
                    res = 830+1100+(count - 4)*1590;
                }
            }
        }
        return res;
    }

    //国内普通要求
    public static double commonDomestic(double K,double price,int tag,String cabin,String passengers){
        double res = 0;
        if(passengers.equals("婴儿票")){
            if(K<=10){
                res = 0;
            }
            else {
                res = (K-10)*price*0.015;
            }
        }
        else {
            if(cabin.equals("头等舱")){
                if(K<=40+tag){
                    res = 0;
                }
                else {
                    res = (K-40-tag)*price*0.015;
                }
            }
            else if(cabin.equals("公务舱")){
                if(K<=30+tag){
                    res = 0;
                }
                else {
                    res = (K-30-tag)*price*0.015;
                }
            }
            else if(cabin.equals("经济舱")){
                if(K<=20+tag){
                    res = 0;
                }
                else {
                    res = (K-20-tag)*price*0.015;
                }
            }
            else {
                //JOptionPane.showMessageDialog(null, "该航班不存在此舱型", "WARNING",JOptionPane.WARNING_MESSAGE);
                isTag = 0;
                res = 0;
            }
        }
        return res;
    }

    //国内航线计算
    public static int Domestic(double L,double W,double H,double K,double price,String cabin,String passengers,String VIP){
        double res = 0;
        if(L>0&&L<=100 && W>0&&W<=60 && H>0&&H<=40){
            if(VIP.equals("凤凰知音终身白金卡、白金卡")){
                res = commonDomestic(K, price , 30 , cabin, passengers);
            }
            else if(VIP.equals("凤凰知音金卡、银卡")){
                res = commonDomestic(K, price , 20 , cabin, passengers);
            }
            else if(VIP.equals("星空联盟金卡")){
                res = commonDomestic(K, price , 20 , cabin, passengers);
            }
            else {
                res = commonDomestic(K, price , 0 , cabin, passengers);
            }
            int temp = (int)res;
            isTag = 1;
            return temp;
        }
        else {
            //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
            isTag = 0;
            //System.out.println(11111);
            return 0;
        }
    }

    //国际航线计算
    public static double International(double L,double W,double H,double K,String cabin,String area){
        double res = 0;
        double _size = L+W+H;
        if(_size>=60 && K>=2){
            if(area.equals("区域一")){
                if(cabin.equals("头等舱")||cabin.equals("公务舱")){
                    if(_size<=158 && K<=32){
                        res = 0;
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
                        isTag = 0;
                    }
                }
                else if(cabin.equals("悦享经济舱")||cabin.equals("经济舱")){
                    if(_size<=158 && K<=23){
                        res = 0;
                    }
                    else if(_size<=158 && K>23&&K<=28){
                        res = 380;
                    }
                    else if(_size<=158 && K>28&&K<=32){
                        res = 980;
                    }
                    else if(_size>158&&_size<=203 && K<=23){
                        res = 980;
                    }
                    else {
                        res = 1440;
                    }
                }

            }
            else if(area.equals("区域二")){
                if(cabin.equals("头等舱")||cabin.equals("公务舱")){
                    if(_size<=158 && K<=32){
                        res = 0;
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
                        isTag = 0;
                    }
                }
                else if(cabin.equals("悦享经济舱")||cabin.equals("经济舱")){
                    if(_size<=158 && K<=23){
                        res = 0;
                    }
                    else if(_size<=158 && K>23&&K<=28){
                        res = 280;
                    }
                    else if(_size<=158 && K>28&&K<=32){
                        res = 690;
                    }
                    else if(_size>158&&_size<=203 && K<=23){
                        res = 690;
                    }
                    else {
                        res = 1100;
                    }
                }
            }
            else if(area.equals("区域三")){
                if(cabin.equals("头等舱")||cabin.equals("公务舱")){
                    if(_size<=158 && K<=32){
                        res = 0;
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
                        isTag = 0;
                    }
                }
                else if(cabin.equals("悦享经济舱")||cabin.equals("经济舱")){
                    if(_size<=158 && K<=23){
                        res = 0;
                    }
                    else if(_size<=158 && K>23&&K<=28){
                        res = 520;
                    }
                    else if(_size<=158 && K>28&&K<=32){
                        res = 520;
                    }
                    else if(_size>158&&_size<=203 && K<=23){
                        res = 520;
                    }
                    else {
                        res = 520;
                    }
                }
            }
            else if(area.equals("区域四")){
                if(cabin.equals("头等舱")||cabin.equals("公务舱")){
                    if(_size<=158 && K<=32){
                        res = 0;
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
                        isTag = 0;
                    }
                }
                else if(cabin.equals("悦享经济舱")||cabin.equals("经济舱")){
                    if(_size<=158 && K<=23){
                        res = 0;
                    }
                    else if(_size<=158 && K>23&&K<=28){
                        res = 690;
                    }
                    else if(_size<=158 && K>28&&K<=32){
                        res = 1040;
                    }
                    else if(_size>158&&_size<=203 && K<=23){
                        res = 1040;
                    }
                    else {
                        res = 2050;
                    }
                }
            }
            else if(area.equals("区域五")){
                if(cabin.equals("头等舱")||cabin.equals("公务舱")){
                    if(_size<=158 && K<=32){
                        res = 0;
                    }
                    else {
                        //JOptionPane.showMessageDialog(null, "已超过托运尺寸，请拆分", "WARNING",JOptionPane.WARNING_MESSAGE);
                        isTag = 0;
                    }
                }
                else if(cabin.equals("悦享经济舱")||cabin.equals("经济舱")){
                    if(_size<=158 && K<=23){
                        res = 0;
                    }
                    else if(_size<=158 && K>23&&K<=28){
                        res = 210;
                    }
                    else if(_size<=158 && K>28&&K<=32){
                        res = 520;
                    }
                    else if(_size>158&&_size<=203 && K<=23){
                        res = 520;
                    }
                    else {
                        res = 830;
                    }
                }
            }

            isTag = 1;
            return res;
        }
        else {
            //JOptionPane.showMessageDialog(null, "不符合托运尺寸", "WARNING",JOptionPane.WARNING_MESSAGE);
            isTag = 0;
            return 0;
        }
    }

    public static void main(String[] args) {
        Window frame = new Window();
        frame.setVisible(true);
    }
}
