package le.pattern.proxy.jdk;

public class Test {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();

        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
