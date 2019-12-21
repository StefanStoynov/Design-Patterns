package observerPatternExercise;

public class Observer2 implements IObserver {

    @Override
    public void update(String s, int i) {
        System.out.println("Observer2: " + s + " was updated. New value is " + i);
    }
}
