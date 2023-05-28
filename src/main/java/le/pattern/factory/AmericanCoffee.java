package le.pattern.factory;

public class AmericanCoffee extends Coffee{
    @Override
    String getName() {
        return "美式咖啡";
    }

    @Override
    void addMilk() {
        System.out.println("美式咖啡加一斤牛奶");
    }

    @Override
    void addSugger() {
        System.out.println("美式咖啡加两块糖");
    }
}
