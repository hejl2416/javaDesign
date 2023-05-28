package le.pattern.command;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiningTable(1);
        order.getFoodDic().put("西红柿鸡蛋面", 1);
        order.getFoodDic().put("可乐", 2);

        Order order1 = new Order();
        order1.setDiningTable(3);
        order1.getFoodDic().put("尖椒肉丝盖饭", 1);
        order1.getFoodDic().put("雪碧", 3);

        //创建接收者
        SeniorChef receiver = new SeniorChef();
        //将订单和接收者封装成命令对象
        OrderCommand orderCommand1 = new OrderCommand(receiver, order);
        OrderCommand orderCommand2 = new OrderCommand(receiver, order1);

        //创建任务调用者
        Waiter waiter = new Waiter();
        waiter.setCommands(orderCommand1);
        waiter.setCommands(orderCommand2);

        waiter.orderUp();
    }
}
