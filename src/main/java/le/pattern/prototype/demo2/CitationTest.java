package le.pattern.prototype.demo2;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("张三");

        //复制奖状
        Citation clone = citation.clone();
        clone.setName("李四");

        citation.show();
        clone.show();
    }
}
