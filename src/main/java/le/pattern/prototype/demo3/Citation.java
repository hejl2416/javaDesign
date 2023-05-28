package le.pattern.prototype.demo3;

public class Citation implements Cloneable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学：在2020年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
