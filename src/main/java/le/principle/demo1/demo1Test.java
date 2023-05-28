package le.principle.demo1;

public class demo1Test {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
        DefaultSpecificSkin defaultSpecificSkin = new DefaultSpecificSkin();
        HeimaSpecificSkin heimaSpecificSkin = new HeimaSpecificSkin();

        souGouInput.setSkin(defaultSpecificSkin);
        souGouInput.display();

        souGouInput.setSkin(heimaSpecificSkin);
        souGouInput.display();
    }
}
