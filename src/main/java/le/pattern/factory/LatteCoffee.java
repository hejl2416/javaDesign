package le.pattern.factory;

public class LatteCoffee extends Coffee {

    @Override
    String getName() {
        return "拉丁咖啡";
    }

    @Override
    void addMilk() {
        System.out.println("拉丁咖啡加一升牛奶");
    }

    @Override
    void addSugger() {
        System.out.println("拉丁咖啡加一块糖");
    }
}
