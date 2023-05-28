package le.pattern.facade;

public class Test {
    public static void main(String[] args) {
        SmartAppFacade smartAppFacade = new SmartAppFacade();

        smartAppFacade.say("打开家电");
        System.out.println("===========================================");
        smartAppFacade.say("关闭家电");
    }
}
