package observerPatternExample;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new Observer();
        Observer o2 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        sub1.register(o2);
        System.out.println("Setting flag to 5");
        sub1.setMyValue(5);
        System.out.println("Setting flag to 25");
        sub1.setMyValue(25);
        sub1.unregister(o1);
        System.out.println("Setting flag to 50");
        sub1.setMyValue(50);
    }
}
