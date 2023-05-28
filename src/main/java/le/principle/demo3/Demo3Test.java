package le.principle.demo3;

public class Demo3Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Cpu cpu = new IntelCpu();
        computer.setCpu(cpu);
        HardDisk hardDisk=new XiJieHardDisk();
        computer.setHardDisk(hardDisk);
        Memory memory=new KingstonMemory();
        computer.setMemory(memory);

        computer.run();
        computer.getCpu().run();
        computer.getHardDisk().save("哈哈哈");
        System.out.println(computer.getHardDisk().get());
        computer.getMemory().save();
    }
}
