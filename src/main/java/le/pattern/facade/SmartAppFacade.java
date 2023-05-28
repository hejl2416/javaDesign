package le.pattern.facade;

public class SmartAppFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppFacade(){
        light=new Light();
        tv=new TV();
        airCondition=new AirCondition();
    }

    public void say(String msg){
        if (msg.contains("打开")){
            on();
        }else if (msg.contains("关闭")){
            off();
        }else{
            System.out.println("抱歉，我听不懂你说的。。。。");
        }
    }

    public void on() {
        light.on();
        tv.on();
        airCondition.on();
        System.out.println("起床了。。。");
    }

    public void off() {
        light.off();
        tv.off();
        airCondition.off();
        System.out.println("睡觉了。。。");
    }
}
