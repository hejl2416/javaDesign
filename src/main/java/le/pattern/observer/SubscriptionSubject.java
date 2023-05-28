package le.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    //存储订阅公众号的微信用户
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }
    }
}
