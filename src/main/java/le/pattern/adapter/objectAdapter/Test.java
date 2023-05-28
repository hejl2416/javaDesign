package le.pattern.adapter.objectAdapter;

import le.pattern.adapter.classAdapter.Computer;
import le.pattern.adapter.classAdapter.SDAdapterTF;
import le.pattern.adapter.classAdapter.SDCardImpl;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("==============================");

        le.pattern.adapter.classAdapter.SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
