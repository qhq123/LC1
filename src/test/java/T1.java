import org.testng.Assert;
import org.testng.annotations.Test;

public class T1 {
    SpeWindow Spe = new SpeWindow();
    Window win = new Window();

    @Test//(enabled=false)
    public void T_cal() {
        System.out.println(1);
        int temp = 0;

        temp = Spe.cal("免费",1);
        Assert.assertEquals(0,temp);
        temp = Spe.cal("免费",10);
        Assert.assertEquals(0,temp);

        temp = Spe.cal("运动器械",2);
        Assert.assertEquals(2600,temp);
        temp = Spe.cal("运动器械",15);
        Assert.assertEquals(2600,temp);
        temp = Spe.cal("运动器械",23);
        Assert.assertEquals(2600,temp);

        temp = Spe.cal("运动器械",28);
        Assert.assertEquals(3900,temp);
        temp = Spe.cal("运动器械",32);
        Assert.assertEquals(3900,temp);

        temp = Spe.cal("运动器械",36);
        Assert.assertEquals(5200,temp);
        temp = Spe.cal("运动器械",45);
        Assert.assertEquals(5200,temp);

        temp = Spe.cal("运动器械",1);
        Assert.assertEquals(-1,temp);
        temp = Spe.cal("运动器械",46);
        Assert.assertEquals(-1,temp);

        temp = Spe.cal("其他",2);
        Assert.assertEquals(200,temp);
        temp = Spe.cal("其他",15);
        Assert.assertEquals(200,temp);
        temp = Spe.cal("其他",23);
        Assert.assertEquals(200,temp);

        temp = Spe.cal("其他",28);
        Assert.assertEquals(400,temp);
        temp = Spe.cal("其他",32);
        Assert.assertEquals(400,temp);

        temp = Spe.cal("其他",1);
        Assert.assertEquals(-1,temp);

        temp = Spe.cal("其他",33);
        Assert.assertEquals(-1,temp);

        temp = Spe.cal("--请选择--",1);
        Assert.assertEquals(-1,temp);
    }

    @Test//(enabled=false)
    public void T_numberPrice() {
        System.out.println(2);
        int temp = 0;

        //区域一
        temp = win.numberPrice("经济舱","区域一",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("经济舱","区域一",2);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("经济舱","区域一",3);
        Assert.assertEquals(1400,temp);
        temp = win.numberPrice("头等舱","区域一",3);
        Assert.assertEquals(1400,temp);
        temp = win.numberPrice("公务舱","区域一",3);
        Assert.assertEquals(1400,temp);

        temp = win.numberPrice("经济舱","区域一",4);
        Assert.assertEquals(3400,temp);
        temp = win.numberPrice("头等舱","区域一",4);
        Assert.assertEquals(3400,temp);
        temp = win.numberPrice("公务舱","区域一",4);
        Assert.assertEquals(3400,temp);

        temp = win.numberPrice("经济舱","区域一",5);
        Assert.assertEquals(6400,temp);
        temp = win.numberPrice("头等舱","区域一",5);
        Assert.assertEquals(6400,temp);
        temp = win.numberPrice("公务舱","区域一",5);
        Assert.assertEquals(6400,temp);

        temp = win.numberPrice("经济舱","区域一",6);
        Assert.assertEquals(9400,temp);
        temp = win.numberPrice("头等舱","区域一",6);
        Assert.assertEquals(9400,temp);
        temp = win.numberPrice("公务舱","区域一",6);
        Assert.assertEquals(9400,temp);

        //区域二
        temp = win.numberPrice("经济舱","区域二",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("经济舱","区域二",2);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("经济舱","区域二",3);
        Assert.assertEquals(1100,temp);
        temp = win.numberPrice("头等舱","区域二",3);
        Assert.assertEquals(1100,temp);
        temp = win.numberPrice("公务舱","区域二",3);
        Assert.assertEquals(1100,temp);

        temp = win.numberPrice("经济舱","区域二",4);
        Assert.assertEquals(2200,temp);
        temp = win.numberPrice("头等舱","区域二",4);
        Assert.assertEquals(2200,temp);
        temp = win.numberPrice("公务舱","区域二",4);
        Assert.assertEquals(2200,temp);

        temp = win.numberPrice("经济舱","区域二",5);
        Assert.assertEquals(3790,temp);
        temp = win.numberPrice("头等舱","区域二",5);
        Assert.assertEquals(3790,temp);
        temp = win.numberPrice("公务舱","区域二",5);
        Assert.assertEquals(3790,temp);

        temp = win.numberPrice("经济舱","区域二",6);
        Assert.assertEquals(5380,temp);
        temp = win.numberPrice("头等舱","区域二",6);
        Assert.assertEquals(5380,temp);
        temp = win.numberPrice("公务舱","区域二",6);
        Assert.assertEquals(5380,temp);

        ////区域三
        temp = win.numberPrice("经济舱","区域三",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("经济舱","区域三",2);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("经济舱","区域三",3);
        Assert.assertEquals(1170,temp);
        temp = win.numberPrice("头等舱","区域三",3);
        Assert.assertEquals(1170,temp);
        temp = win.numberPrice("公务舱","区域三",3);
        Assert.assertEquals(1170,temp);

        temp = win.numberPrice("经济舱","区域三",4);
        Assert.assertEquals(2340,temp);
        temp = win.numberPrice("头等舱","区域三",4);
        Assert.assertEquals(2340,temp);
        temp = win.numberPrice("公务舱","区域三",4);
        Assert.assertEquals(2340,temp);

        temp = win.numberPrice("经济舱","区域三",5);
        Assert.assertEquals(3930,temp);
        temp = win.numberPrice("头等舱","区域三",5);
        Assert.assertEquals(3930,temp);
        temp = win.numberPrice("公务舱","区域三",5);
        Assert.assertEquals(3930,temp);

        temp = win.numberPrice("经济舱","区域三",6);
        Assert.assertEquals(5520,temp);
        temp = win.numberPrice("头等舱","区域三",6);
        Assert.assertEquals(5520,temp);
        temp = win.numberPrice("公务舱","区域三",6);
        Assert.assertEquals(5520,temp);

        //区域四
        temp = win.numberPrice("经济舱","区域四",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("经济舱","区域四",1);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("经济舱","区域四",2);
        Assert.assertEquals(1380,temp);

        temp = win.numberPrice("经济舱","区域四",3);
        Assert.assertEquals(2760,temp);

        temp = win.numberPrice("经济舱","区域四",4);
        Assert.assertEquals(4350,temp);

        temp = win.numberPrice("头等舱","区域四",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("公务舱","区域四",2);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("头等舱","区域四",3);
        Assert.assertEquals(1380,temp);
        temp = win.numberPrice("公务舱","区域四",3);
        Assert.assertEquals(1380,temp);

        temp = win.numberPrice("头等舱","区域四",4);
        Assert.assertEquals(2760,temp);
        temp = win.numberPrice("公务舱","区域四",4);
        Assert.assertEquals(2760,temp);

        temp = win.numberPrice("头等舱","区域四",5);
        Assert.assertEquals(4350,temp);
        temp = win.numberPrice("公务舱","区域四",5);
        Assert.assertEquals(4350,temp);

        //区域五
        temp = win.numberPrice("经济舱","区域五",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("经济舱","区域五",1);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("经济舱","区域五",2);
        Assert.assertEquals(830,temp);

        temp = win.numberPrice("经济舱","区域五",3);
        Assert.assertEquals(1930,temp);

        temp = win.numberPrice("经济舱","区域五",4);
        Assert.assertEquals(3520,temp);

        temp = win.numberPrice("头等舱","区域五",0);
        Assert.assertEquals(0,temp);
        temp = win.numberPrice("公务舱","区域五",2);
        Assert.assertEquals(0,temp);

        temp = win.numberPrice("头等舱","区域五",3);
        Assert.assertEquals(830,temp);
        temp = win.numberPrice("公务舱","区域五",3);
        Assert.assertEquals(830,temp);

        temp = win.numberPrice("头等舱","区域五",4);
        Assert.assertEquals(1930,temp);
        temp = win.numberPrice("公务舱","区域五",4);
        Assert.assertEquals(1930,temp);

        temp = win.numberPrice("头等舱","区域五",5);
        Assert.assertEquals(3520,temp);
        temp = win.numberPrice("公务舱","区域五",5);
        Assert.assertEquals(3520,temp);
    }

    @Test//(enabled=false)
    public void T_commonDomestic() {
        System.out.println(3);
        double temp = 0;

        temp = win.commonDomestic(10,1000,20,"经济舱","婴儿票");
        Assert.assertEquals(0.0,temp);
        temp = win.commonDomestic(1,1000,20,"经济舱","婴儿票");
        Assert.assertEquals(0.0,temp);

        temp = win.commonDomestic(20,1000,30,"经济舱","婴儿票");
        Assert.assertEquals(150.0,temp);
        temp = win.commonDomestic(20,1000,30,"经济舱","婴儿票");
        Assert.assertEquals(150.0,temp);

        temp = win.commonDomestic(10,1000,30,"头等舱","成人票");
        Assert.assertEquals(0.0,temp);
        temp = win.commonDomestic(40,1000,20,"头等舱","成人票");
        Assert.assertEquals(0.0,temp);

        temp = win.commonDomestic(80,1000,30,"头等舱","成人票");
        Assert.assertEquals(150.0,temp);

        temp = win.commonDomestic(10,1000,30,"公务舱","成人票");
        Assert.assertEquals(0.0,temp);
        temp = win.commonDomestic(40,1000,20,"公务舱","成人票");
        Assert.assertEquals(0.0,temp);

        temp = win.commonDomestic(70,1000,30,"公务舱","成人票");
        Assert.assertEquals(150.0,temp);

        temp = win.commonDomestic(10,1000,30,"经济舱","成人票");
        Assert.assertEquals(0.0,temp);
        temp = win.commonDomestic(40,1000,20,"经济舱","成人票");
        Assert.assertEquals(0.0,temp);

        temp = win.commonDomestic(50,1000,20,"经济舱","成人票");
        Assert.assertEquals(150.0,temp);

        temp = win.commonDomestic(50,1000,20,"悦享经济舱","成人票");
        Assert.assertEquals(0.0,temp);
    }

    @Test//(enabled=false)
    public void T_International() {
        System.out.println(4);
        double temp = 0;

        temp = win.International(10,10,10,1,"经济舱","区域一");
        Assert.assertEquals(0.0,temp);

        //区域一
        temp = win.International(20,20,20,2,"头等舱","区域一");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"公务舱","区域一");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,2,"经济舱","区域一");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"悦享经济舱","区域一");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,24,"经济舱","区域一");
        Assert.assertEquals(380.0,temp);
        temp = win.International(20,20,20,24,"悦享经济舱","区域一");
        Assert.assertEquals(380.0,temp);

        temp = win.International(20,20,20,30,"经济舱","区域一");
        Assert.assertEquals(980.0,temp);
        temp = win.International(20,20,20,30,"悦享经济舱","区域一");
        Assert.assertEquals(980.0,temp);

        temp = win.International(120,20,60,2,"经济舱","区域一");
        Assert.assertEquals(980.0,temp);
        temp = win.International(120,20,60,2,"悦享经济舱","区域一");
        Assert.assertEquals(980.0,temp);

        temp = win.International(120,20,60,30,"经济舱","区域一");
        Assert.assertEquals(1440.0,temp);
        temp = win.International(120,20,60,30,"悦享经济舱","区域一");
        Assert.assertEquals(1440.0,temp);

        //区域二
        temp = win.International(20,20,20,2,"头等舱","区域二");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"公务舱","区域二");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,2,"经济舱","区域二");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"悦享经济舱","区域二");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,24,"经济舱","区域二");
        Assert.assertEquals(280.0,temp);
        temp = win.International(20,20,20,24,"悦享经济舱","区域二");
        Assert.assertEquals(280.0,temp);

        temp = win.International(20,20,20,30,"经济舱","区域二");
        Assert.assertEquals(690.0,temp);
        temp = win.International(20,20,20,30,"悦享经济舱","区域二");
        Assert.assertEquals(690.0,temp);

        temp = win.International(120,20,60,2,"经济舱","区域二");
        Assert.assertEquals(690.0,temp);
        temp = win.International(120,20,60,2,"悦享经济舱","区域二");
        Assert.assertEquals(690.0,temp);

        temp = win.International(120,20,60,30,"经济舱","区域二");
        Assert.assertEquals(1100.0,temp);
        temp = win.International(120,20,60,30,"悦享经济舱","区域二");
        Assert.assertEquals(1100.0,temp);

        //区域三
        temp = win.International(20,20,20,2,"头等舱","区域三");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"公务舱","区域三");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,2,"经济舱","区域三");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"悦享经济舱","区域三");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,24,"经济舱","区域三");
        Assert.assertEquals(520.0,temp);
        temp = win.International(20,20,20,24,"悦享经济舱","区域三");
        Assert.assertEquals(520.0,temp);

        temp = win.International(20,20,20,30,"经济舱","区域三");
        Assert.assertEquals(520.0,temp);
        temp = win.International(20,20,20,30,"悦享经济舱","区域三");
        Assert.assertEquals(520.0,temp);

        temp = win.International(120,20,60,2,"经济舱","区域三");
        Assert.assertEquals(520.0,temp);
        temp = win.International(120,20,60,2,"悦享经济舱","区域三");
        Assert.assertEquals(520.0,temp);

        temp = win.International(120,20,60,30,"经济舱","区域三");
        Assert.assertEquals(520.0,temp);
        temp = win.International(120,20,60,30,"悦享经济舱","区域三");
        Assert.assertEquals(520.0,temp);

        //区域四
        temp = win.International(20,20,20,2,"头等舱","区域四");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"公务舱","区域四");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,2,"经济舱","区域四");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"悦享经济舱","区域四");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,24,"经济舱","区域四");
        Assert.assertEquals(690.0,temp);
        temp = win.International(20,20,20,24,"悦享经济舱","区域四");
        Assert.assertEquals(690.0,temp);

        temp = win.International(20,20,20,30,"经济舱","区域四");
        Assert.assertEquals(1040.0,temp);
        temp = win.International(20,20,20,30,"悦享经济舱","区域四");
        Assert.assertEquals(1040.0,temp);

        temp = win.International(120,20,60,2,"经济舱","区域四");
        Assert.assertEquals(1040.0,temp);
        temp = win.International(120,20,60,2,"悦享经济舱","区域四");
        Assert.assertEquals(1040.0,temp);

        temp = win.International(120,20,60,30,"经济舱","区域四");
        Assert.assertEquals(2050.0,temp);
        temp = win.International(120,20,60,30,"悦享经济舱","区域四");
        Assert.assertEquals(2050.0,temp);

        //区域五
        temp = win.International(20,20,20,2,"头等舱","区域五");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"公务舱","区域五");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,2,"经济舱","区域五");
        Assert.assertEquals(0.0,temp);
        temp = win.International(20,20,20,2,"悦享经济舱","区域五");
        Assert.assertEquals(0.0,temp);

        temp = win.International(20,20,20,24,"经济舱","区域五");
        Assert.assertEquals(210.0,temp);
        temp = win.International(20,20,20,24,"悦享经济舱","区域五");
        Assert.assertEquals(210.0,temp);

        temp = win.International(20,20,20,30,"经济舱","区域五");
        Assert.assertEquals(520.0,temp);
        temp = win.International(20,20,20,30,"悦享经济舱","区域五");
        Assert.assertEquals(520.0,temp);

        temp = win.International(120,20,60,2,"经济舱","区域五");
        Assert.assertEquals(520.0,temp);
        temp = win.International(120,20,60,2,"悦享经济舱","区域五");
        Assert.assertEquals(520.0,temp);

        temp = win.International(120,20,60,30,"经济舱","区域五");
        Assert.assertEquals(830.0,temp);
        temp = win.International(120,20,60,30,"悦享经济舱","区域五");
        Assert.assertEquals(830.0,temp);
    }

}
