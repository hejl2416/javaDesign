package le.principle.demo4;

public class BaiMaSafetyDoor implements AntiTheft,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("白马安全门能防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("白马安全门能防水");
    }
}
