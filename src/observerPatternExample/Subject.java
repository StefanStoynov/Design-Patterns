package observerPatternExample;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    List<IObserver> observerList = new ArrayList<IObserver>();
    private int myValue;


    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(Observer o) {
    this.observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
    this.observerList.remove(o);
    }

    @Override
    public void notifyObservers(int newValue) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(newValue);
        }
    }
}
