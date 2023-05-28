package le.pattern.proxy.jdk;

//火车站 火车站具有买票功能
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
