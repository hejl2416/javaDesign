package le.principle.demo3;

public class XiJieHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("XiJieHardDisk保存数据：" + data);
    }

    @Override
    public String get() {
        return "XiJieHardDisk输出数据";
    }
}
