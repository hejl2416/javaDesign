package le.pattern.iterator;

public class Test {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三","001"));
        studentAggregate.addStudent(new Student("李四","002"));
        studentAggregate.addStudent(new Student("王五","003"));
        studentAggregate.addStudent(new Student("赵六","004"));

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
