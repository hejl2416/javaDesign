package le.pattern.command;

//资深大厨 是命令的receiver
public class SeniorChef {
    public void makeFood(int num, String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
