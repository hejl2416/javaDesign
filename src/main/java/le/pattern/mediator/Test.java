package le.pattern.mediator;

public class Test {
    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediatorStructure = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        Tenant tenant = new Tenant("李四", mediatorStructure);

        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        tenant.contact("需要租三室的房子");
        houseOwner.contact("我有三室的房子，你需要租吗？");
    }
}
