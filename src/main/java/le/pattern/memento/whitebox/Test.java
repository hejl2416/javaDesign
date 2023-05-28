package le.pattern.memento.whitebox;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------大战Boss前--------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        //保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("------------大战Boss后--------------");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("------------恢复状态后---------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
