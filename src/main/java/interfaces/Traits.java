package interfaces;

public class Traits {

    interface Quackable {
        default void quack(){
            System.out.println("Quack");
        }
    }

    static class Duck implements Quackable{
        String name;
        @Override public void quack() {
            System.out.println("Quack");
        }
    }

    public static void main(String[] args) {
        var duck = new Duck();
        duck.quack();
    }

}
