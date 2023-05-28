package le.pattern.prototype.demo3;


public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student stu = new Student("张三", "西安");
        citation.setStu(stu);

        //复制奖状
        Citation clone = citation.clone();
        Student stu1 = clone.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("citation和clone是同一个对象：" + (stu == stu1));
        citation.show();
        clone.show();
    }
}
