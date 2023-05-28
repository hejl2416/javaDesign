package le.principle.demo4;

public class HeiMaSafetyDoor implements AntiTheft,Fireproof,Waterproof{

    @Override
    public void antiTheft() {
        System.out.println("黑马安全门能防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("黑马安全门能防火");
    }

    @Override
    public void waterproof() {
        System.out.println("黑马安全门能防水");
    }
}
