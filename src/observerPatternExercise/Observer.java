package observerPatternExercise;

public class Observer implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer: " + s + " was updated. New value is " + i);
    }
}
