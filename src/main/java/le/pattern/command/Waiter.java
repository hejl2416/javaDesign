package le.pattern.command;

import java.util.ArrayList;

public class Waiter {
    private ArrayList<Command> commands; //可以持有很多的命令对象

    public Waiter() {
        commands = new ArrayList<>();
    }

    public void setCommands(Command cmd) {
        commands.add(cmd);
    }

    //发出命令
    public void orderUp() {
        System.out.println("美女服务员：叮叮，大厨，来新订单了。。。。。");
        for (int i = 0; i < commands.size(); i++) {
            Command command = commands.get(i);
            if (command != null) command.execute();
        }
    }
}
