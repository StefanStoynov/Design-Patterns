package observerPatternExample;

public class Observer implements IObserver{

    @Override
    public void update(int flagValue) {
        System.out.println("flag value changed in observerPatternExample.Subject. New value is: "+ flagValue);
    }
}
