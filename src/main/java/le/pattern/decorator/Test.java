package le.pattern.decorator;

public class Test {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood fastFood = new FriedRice();
        //花费的价格
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost() + "元");

        System.out.println("======================");
        //点一份炒饭加蛋
        FastFood friedRice = new FriedRice();

        friedRice = new Egg(friedRice);
        //花费的价格
        System.out.println(friedRice.getDesc() + "   " + friedRice.cost() + "元");

        System.out.println("======================");
        //点一份炒面加培根
        FastFood friedNoodles = new FriedNoodles();

        friedNoodles = new Bacon(friedNoodles);
        //花费的价格
        System.out.println(friedNoodles.getDesc() + "   " + friedNoodles.cost() + "元");
    }
}
