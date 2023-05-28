package le.principle.demo5;

public class Demo5Test {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star();
        star.setName("范冰冰");
        agent.setStar(star);

        Fans fans=new Fans();
        fans.setName("李易峰");
        agent.setFans(fans);

        Company company = new Company();
        company.setName("华谊兄弟");
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }
}
