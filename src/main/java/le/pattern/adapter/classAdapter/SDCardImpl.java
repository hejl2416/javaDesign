package le.pattern.adapter.classAdapter;

//SD卡实现类
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sd card read a msg: hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card with msg:" + msg);
    }
}
