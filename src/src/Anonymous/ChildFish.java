package Anonymous;

public class ChildFish {

    public static void main(String[] args) {

        ParentAbstractFish parentAbstractFish = new ParentAbstractFish() {
            @Override
            public void someMove() {
                System.out.println("Move somewhere");
            }
        };

        Actions actions = new Actions() {
            @Override
            public void doSomething() {
                System.out.println("Do something");
            }
        };

        parentAbstractFish.someMove();
        actions.doSomething();
    }
}
