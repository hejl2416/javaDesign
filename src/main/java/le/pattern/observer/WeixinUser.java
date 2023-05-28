package le.pattern.observer;

public class WeixinUser implements Observer {
    //用户姓名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "   " + message);
    }
}
