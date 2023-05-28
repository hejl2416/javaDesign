package le.pattern.decorator;

//快餐接口-抽象构件角色
public abstract class FastFood {
    private float price;    //菜品价格
    private String desc;    //菜品描述

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost(); //获取价格

}
