package le.pattern.singleton;

import java.io.*;

public class SingletonSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    //读取文件中的对象数据-反序列化
    private static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\le\\Desktop\\a.txt"));
        Singleton singleton1 = (Singleton) ois.readObject();
        ois.close();

        System.out.println(singleton1);
    }

    //向文件中写入对象数据-序列化
    private static void writeObject2File() throws IOException {
        //1.创建单例对象
        Singleton singleton = Singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\le\\Desktop\\a.txt"));
        //3.写入对象
        oos.writeObject(singleton);
        //4.释放资源
        oos.close();
    }
}
