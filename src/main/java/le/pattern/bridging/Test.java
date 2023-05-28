package le.pattern.bridging;

public class Test {
    public static void main(String[] args) {
        Windows windows = new Windows(new AviFile());
        windows.play("葫芦娃");
        Mac mac = new Mac(new RmvbFile());
        mac.play("奥特曼");
    }
}
