package le.pattern.prototype.demo2;

public class Citation implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学：在2020年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
