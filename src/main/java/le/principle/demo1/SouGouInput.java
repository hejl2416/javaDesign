package le.principle.demo1;

public class SouGouInput {
    AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public AbstractSkin getSkin() {
        return skin;
    }

    public void display() {
        skin.display();
    }
}
