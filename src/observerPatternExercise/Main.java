package observerPatternExercise;

public class Main {
    public static void main(String[] args) {
        Subject1 sub1 = new Subject1();
        Subject sub2 = new Subject();

        IObserver obs1 = new Observer();
        IObserver obs2 = new Observer2();
        IObserver obs3 = new Observer2();

        sub1.register(obs1);
        sub2.register(obs2);
        sub2.register(obs1);
        sub2.register(obs3);

        sub2.setMyValue(30);
        System.out.println();
        sub1.setMyValue(25);

    }
}
