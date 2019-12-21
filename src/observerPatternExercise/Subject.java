package observerPatternExercise;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int myValue;
    private List<IObserver> observerList = new ArrayList<>();

    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        this.observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers(int newValue) {
        for (IObserver observer : observerList) {
            observer.update(this.getClass().getSimpleName(),newValue);
        }
    }
}

